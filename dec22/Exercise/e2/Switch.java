public class Switch {
    private Light light;
    
    // constructor based dependency-injection
    public Switch(Light light) {
        this.light = light;
    }

    public void toggle() {
        if (light.isOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }

}
