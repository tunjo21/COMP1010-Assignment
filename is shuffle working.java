
import java.util.*;


public class Playlist {
    public Album album;
    public int songIndex;

    public Playlist(Album album){
        this.album = album;
        this.songIndex=0;
    }

    public void play() {
        Song song = album.AlbumSongs.get(songIndex);
        song.play();
    }

    public void next(){
        if(songIndex == album.AlbumSongs.size()-1 ){
            songIndex = 0;
        }
        else{
        songIndex = songIndex + 1;
        }
    }

    public void previous(){
        if(songIndex == 0 ){
            songIndex = album.AlbumSongs.size() - 1;
        }
        else{
        songIndex = songIndex - 1;
        }
    }

    public void shuffle(){
        Integer[] intArray=new Integer[album.AlbumSongs.size()];
        for(int i=0;i<album.AlbumSongs.size();i++){
            intArray[i]=i;
        }
        List<Integer> intlist=Arrays.asList(intArray);
        Collections.shuffle(intlist);     
        for(int i=0;i<album.AlbumSongs.size();i++){
            album.AlbumSongs.set(i,album.AlbumSongs.get(intlist.get(i)));
        }
    }
}
