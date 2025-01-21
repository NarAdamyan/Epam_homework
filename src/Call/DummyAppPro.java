package Call;

import java.util.ArrayList;
import java.util.List;


class DummyAppPro extends DummyCall {
    private boolean camera;
    private List<String> person;

    public DummyAppPro() {
        super("Unknown", "Unknown", 0); // Default values to prevent issues in superclass
        this.person = new ArrayList<>();

    }
    public String[] getPerson() {
        return person.toArray(new String[0]); // Convert the list to an array and return it
    }

    public DummyAppPro(String name, int duration, boolean camera) {
        super(name, name, duration);
        this.person = new ArrayList<>();
    }

    public boolean getCamera() {
        return this.camera;
    }
    public boolean setCamera(boolean camera) {
        System.out.println("Camera is on "+camera);
        this.camera=camera;
        return  this.camera;

    }
    public void addMember(String name) {
        if (person.size() == 10) { // Only check for the maximum limit
            System.out.println("Max 10 members reached");
            return;
        }
        person.add(name);
        System.out.println("Member " + name + " added. Total members: " + person.size());
    }
    public int getMemberCount() {
        return person.size(); // Return the count of members
    }


    public void members(DummyAppPro call){
        for(int i=0;i<person.size();i++){
            System.out.println("Members: "+person.size());
            System.out.println(person.get(i));}

    }
    public void Calling(DummyAppPro call){
        call.StartCall(call.getCallerName());
        person.add(getCallerName());

    }
    public void endCall(DummyAppPro call) {
        System.out.println("Call ended. Cleaning up resources.");
        person.clear();
        call=null;


    }

    static class DummyAppProMax extends DummyCall {
        private boolean shareScreen;



        public DummyAppProMax(String callerName, String receiverName, int duration, boolean shareScreen) {
            super(callerName, receiverName, duration); // Initialize the superclass
            this.shareScreen = shareScreen; // Initialize the shareScreen attribute
        }

        public boolean getShareScreen() {
            return this.shareScreen;
        }

        public boolean setShareScreen(boolean shareScreen) {
            this.shareScreen = shareScreen;
            return this.shareScreen;
        }

        public void shareControl(DummyAppProMax call) {
            if (call.getReceiverName() == null) {
                System.out.println("No receiver available. Cannot share screen.");
                return;
            }

            // Toggle screen sharing state
            setShareScreen(!this.shareScreen);

            // Optional: Notify the user about the change
            System.out.println("Screen sharing is " + (this.shareScreen ? "enabled" : "disabled") + " for call to " + call.getReceiverName());
        }

        public void displayCallDetails() {
            System.out.println("Caller: " + getCallerName());
            System.out.println("Receiver: " + getReceiverName());
            System.out.println("Duration: " + getDuration() + " seconds");
            System.out.println("Screen Sharing: " + (shareScreen ? "Enabled" : "Disabled"));
        }

    }
}




