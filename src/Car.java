public class Car extends Transport {
    @Override
    public void checkTrailer() {
        System.out.println("У автомобиля нет прицепа");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
