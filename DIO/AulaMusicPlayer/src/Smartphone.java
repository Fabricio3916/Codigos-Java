public  class Smartphone implements VideoPlayer, MusicPlayer {


    @Override
    public void playMusic() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando musica");
    }

    @Override
    public void playVideo() {
        System.out.println("Reproduzindo video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("pausandp video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando video");
    }
}
