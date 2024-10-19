package CreateObjects;

public class SmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    public void setIsOn(boolean isON) {
        this.isOn = isON;
    }

    public boolean getIsOn() {
        return isOn;
    }


    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        if (brightness >= 0 && brightness <= 100) {
            return brightness;
        } else {
            return -1;
        }
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public SmartLight(boolean isOn, int brightness, String color) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("PLese enter 0-100 brightness");
            return;
        }
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;

    }

    public void toggle() {
        this.isOn = !this.isOn;
    }


    public void printLightness(SmartLight light) {
        System.out.println("power = " + light.getIsOn());
        System.out.println("color = " + light.getColor());
        System.out.println("brightness = " + light.getBrightness());
    }


}
