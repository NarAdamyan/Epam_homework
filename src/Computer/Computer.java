//Առաջին խնդիրը պրակտիկ, հետաքրքիր խնդիրա։ Computer կլաս եք սարքում, որի մեջ ամեն հատի համար պետքա գեներացվի իրա id-ն։
// Ամեն id-ն մյուսից պետքա 1-ով մեծ լինի։ Այսինքն ամեն հաջորդ ստեղծված կոմպի id-ն նախորդին գումարած 1-նա։ Ձեր Computer
// կլասը կարա ունենա տարբեր կոնստրուկտորներ օբյեկտ կառուցելու համար, հիշողության մաքսիմում սահմանափակումը 2 TB-ա, իսկ
// RAM-ինը՝ 64 GB։ Ունեցեք Ձեր կլասի մեջ նաև static մեթոդ generateMegaComputer, որը սարքելուց տվյալ սահմանափակումները
// չեն գործում։ Ձեր գրած կլասը պրակտիկ այլ կլասի մեջ կօգտագործեք, որպեսզի վստահ լինեք, որ ճիշտ եք գրել։
package Computer;

public class Computer {
    private int id;
    private int memory;
    private int RAM;
    static int counter = 0;

    public int getMemory() {
        return this.memory;
    }

    public int setMemory(int memory) {
        if (memory < 0 || memory > 2) {
//            System.out.println("Error creating Computer with ID: " + setId(id));
            this.memory = -1;
            return this.memory;
        }
        this.memory = memory;
        return this.memory;
    }

    public int getRAM() {
        return this.RAM;
    }

    public int setRAM(int RAM) {
        if (RAM < 0 || RAM > 64) {
//            System.out.println("Error creating Computer with ID: " + setId(id));
            this.RAM = -1;
            return -1;
        }
        this.RAM = RAM;
        return this.RAM;
    }

    public int getId() {
        return this.id;
    }

    public int setId(int id) {
        return this.id;

    }

    public Computer(int id, int memory, int RAM) {
        counter++;


        this.id = counter;
    }


    public Computer(int memory, int RAM) {
        counter++;
        this.id = counter;
        if (setRAM(RAM) == -1 || setMemory(memory) == -1) {
            return;
        }
        counter++;
        this.id = counter;

    }

    public Computer() {
    }


    public static Computer generateMegaComputer(int RAM, int memory) {
        if (RAM < 0 || memory < 0) {
            System.out.println("Error: Invalid parameters. RAM and memory must be non-negative.");
            return null;
        }

        Computer megaComp = new Computer();
        megaComp.RAM = RAM;
        megaComp.memory = memory;
        megaComp.id = ++counter;

        System.out.println("Mega Computer created with ID: " + megaComp.getId() + ", RAM: " + RAM + " GB, Memory: " + memory + " TB");
        return megaComp;
    }


}