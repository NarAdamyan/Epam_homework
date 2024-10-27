package BuildingCall;

public class Building {
    private int sewage;
    private int energy;

    public int setSewage(int count) {
        if (count > 0) {
            this.sewage = count;
            return this.sewage;
        }
        return -1;
    }
    public int setEnergy(int power) {
        if (power > 0) {
            this.energy = power;
            return this.energy;
        }
        return -1;
    }
    public int getEnergy() {
        return this.energy;
    }
    public int getSewage() {
        return this.sewage;
    }

//    constructors
    public Building(){
    }

    public Building(int sewage,int energy){
        if(getEnergy()<=0 || getSewage()<=0)return;
        getEnergy();
        getSewage();
    }

}