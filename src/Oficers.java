public class Oficers {
    private String name;
    private String birthDay;
    private String gender;
    private String prodigy;

    public Oficers(String name, String birthDay, String gender, String prodigy) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.prodigy = prodigy;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Oficers{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", prodigy='" + prodigy + '\'' +
                '}';
    }
}
