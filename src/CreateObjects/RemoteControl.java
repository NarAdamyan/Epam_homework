package CreateObjects;


public class RemoteControl {
    public void resetLight(SmartLight StandartLight) {
        StandartLight.setColor("white");
        StandartLight.setBrightness(50);
        StandartLight.setIsOn(false);

    }

    public void getLightStatus(SmartLight light) {
        System.out.println("Is on = " + light.getIsOn() + "\ncolor = " + light.getColor() + "\nBright = " + light.getBrightness());
    }

    public void changeBrightless(SmartLight light, int bright) {
        light.setBrightness(bright);

    }


}


