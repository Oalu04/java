public class Computer implements VideoPlayer, MusicPlayer {
    public void pauseVideo() {
        System.out.println("O computador está pausando o video");

    }

    public void playVideo() {
        System.out.println("O computador está reproduzindo o video");
    }

    public void stopVideo() {
        System.out.println("O computador está parando o video");

    }

    public void pauseMusic() {
        System.out.println("O computador está pausando a musica");

    }

    public void playMusic() {
        System.out.println("O computador está tocando musica");
    }

    public void stopMusic() {
        System.out.println("O computador está parando a musica");

    }
}
