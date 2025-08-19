public class App {

    static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();    
    }

    static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void main(String[] args) throws Exception {
        Computer musicPlayer = new Computer();

        runMusic(musicPlayer);
        runVideo(musicPlayer);
    }
}
