import java.util.*;
public class UniqueString {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.next());
        }
        System.out.print(a);
        for(String i:a)
        {
            if(!b.contains(i))
            {
                b.add(i);
            }
        }
        Collections.sort(b);
        System.out.println(b);


    }

}
