public class MusicPlayer {
    private Playlist playlist;

    // setter for dependency injection
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public void playMusic() {
        if (playlist != null && !playlist.getSongs().isEmpty()) {
            System.out.println("Playing music:");
            for (String song:playlist.getSongs()) {
                System.out.println(" - " + song);
            }
        } else {
            System.out.println("No songs in the playlist.");
        }
    }
}
