package gsm.poly;

public class Radio implements Remote {
    @Override
    public void volumeUp() {
        System.out.println("라디오 볼륨 업");
    }

    @Override
    public void volumeDown() {
        System.out.println("라디오 볼륨 다운");
    }

    @Override
    public void internet() {
        System.out.println("라디오 인터넷 안됨");
    }
}
