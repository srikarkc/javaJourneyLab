public class Light {
    private Boolean isOn = true;

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off!");
    }

    public Boolean isOn() {
        return isOn;
    }
}