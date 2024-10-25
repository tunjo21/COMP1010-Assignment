import java.util.ArrayList;

public class Album {
    public String title;
    public Artist theArtist;
    public  ArrayList<Song> AlbumSongs;

    public Album(String title, Artist theArtist) {
        this.title = title;
        this.theArtist = theArtist;
        this.AlbumSongs = new ArrayList<>(); // Initialize the list
    }

    public void SoloList(ArrayList<Song> songs){
        //ArrayList<Song> sList = new ArrayList<>();
        for(int i = 0;i<songs.size();i++){
            Song songsScan = songs.get(i);
            Artist artistScan = songsScan.artist;
            if(artistScan.isSolo()){
                AlbumSongs.add(songs.get(i));

            }

        }
       // return sList;         
    }
     
     public void BandList(ArrayList<Song> songs){
        //ArrayList<Song> BList = new ArrayList<>();

        for(int i = 0;i<songs.size();i++){
            Song songsScan = songs.get(i);
            Artist artistScan = songsScan.artist;
            if(!artistScan.isSolo()){
                AlbumSongs.add(songs.get(i));

            }

        }
        //return BList;
     }
     public void GetSongsByArtist(ArrayList<Song> songs,String artistname){
        //ArrayList<Song> AList = new ArrayList<>();

        for(int i = 0;i<songs.size();i++){
            Song songsScan = songs.get(i);
            Artist artistScan = songsScan.artist;
            if(artistScan.getName().compareToIgnoreCase(artistname)==0){
                AlbumSongs.add(songs.get(i));

            }

        }
       // return AList;
     }
}
     
