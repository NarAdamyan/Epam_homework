package Cars;

public abstract class car extends Motor implements Drive {
    private String model;
    protected Boolean gasSupport;

    public car(String model, String motor,Boolean gasSupport) {
        super(motor);
        if (model.isEmpty()) return;
        this.model = model;
        this.gasSupport=gasSupport;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void start() {
        System.out.println("started");
    }

    public void stop() {
        System.out.println("stopped");
    }

    public void switchToGas(){
        if(this.gasSupport){
            System.out.println("Already in gas");
            return;
        }
        System.out.println("Switched to gas");
    }
}
