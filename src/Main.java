public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Data data1 = new Data("kulakov", "12345", "12345");
//        Data data1 = new Data("kulakov", "12345", "1234");
//        Data data1 = new Data("kulakov@mail.ru", "12345", "1234");
//        Data data1 = new Data("kulakov", "12345:", "1234");

        data1.checkLoginAndPassword(data1.getLogin(), data1.getPassword(), data1.getConfirmPassword());

        Auto audi = new Auto("Audi", "A8", 2.7, false);
        Auto hyundai = new Auto("Hyundai", "Ferrato", 2.3, true);
        Auto lada = new Auto("Lada", "Grande", 1.6, false);
        Auto ford = new Auto("Ford", "Focus", -5.0, true);

        Trucks kamaz = new Trucks("Камаз", "А 30", 18.0, false);
        Trucks sable = new Trucks("Соболь", "М 333", 11.0, true);
        Trucks gazelle = new Trucks("Газель", "Г 3", 9.0, true);
        Trucks zil = new Trucks("ЗИЛ", "З 100", 17.0, true);

        Bus lion = new Bus("Lion", "City", 10);
        Bus city = new Bus("СитиРитм", "10", 9);
        Bus cursor = new Bus("ЛиАЗ", "4292", 8);
        Bus mercedez = new Bus("Mercedez-Benz", "Sprinter II", 7);

        Driver john = new Driver("John", "есть", 5);
        Driver philipp = new Driver("Philipp", "нет", 7);
        Driver elza = new Driver("Elza", "есть", 10);

        System.out.println();
        driverInfo(john, philipp, elza);

        System.out.println();
        verification(audi, hyundai, lada, ford,
                city, lion, cursor, mercedez,
                kamaz, sable, zil, gazelle);

    }

    private static void driverInfo(Driver... drivers) {
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }

    private static void verification(Cars... cars) {
        for (Cars car : cars) {
            passVerification(car);
        }
    }

    private static void passVerification(Cars cars) {
        try {
            if (!cars.passVerification()) {
                throw new PassVerificationException("Диагностика " + cars.getBrand() + " " + cars.getModel() + " не пройдена.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}