public class Engineer extends Oficers{
    private String branch;

    public Engineer(String name, String birthDay, String gender, String prodigy, String branch) {
        super(name, birthDay, gender, prodigy);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return super.toString()+branch;
    }
}
