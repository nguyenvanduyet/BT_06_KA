import java.util.ArrayList;
import java.util.LinkedList;

public class ManageOficers {
    ArrayList<Oficers>list=new ArrayList<>();
    public void addNewOficers(Oficers oficers){
        list.add(oficers);
    }
    public void tesName(String name){
        boolean Name =true;
        for (int i = 0; i < list.size(); i++) {
            Oficers oficers=list.get(i);
            Name=oficers.getName().equals(name);
            if (Name){
                System.out.println(oficers);
            }
            }
        if (!Name){
            System.out.println("không có trong danh sách cán bộ");
        }
    }

}
