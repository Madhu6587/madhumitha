public class MemberInner {
    public void msg()
    {
        System.out.println("Hi");
    }
    class Inner{
        public void display(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        MemberInner m=new MemberInner();
        MemberInner.Inner i= m.new Inner();
        m.msg();
        i.display();
    }
}
