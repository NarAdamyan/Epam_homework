package CreateObjects;

public class SmartLightDemo {

    public static void main(String[] args) {
        SmartLight light = new SmartLight(true, 100, "black");
        light.printLightness(light);

        light.toggle();
        light.printLightness(light);

        SmartLight light2 = new SmartLight(true, 102, "red");
        light2.printLightness(light2);

        light2.setBrightness(-19);
        light2.printLightness(light2);

        RemoteControl remote = new RemoteControl();
        remote.resetLight(light2);


        light2.printLightness(light2);
        remote.getLightStatus(light2);

        light2.toggle();
        light2.printLightness(light2);


    }
}
