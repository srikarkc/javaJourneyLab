import javax.sound.midi.*;

public class MusicTest1 {
  public void play() {
    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      System.out.println("Succesfully got a new sequencer! yaay");
    } catch (MidiUnavailableException e) {
        System.out.println("Too Bad. lol");
      }
  }

  public static void main(String[] args) {
    MusicTest1 mt = new MusicTest1();
    mt.play();
  }
}
