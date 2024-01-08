package poly.car1;

public class K3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void accessAccelerator() {
        System.out.println("K3Car.accessAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car.endEngine");
    }
}
