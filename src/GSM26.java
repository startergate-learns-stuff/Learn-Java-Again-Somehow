import gsm.poly.*;

public class GSM26 {
    public static void main(String[] args) {
        Remote remote = new TV();
        remote.volumeUp();
        remote.volumeDown();
        remote.internet();

        remote = new Radio();
        remote.volumeUp();
        remote.volumeDown();
        remote.internet();
    }
}
