package razvan.sem3.project.data;

import razvan.sem3.project.model.Artist;
import razvan.sem3.project.model.Client;
import razvan.sem3.project.model.ClubOwner;
import razvan.sem3.project.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDataStore {
    private final List<User> users = new ArrayList<>();

    public FakeDataStore() {
        users.add(new Artist("artist1", "1234", "Razvan", "Simion"));
        users.add(new Artist("artist2", "1234", "Max", "Smith"));
        users.add(new Client("client1", "1234", "Ann", "Johnson"));
        users.add(new Client("client2", "1234", "Joe", "Winslet"));
        users.add(new ClubOwner("owner1", "1234", "Nick", "Presley"));
        users.add(new ClubOwner("owner2", "1234", "George", "Black"));
    }

    public List<Artist> getArtists() {
        List<Artist> artists = new ArrayList<>();
        for (User u: users) {
            if(u instanceof Artist){
                artists.add((Artist) u);
            }
        }
        if(artists != null){
            return artists;
        }
        return null;
    }

    public User getArtistByUsername(String username){
        for (User a: users) {
            if(a instanceof Artist && a.getUsername() == username)
                return a;
        }
        return null;
    }


}
