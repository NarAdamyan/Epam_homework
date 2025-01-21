package Computer;

public class testComputer {
    public static void main(String[] args) {
        ComputerDemo demo = new ComputerDemo();

        Computer megaComp1 = demo.MegaComp(128, 3);
        Computer megaComp2 = demo.MegaComp(-2, 3);
        Computer megaComp3 = demo.MegaComp(0, 2);
        Computer comp1 = demo.StandartComp(90, 2);
        Computer comp2 = demo.StandartComp(-2, 2);
        Computer comp3 = demo.StandartComp(64, 2);
    }
}