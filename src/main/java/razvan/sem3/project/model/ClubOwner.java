package razvan.sem3.project.model;

import java.util.ArrayList;
import java.util.List;

public class ClubOwner extends User{

    private List<Venue> venues;
    private List<Event> upcomingEvents;
    private List<Event> pastEvents;

    public ClubOwner(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        this.venues = new ArrayList<>();
        this.upcomingEvents = new ArrayList<>();
        this.pastEvents = new ArrayList<>();
    }


    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return "ClubOwner{" +
                "username='" + super.getUsername() + '\'' +
                ", password='" + super.getPassword() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean addVenue(Venue venue){
        for (Venue v: venues) {
            if(v == venue){
                return false;
            }
        }
        venues.add(venue);
        return true;
    }
    public ClubOwner getClubOwnerByName(String userName){
        if(this.getUsername() == userName){
            return this;
        }
        return null;
    }

    public void createEvent(String name, String location, String username){
        Venue venue = null;
        Event newEvent = null;
        venue = venue.getVenueByLocation(location);
        if(venue != null){
            newEvent = new Event(name, venue, username);
        }
        upcomingEvents.add(newEvent);
    }

}
