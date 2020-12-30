import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ManageOficers manageOficers = new ManageOficers();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. nhập Cán bộ");
            System.out.println("2. tìm cán bộ theo tên");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số cán bộ");
                    int number=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    finByName();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập tên cán bộ");
        String name=sc.nextLine();
        System.out.println("nhập ngày sinh");
        String birthDay=sc1.nextLine();
        System.out.println("nhập giới tính");
        String gender =sc.nextLine();
        System.out.println("nhập địa chỉ ");
        String prodigy = sc1.nextLine();
        System.out.println("nhập cấp bậc");
        String level = sc.nextLine();
        System.out.println("nhập ngành nghề");
        String branch=sc1.nextLine();
        System.out.println("nhập công việc");
        String work=sc.nextLine();
        Worker worker=new Worker(name,birthDay,gender,prodigy,level);
        Engineer engineer =new Engineer(name,birthDay,gender,prodigy,branch);
        Staff staff =new Staff(name,birthDay,gender,prodigy,work);
        Oficers oficers =new Oficers(name,birthDay,gender,prodigy);
        manageOficers.addNewOficers(oficers);
        manageOficers.addNewOficers(worker);

        System.out.println("_________________________________");
    }
    public static void finByName(){
        System.out.println("nhập tên cần tìm");
        String name=sc.nextLine();
        manageOficers.tesName(name);
    }

}
