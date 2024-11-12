public class Truck extends Transport {
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

