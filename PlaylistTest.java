

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PlaylistTest {
    private Artist artist1;
    private Song song1, song2, song3;
    private Album album;
    private Playlist playlist;

    @BeforeEach
    public void setUp() {
        artist1 = new Artist("Test Artist", true);
        song1 = new Song("Song One", artist1, "Album One", 210);
        song2 = new Song("Song Two", artist1, "Album One", 180);
        song3 = new Song("Song Three", artist1, "Album One", 240);
        
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        
        album = new Album("Test Album", artist1);
        album.AlbumSongs.addAll(songs);
        playlist = new Playlist(album);
    }

    @Test
    public void testPlay() {
        // Capturing output could be done with a custom PrintStream
        playlist.play();
        // Verify that the play method works correctly (you might want to refactor play to return a string)
    }

    @Test
    public void testNext() {
        playlist.next();
        // After calling next, the index should be 1 (second song)
        assertEquals(1, playlist.songIndex);
    }

    @Test
    public void testPrevious() {
        playlist.next(); // Go to song 1
        playlist.previous(); // Go back to song 0
        assertEquals(0, playlist.songIndex);
    }

    @Test
    public void testShuffle() {
        int initialIndex = playlist.songIndex;
        playlist.shuffle();
        // Check if the index changed after shuffle
        assertNotEquals(initialIndex, playlist.songIndex);
    }
}
