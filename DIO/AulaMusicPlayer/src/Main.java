//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Computer computer = new Computer();
            runMusic(computer);
            runVideo(computer);
        }

        public static void runVideo(VideoPlayer videoPlayer){
            videoPlayer.playVideo();
        }

        public static void runMusic(MusicPlayer musicPlayer){
            musicPlayer.playMusic();
        }

    }
