package headFirstDesignPattern.chap1;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("나는 날고있어요!");
    }
}
