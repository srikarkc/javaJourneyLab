public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Switch lightSwitch = new Switch(light);

        System.out.println("Toggling the switch...");
        lightSwitch.toggle();
        lightSwitch.toggle();
    }
}
