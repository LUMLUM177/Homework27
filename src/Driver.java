public class Driver {

    private String name;
    private String driverLicense;
    private int experience;

    public Driver(String name, String driverLicense, int experience) {
        setName(name);
        setDriverLicense(driverLicense);
        setExperience(experience);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense.equals("есть") || driverLicense.equals("нет")) {
            this.driverLicense = driverLicense;
        } else {
            throw new RuntimeException("Необходимо указать тип прав!");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Информация о водителе: " +
                "ФИО " + name +
                ", наличие лицензии " + getDriverLicense() +
                ", стаж вождения " + experience +
                " лет.";
    }
}