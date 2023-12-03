import java.io.*;
import java.util.Arrays;


public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            System.out.println("One's type: " + oneRestore.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

// class GameCharacter {
//     private final int power;
//     private final String type;
//     private final String[] weapons;

//     public GameCharacter(int power, String type, String[] weapons) {
//         this.power = power;
//         this.type = type;
//         this.weapons = weapons;
//     }

//     public int getPower() {
//         return power;
//     }

//     public String getType() {
//         return type;
//     }

//     public String[] getWeapons() {
//         return weapons;
//     }
// }
