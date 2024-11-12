public class Bicycle extends Transport {
    @Override
    public void checkEngine() {
        System.out.println("У велосипеда нет двигателя.");
    }

    @Override
    public void checkTrailer() {
        System.out.println("У велосипеда нет прицепа.");
    }


}
