public class Auto extends Cars {

    private boolean Verification;

    public Auto(String brand, String model, double engineVolume, boolean verification) {
        super(brand, model, engineVolume);
        this.Verification = verification;
    }

    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    public boolean isVerification() {
        return Verification;
    }

    public boolean passVerification() {
        if (isVerification() == false) {
            throw new RuntimeException("Диагностика " + getBrand() + " " + getModel() + " не пройдена.");
        } else {
            System.out.println("Диагностика " + getBrand() + " " + getModel() + " пройдена успешно.");
        }
        return isVerification();
    }


}
