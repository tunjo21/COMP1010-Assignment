
   // File: App.java
public class App {
    public static void main(String[] args) {
        // Assume Artist class is implemented with a constructor (String name)

        // Create artist objects
        Artist artist1 = new Artist("Daft Punk and The Weeknd",true);
        Artist artist2 = new Artist("Keshi",true);
        Artist artist3 = new Artist("Taylor Swift",true);
        Artist artist4 = new Artist("Ariana Grande",true);
        Artist artist5 = new Artist("One Direction",false);
        Artist artist6 = new Artist("Dhruv",true);

        // Create song objects with length converted to seconds
        Song song1 = new Song("Starboy", artist1, "Starboy", 3 * 60 + 50); // length 3:50 -> 230 seconds
        Song song2 = new Song("Say", artist2, "REQUIEM", 3 * 60 + 2);     // length 3:02 -> 182 seconds
        Song song3 = new Song("Daylight", artist3, "Lover", 4 * 60 + 55); // length 4:55 -> 295 seconds
        Song song4 = new Song("we cant be friends (wait for your love)", artist4, "Eternal Sunshine", 3 * 60 + 48); // length 3:48 -> 228 seconds
        Song song5 = new Song("Night Changes", artist5, "Four", 3 * 60 + 52); // length 3:52 -> 232 seconds
        Song song6 = new Song("Double Take", artist6, "Single", 2 * 60 + 53); // length 2:53 -> 173 seconds

        // Display song details
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        System.out.println(song3.toString());
        System.out.println(song4.toString());
        System.out.println(song5.toString());
        System.out.println(song6.toString());

        // Simulate playing the songs
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        song5.play();
        song6.play();
    }
}
