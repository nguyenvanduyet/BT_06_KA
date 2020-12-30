public class Staff extends Oficers{
    private  String work;
    public Staff(String name, String birthDay, String gender, String prodigy,String work) {
        super(name, birthDay, gender, prodigy);
        this.work=work;
    }

    @Override
    public String toString() {
        return super.toString()+work;
    }
}
