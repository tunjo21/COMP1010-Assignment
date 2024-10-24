
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
        Artist artist7 = new Artist("One Direction",false);
        Artist artist8 = new Artist("One Direction",false);
        Artist artist9 = new Artist("One Direction",false);
        Artist artist10 = new Artist("One Direction",false);
        Artist artist11 = new Artist("One Direction",false);
        Artist artist12 = new Artist("One Direction",false);
        Artist artist13 = new Artist("The Weeknd",true);
        Artist artist14 = new Artist("The Weeknd",true);
        Artist artist15 = new Artist("The Weeknd",true);
        Artist artist16 = new Artist("The Weeknd",true);
        Artist artist17 = new Artist("The Weeknd",true);
        Artist artist18 = new Artist("The Weeknd",true);

        // Create song objects with length converted to seconds
        Song song1 = new Song("Starboy", artist1, "Starboy", 3 * 60 + 50); // length 3:50 -> 230 seconds
        Song song2 = new Song("Say", artist2, "REQUIEM", 3 * 60 + 2);     // length 3:02 -> 182 seconds
        Song song3 = new Song("Daylight", artist3, "Lover", 4 * 60 + 55); // length 4:55 -> 295 seconds
        Song song4 = new Song("we cant be friends (wait for your love)", artist4, "Eternal Sunshine", 3 * 60 + 48); // length 3:48 -> 228 seconds
        Song song5 = new Song("Night Changes", artist5, "Four", 3 * 60 + 52); // length 3:52 -> 232 seconds
        Song song6 = new Song("Double Take", artist6, "Single", 2 * 60 + 53); // length 2:53 -> 173 seconds
        Song song7 = new Song("What Makes You Beautiful", artist7, "Up All Night", 3 * 60 + 27); // length 3:50 -> 230 seconds
        Song song8 = new Song("Steal My Girl", artist8, "Four", 5 * 60 + 19);     // length 3:02 -> 182 seconds
        Song song9 = new Song("18", artist9, "Four", 4 * 60 + 9); // length 4:55 -> 295 seconds
        Song song10 = new Song("You & I", artist10, "Midnight Memories", 4 * 60 + 5); // length 3:48 -> 228 seconds
        Song song11 = new Song("Live While We are Young", artist11, "Take Me Home", 3 * 60 + 18); // length 3:52 -> 232 seconds
        Song song12= new Song("Change My Mind", artist12, "Take Me Home", 3 * 60 + 35); // length 2:53 -> 173 seconds
        Song song13 = new Song("One of The Girls", artist13, "Cry In Silence", 4 * 60 + 19); // length 3:50 -> 230 seconds
        Song song14 = new Song("Blinding Lights", artist14, "After Hours", 4 * 60 + 23);     // length 3:02 -> 182 seconds
        Song song15 = new Song("After Hours", artist15, "After Hours", 4 * 60 + 23); // length 4:55 -> 295 seconds
        Song song16 = new Song("Die For You", artist16, "Starboy", 3 * 60 + 14); // length 3:48 -> 228 seconds
        Song song17 = new Song("Dancing In The flame", artist17, "Hurry Up Tomorrow", 4 * 60 + 17); // length 3:52 -> 232 seconds
        Song song18= new Song("Reminder", artist18, "Starboy", 3 * 60 + 51); // length 2:53 -> 173 seconds
        // Display song details
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        System.out.println(song3.toString());
        System.out.println(song4.toString());
        System.out.println(song5.toString());
        System.out.println(song6.toString());
        System.out.println(song7.toString());
        System.out.println(song8.toString());
        System.out.println(song9.toString());
        System.out.println(song10.toString());
        System.out.println(song11.toString());
        System.out.println(song12.toString());
        System.out.println(song13.toString());
        System.out.println(song14.toString());
        System.out.println(song15.toString());
        System.out.println(song16.toString());
        System.out.println(song17.toString());
        System.out.println(song18.toString());

        // Simulate playing the songs
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        song5.play();
        song6.play();
        song7.play();
        song8.play();
        song9.play();
        song10.play();
        song11.play();
        song12.play();
        song13.play();
        song14.play();
        song15.play();
        song16.play();
        song17.play();
        song18.play();
        
    }
}
