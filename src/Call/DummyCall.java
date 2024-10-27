package Call;

public class DummyCall {
    private String callerName;
    private String receiverName;
    private int duration;

    public DummyCall(String callerName, String receiverName, int duration) {
        this.callerName = callerName;
        this.receiverName = receiverName;
        this.duration = duration;
    }
    public DummyCall() {
    }

    public String getCallerName() {
        return this.callerName;
    }

    public String setCallerName(String name) {
        this.callerName=name;
        return this.callerName;
    }

    public String getReceiverName() {
        return this.callerName;
    }

    public String setReceiverName(String name) {
        this.receiverName=name;
        return this.callerName;
    }
    public int getDuration() {
        return this.duration;
    }

    public void createCall(DummyCall call) {
        if (call.getReceiverName() == null || call.getReceiverName() == null) {
            System.out.println("Caller or receiver name is missing.");
            return;
        }
        System.out.println("Caller "+call.callerName+" Receiver "+call.getReceiverName()+" Duration "+call.duration);

    }
    public boolean StartCall(String name){
        setCallerName(name);
        System.out.println("Calling!!!");
        return true;
    }
    public boolean EndCall(String name){
        setReceiverName(name);
        System.out.println("Call ended");

        return false;
    }

}
