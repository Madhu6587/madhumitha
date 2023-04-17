import java.util.*;
public class ReverseEven {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println(a);
        Collections.reverse(a);
        for(int i : a)
        {
            if(i%2==0)
            {
                b.add(i);
            }
        }
        System.out.print(b);

    }
}
