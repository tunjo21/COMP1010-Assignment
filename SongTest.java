import java.util.ArrayList;

public class SongTest {
    public static void main(String[] args) {
        // Initialize artist and song 
        Artist artist = new Artist("Test Artist", false); // Added isSoloArtist parameter
        Song song = new Song("Test Song", artist, "", 210); // 3 minutes and 30 seconds

        // List to store test results
        ArrayList<String> testResults = new ArrayList<>();

        // Test 1: Length In Seconds Test
        int expectedLength = 210;
        if (song.lengthInSeconds == expectedLength) {
            testResults.add("Length Test: Passed");
        } else {
            testResults.add("Length Test: Failed");
        }

        // Test 2: Artist Type Test
        if (artist.isSolo()) {
        testResults.add("Artist Type Test: Failed (Artist should be a band)");
        } else {
        testResults.add("Artist Type Test: Passed (Artist is a band)");
        }

        // Display test results summary
        System.out.println("\nTest Results:");
        for (String result : testResults) {
            System.out.println(result);
        }
    }
}
