import java.util.ArrayList;

public class Album {
    public String title;
    public Artist theArtist;
    public  ArrayList<Song> AlbumSongs;

    public Album(String title, Artist theArtist) {// Initialize the list
        this.title = title;
        this.theArtist = theArtist;
        this.AlbumSongs = new ArrayList<>(); 
    }

    public void SoloList(ArrayList<Song> songs){// An ArrayList that will automatically take any solo songs in the database (songs) 
        for(int i = 0;i<songs.size();i++){ // Going through the song array 
            Song songsScan = songs.get(i); // Getting the song 
            Artist artistScan = songsScan.artist; // Getting the artist information which was made in a diffrent entry 
            if(artistScan.isSolo()){// determining if the artist is solo song
                AlbumSongs.add(songs.get(i)); // add song if it is a solo song

            }

        }
       // return sList;         
    }
     
     public void BandList(ArrayList<Song> songs){ // An ArrayList that will automatically take any band songs in the database (songs)
       for(int i = 0;i<songs.size();i++){ // Going through the song array ( Refer to the Main)
            Song songsScan = songs.get(i);// Getting the song
            Artist artistScan = songsScan.artist; // Getting the artist information which was made in a diffrent entry
            if(!artistScan.isSolo()){ // determining if the artist is a Band Song
                AlbumSongs.add(songs.get(i)); // add song if it is a Band song 

            }

        }
       
     }
     public void GetSongsByArtist(ArrayList<Song> songs,String artistname){ // An ArrayList that will automatically sort songs by artist in the database (songs) 
      for(int i = 0;i<songs.size();i++){  // Going through the song array ( Refer to the Main)
            Song songsScan = songs.get(i); // Getting the song
            Artist artistScan = songsScan.artist; // Getting the artist information which was made in a diffrent entry
            if(artistScan.getName().compareToIgnoreCase(artistname)==0){  // determining if the artist name matches the one choosen by user 
                AlbumSongs.add(songs.get(i));// add song if it by the chosen artist 

            }

        }
       
     }
}
     
