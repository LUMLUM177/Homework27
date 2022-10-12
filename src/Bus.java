public class Bus extends Cars {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }


    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    public boolean passVerification() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется.");
        return true;
    }


}