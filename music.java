
interface Playable {
    void play();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player: Playing music");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player: Stopping music");
    }
}


class Radio implements Playable {
    @Override
    public void play() {
        System.out.println("Radio: Playing radio station");
    }

    @Override
    public void stop() {
        System.out.println("Radio: Stopping radio station");
    }
}


public class music {
    public static void main(String[] args) {
      
        MP3Player mp3Player = new MP3Player();
        Radio radio = new Radio();

      
        System.out.println("MP3 Player Actions:");
        mp3Player.play();
        mp3Player.stop();

       
        System.out.println("\nRadio Actions:");
        radio.play();
        radio.stop();
    }
}

