public class Worker extends Oficers{
    private String level;

    public Worker(String name, String birthDay, String gender, String prodigy, String level) {
        super(name, birthDay, gender, prodigy);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+ level;
    }
}
