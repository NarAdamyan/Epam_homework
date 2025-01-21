package Computer;

public class ComputerDemo {

    public void printParameters(Computer comp) {
        if (comp.getMemory() == -1 || comp.getRAM() == -1) {
            System.out.println("Invalid Computer parameters. Nothing to print.");
            return;
        }
        System.out.println("id = " + comp.getId() + ", memory = " + comp.getMemory() + " TB, RAM = " + comp.getRAM() + " GB");
    }

    public Computer StandartComp(int RAM, int memory) {
        Computer standartComp = new Computer(memory, RAM);
        printParameters(standartComp);
        return standartComp;
    }

    public Computer MegaComp(int RAM, int memory) {
        Computer megaComp = Computer.generateMegaComputer(RAM, memory);
        if (megaComp != null) {
            printParameters(megaComp);
        } else {
            System.out.println("Failed to create Mega Computer due to invalid parameters.");
        }
        return megaComp;
    }
}
