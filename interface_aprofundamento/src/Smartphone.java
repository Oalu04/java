public class Smartphone implements VideoPlayer, MusicPlayer {

    public void pauseVideo() {
        System.out.println("O Smartphone está pausando o video");

    }

    public void playVideo() {
        System.out.println("O Smartphone está reproduzindo o video");
    }

    public void stopVideo() {
        System.out.println("O Smartphone está parando o video");

    }

    public void pauseMusic() {
        System.out.println("O Smartphone está pausando a musica");

    }

    public void playMusic() {
        System.out.println("O Smartphone está tocando musica");
    }

    public void stopMusic() {
        System.out.println("O Smartphone está parando a musica");

    }

}
