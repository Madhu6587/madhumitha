import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.next());
        }
        System.out.println(a);
       // System.out.println(a.size());
        for(String i:a){
            if(i.contains("a") || i.contains("e") || i.contains("i") || i.contains("o") || i.contains("u"))            {
                b.add(i);
            }
            //System.out.println(b);
        }
        System.out.println(b);
        }
    }
   