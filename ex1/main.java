public class main {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Sr");
        Student s2 = new Student(16, "ey");
        
        StudentImpl sem=new StudentImpl();
        sem.insertStudent(s1);
        sem.insertStudent(s2);

       System.out.println(sem.getAllStudents());
    } 
}






