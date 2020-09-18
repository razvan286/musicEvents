package razvan.sem3.project.resources;

import razvan.sem3.project.data.FakeDataStore;
import razvan.sem3.project.model.Artist;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

@Path("/artists")
public class ArtistsResources {

    @Context
    private UriInfo uriInfo;
    private static final FakeDataStore fakeDataStore = new FakeDataStore();

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello() {
        String msg = " Hello, your resources work!";
        return Response.ok(msg).build();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllArtists(){
        List<Artist> artists;
        artists = fakeDataStore.getArtists();
        GenericEntity<List<Artist>> entity = new GenericEntity<>(artists) {};
        return Response.ok(entity).build();
    }


    //Not working -- SyntaxError: JSON.parse: unexpected character at line 1 column 1 of the JSON data
    // ????????? how to solve
    @GET  //GET at https://localhost:XXXX/artists/artist1
    @Path("{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getArtistPath(@PathParam("user") String username){
        Artist artist = (Artist)fakeDataStore.getArtistByUsername(username);
        if(artist == null){
            return Response.status(Response.Status.BAD_REQUEST).entity("Please provide a valid artist username").build();
        } else{
            return Response.ok(artist).build();
        }
    }




}
