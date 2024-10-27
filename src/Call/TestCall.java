package Call;

public class TestCall {
    public static void main(String[] args) {

        DummyCall call = new DummyCall("Narine Adamyan", "Adam Adamyan", 78);
        call.createCall(call);
        DummyCall call1 = new DummyCall();
        call1.setCallerName("nann");
        call1.createCall(call1);
        call1.StartCall("Narine");
        call1.createCall(call1);
        call1.EndCall("Anna");
        call1.createCall(call1);
        DummyAppPro calling=new DummyAppPro();
        calling.StartCall("AAAAAAA");
        calling.addMember("nnnnn");
        calling.Calling(calling);
        calling.members(calling);
        calling.setCamera(true);
        calling.endCall(calling);
        calling.members(calling);
    }
}
