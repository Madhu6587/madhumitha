import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        a.add("Mango");
        a.add("Banana");
        a.add("Jerry");
        a.add("Grapes");
        a.add("Jackfruit");
        a.add("Watermelon");
        a.add("Muskmelon");
        a.add(1, "Sorry");
        for (String i : a) {
            System.out.println(i);
        }
        b.add("1");
        b.add("2");
        b.add("3");
        System.out.println(b);
        b.addAll(a);
        System.out.println(b);
        b.retainAll(a);
        System.out.println(b);

//System.out.println(b);
//a.remove(0);
//System.out.println(a);
//b.removeAll(a);
//System.out.println(b);


    }
}
