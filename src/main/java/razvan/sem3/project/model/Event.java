package razvan.sem3.project.model;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private Venue venue;
    private List<Artist> artists;
    private List<Client> clients;
    private ClubOwner owner;

    public Event(String name, Venue venue, String ownerUsername) {
        this.name = name;
        this.venue = venue;
        this.artists = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.owner = owner.getClubOwnerByName(ownerUsername);
    }

    public boolean addParticipant(Client client){
        for (Client c: clients) {
            if(c == client){
                return false;
            }
        }
        clients.add(client);
        return true;
    }
}
