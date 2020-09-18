package razvan.sem3.project.model;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testGetUsername() {
        String expectedValue = "artist1";
        Artist artist = new Artist("artist1", "1234", "Razvan", "Simion");
        assertEquals(expectedValue, artist.getUsername());
    }


}