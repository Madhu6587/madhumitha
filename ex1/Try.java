import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try{
    public static void main(String[] args) {
//int a[]={1,2,3,0,5};
    //    try{
    //         int b=a[0]/a[3];
    //     try{
    //         int c=a[5];
    //     }
    //     catch(ArithmeticException ae)
    //     {
    //         System.out.println("Exception is "+ae);
    //     }
    // }
    //     catch(ArrayIndexOutOfBoundsException e)
    //     {
    //         System.out.println("Array Index is out of Bound");
    //     }

        // try{
        //     Integer in=new Integer(30000);
        //     System.out.println( in.intValue());
        // }
        // catch(ArithmeticException ae)
        // {
        //     System.out.println(ae);
        // }
        // catch(NumberFormatException e)
        // {
        //     System.out.println(e);
        // }
         String s;
         BufferedReader br=new BufferedReader(new FileReader("D:\\madhu\\File.txt"))
        try(br)
        {
        // BufferedReader br=new BufferedReader(new FileReader("D:\\madhu\\File.txt"));
         while((s=br.readLine())!=null)
         {
            System.out.println(s);
         }
         //br.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}