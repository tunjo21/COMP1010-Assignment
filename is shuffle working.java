
import java.util.*;


public class Playlist {
    public Album album;
    public int songIndex;

    public Playlist(Album album){ // Initialize the list
        this.album = album;
        this.songIndex=0;
    }

    public void play() { // Method to play the song
        Song song = album.AlbumSongs.get(songIndex); // gets the song at the index it is sitting on
        song.play();
    }

    public void next(){ // Method goes to the next song
        if(songIndex == album.AlbumSongs.size()-1 ){// if the next song is the last song on the list goes to the first song
            songIndex = 0;
        }
        else{
        songIndex = songIndex + 1; // Goes to the next song
        }
    }

    public void previous(){ // Method goes to the previous song 
        if(songIndex == 0 ){ // if the previous song is the first song on the list goes to the last song 
            songIndex = album.AlbumSongs.size() - 1;
        }
        else{
        songIndex = songIndex - 1; // Goes to previous song 
        }
    }

    public void shuffle(){ // method shuffles the songs 
        Integer[] intArray=new Integer[album.AlbumSongs.size()]; // Creating an array to hold the song index
        for(int i=0;i<album.AlbumSongs.size();i++){ // creating indexes for the array to hold 
            intArray[i]=i;
        }
        List<Integer> intlist=Arrays.asList(intArray); // making this a list to allow shuffling 
        Collections.shuffle(intlist);     
        for(int i=0;i<album.AlbumSongs.size();i++){ // rearanging song based on index
            album.AlbumSongs.set(i,album.AlbumSongs.get(intlist.get(i)));
        }
    }
}
