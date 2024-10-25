mport java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    Artist artist1 = new Artist("Daft Punk and The Weeknd",true);
    Artist artist2 = new Artist("Keshi",true);
    Artist artist3 = new Artist("Taylor Swift",true);
    Artist artist4 = new Artist("Ariana Grande",true);
    Artist artist5 = new Artist("One Direction",false);
    Artist artist6 = new Artist("Dhruv",true);
    Artist artist7 = new Artist("The Weeknd",true);

    
    ArrayList<Song> song = new ArrayList<Song>();
    song.add(new Song("Starboy", artist1, "Starboy", 3 * 60 + 50));
    song.add(new Song("Starboy", artist1, "Starboy", 3 * 60 + 50)); // length 3:50 -> 230 seconds
    song.add(new Song("Say", artist2, "REQUIEM", 3 * 60 + 2));     // length 3:02 -> 182 seconds
    song.add(new Song("Daylight", artist3, "Lover", 4 * 60 + 55)); // length 4:55 -> 295 seconds
    song.add(new Song("we cant be friends (wait for your love)", artist4, "Eternal Sunshine", 3 * 60 + 48)); // length 3:48 -> 228 seconds
    song.add(new Song("Night Changes", artist5, "Four", 3 * 60 + 52)); // length 3:52 -> 232 seconds
    song.add(new Song("Double Take", artist6, "Single", 2 * 60 + 53)); // length 2:53 -> 173 seconds
    song.add(new Song("What Makes You Beautiful", artist5, "Up All Night", 3 * 60 + 27)); // length 3:27 -> 207 seconds
    song.add(new Song("Steal My Girl", artist5, "Four", 5 * 60 + 19)); // length 5:19 -> 319 seconds
    song.add(new Song("18", artist5, "Four", 4 * 60 + 9)); // length 4:09 -> 249 seconds
    song.add(new Song("You & I", artist5, "Midnight Memories", 4 * 60 + 5)); // length 4:05 -> 245 seconds
    song.add(new Song("Live While We are Young", artist5, "Take Me Home", 3 * 60 + 18)); // length 3:18 -> 198 seconds
    song.add(new Song("Change My Mind", artist5, "Take Me Home", 3 * 60 + 35)); // length 3:35 -> 215 seconds
    song.add(new Song("One of The Girls", artist7, "Cry In Silence", 4 * 60 + 19)); // length 4:19 -> 259 seconds
    song.add(new Song("Blinding Lights", artist7, "After Hours", 4 * 60 + 23)); // length 4:23 -> 263 seconds
    song.add(new Song("After Hours", artist7, "After Hours", 4 * 60 + 23)); // length 4:23 -> 263 seconds
    song.add(new Song("Die For You", artist7, "Starboy", 3 * 60 + 14)); // length 3:14 -> 194 seconds
    song.add(new Song("Dancing In The flame", artist7, "Hurry Up Tomorrow", 4 * 60 + 17)); // length 4:17 -> 257 seconds
    song.add(new Song("Reminder", artist7, "Starboy", 3 * 60 + 51)); // length 3:51 -> 231 seconds

       
    }
    }


