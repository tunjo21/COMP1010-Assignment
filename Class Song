import java.util.ArrayList;


public class Song {
    public String title; // The name of the song
    public Artist artist; // An Artist object, representing who sang the song
    public String album; // The album the song belongs to, or "Single" 
    public int lengthInSeconds; // Duration of the song in seconds

    // Constructor 
    public Song(String title, Artist artist, String album, int lengthInSeconds) {
        this.title = title; // Assign the song title
        this.artist = artist; // Assign the artist performing the song

        // Set album name
        this.album = (album == null || album.isEmpty()) ? "Single" : album;

        this.lengthInSeconds = lengthInSeconds; // Assign the song duration

        // Add this song title to the artist's list of songs
        this.artist.addSong(this.title);
    }

    // Method to print out details of the song
    public void showDetails() {
        // Convert song length from seconds into minutes and seconds
        int minutes = lengthInSeconds / 60; // Minutes 
        int seconds = lengthInSeconds % 60; // Seconds 

        // Collect the song's details in an ArrayList to print them 
        ArrayList<String> details = new ArrayList<>();
        details.add("Title: " + title); // Add song title to the details list
        details.add("Artist: " + artist.getName()); // Add artist's name
        details.add("Album: " + album); // Add album name
        details.add(String.format("Length: %d:%02d", minutes, seconds)); // Format length 

        // Print detail
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    // Method to simulate playing the song
    public void play() {
        // print out a message showing the song is "playing"
        System.out.println("Playing: " + title + " by " + artist.getName());
    }

    public String toString() {
        // Return a formatted string with key song details
        return String.format("Title: %s, Artist: %s, Album: %s, Length: %d seconds",
                title, artist.getName(), album, lengthInSeconds);
    }
}
