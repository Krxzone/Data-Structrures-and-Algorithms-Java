import java.util.*;
public class hmp {
    public static void main(String[] args) {
        HashMap <Integer ,String> map= new HashMap<>();
        map.put(1,"abc");
        map.put(2,"def");
        map.put(3,"ghi");
        map.put(4,"jkl");
        for (int i=1;i<=map.size();i++)
        {
            System.out.println(map.get(i));
        }
    }
}