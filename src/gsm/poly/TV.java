package gsm.poly;

public class TV implements Remote {
    @Override
    public void volumeUp() {
        System.out.println("TV 볼륨 업");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV 볼륨 다운");
    }

    @Override
    public void internet() {
        System.out.println("TV 인터넷 됨");
    }
}
