class Ab{
   void dd(){
    System.out.println("rrr");
   }
}

class Book extends Ab implements Runnable {
            public void run() {
                for(int i=0;i<=5;i++){
                System.out.println(i);
                try {
                 Thread.sleep(10000); }
                  catch (InterruptedException e)
                  { System.out.println("sleep"); }
                 } } }
public class MultiThread {
     public static void main(String[] args) {
      System.out.println("started"); 
     Book book = new Book();
     Thread t1=new Thread(book);
     book.dd();
    
    t1.start();
    t1.holdsLock(t1);
     for(int i=0;i<=5;i++) 
     { try{ Thread.sleep(2000);
      t1.interrupt();
     } 
     catch(InterruptedException e)
     { 
        e.printStackTrace();
    //System.out.println(t1.isInterrupted()); 
     }
    }

}
}
