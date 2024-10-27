import java.util.ArrayList;

public class SongTest {
    public static void main(String[] args) {
        // Initialize artist and song 
        Artist artist = new Artist("Test Artist", true); // Added isSoloArtist parameter
        Song song = new Song("Test Song", artist, "", 210); // 3 minutes and 30 seconds

        // List to store test results
        ArrayList<String> testResults = new ArrayList<>();

        // Test 1: Set Album Method Test
        String newAlbum = "New Album";
        song.album = newAlbum; // Directly setting the album since there's no setAlbum method
        if ("New Album".equals(song.album)) {
            testResults.add("Album Test: Passed");
        } else {
            testResults.add("Album Test: Failed");
        }

        // Test 2: Length In Seconds Test
        int expectedLength = 210;
        if (song.lengthInSeconds == expectedLength) {
            testResults.add("Length Test: Passed");
        } else {
            testResults.add("Length Test: Failed");
        }

        // Display test results summary
        System.out.println("\nTest Results:");
        for (String result : testResults) {
            System.out.println(result);
        }
    }
}
