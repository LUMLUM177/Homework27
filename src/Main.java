public class Main {
    public static void main(String[] args) {

        Data data1 = new Data("kulakov", "12345", "12345");
//        Data data1 = new Data("kulakov", "12345", "1234");
//        Data data1 = new Data("kulakov@mail.ru", "12345", "1234");
//        Data data1 = new Data("kulakov", "12345:", "1234");

        data1.checkLoginAndPassword(data1.getLogin(), data1.getPassword(), data1.getConfirmPassword());

        Auto audi = new Auto("Audi", "A8", 2.7, true);
        Auto hyundai = new Auto("Hyundai", "Ferrato", 2.3, true);
        Auto lada = new Auto("Lada", "Grande", 1.6, true);
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
//        Driver philipp = new Driver("Philipp", "", 7);
//        Driver elza = new Driver("Elza", "есть", 10);

        System.out.println();
        city.passVerification();
        lion.passVerification();
        cursor.passVerification();
        mercedez.passVerification();

        System.out.println();
//        System.out.println(john);
//        System.out.println(philipp);
//        System.out.println(elza);

        audi.passVerification();
        hyundai.passVerification();
        lada.passVerification();
        ford.passVerification();

        System.out.println();
        kamaz.passVerification();
        sable.passVerification();
        zil.passVerification();
        gazelle.passVerification();

    }
}