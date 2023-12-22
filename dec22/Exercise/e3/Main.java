public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("Song 1");
        myPlaylist.addSong("Song 2");
        myPlaylist.addSong("Song 3");

        MusicPlayer player = new MusicPlayer();
        player.setPlaylist(myPlaylist);

        player.playMusic();
    }
    
}
