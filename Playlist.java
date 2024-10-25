public class Playlist {
    public Album album;
    private int songIndex;
    private int  secondsleft;
    private Boolean pause;
    public Playlist(Album album){
        this.album = album;
        this.songIndex=0;
        this.secondsleft=0;
        this.pause=false;
    }

    public void play(){
    for(int i = songIndex; i<album.AlbumSongs.size();i++){
        Song song=album.AlbumSongs.get(i);
        song.play();
        for(int j = secondsleft; j<song.lengthInSeconds;j++){
            System.out.println("Time Left : " + (song.lengthInSeconds-j) + " Seconds " );
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
            }
            if(pause)
            {
              this.songIndex=i;
              this.secondsleft=j; 
              break;
            }
        }
        if(this.pause){
            break;
        }
    }
   
    }
    public void pause()
    {
        this.pause=true;
    }

    public void next(){
        if(songIndex == album.AlbumSongs.size() ){
            songIndex = 0;
        }
        else{
        songIndex = songIndex + 1;
        }
    }

    public void previous(){
        if(songIndex == 0 ){
            songIndex = album.AlbumSongs.size();
        }
        else{
        songIndex = songIndex - 1;
        }
    }

    public void shuffle(){
        songIndex = (int) (Math.random() * album.AlbumSongs.size());        
    }

}
