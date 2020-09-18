package razvan.sem3.project.model;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testGetUsername() {
        String expectedValue = "artist1";
        Artist artist = new Artist("artist1", "1234", "Razvan", "Simion");
        assertEquals(expectedValue, artist.getUsername());
    }

    public void testSetUsername() {
    }

    public void testGetPassword() {
    }

    public void testSetPassword() {
    }

    public void testGetFirstName() {
    }

    public void testSetFirstName() {
    }

    public void testGetLastName() {
    }

    public void testSetLastName() {
    }
}