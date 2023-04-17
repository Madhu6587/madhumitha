import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements E{
        List<Student> list = new ArrayList<>();
    @Override
    public List<Student> getAllStudents() {
       // TODO Auto-generated method stub
       return list;
    } 

    @Override
    public void insertStudent(Student student) {
System.out.println("Inserted");        
list.add(student);
    }

    @Override
    public Student getStudent(int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudent'");
    }

    @Override
    public void deleteStudent(Student student) {
       list.remove(student);
    }
    
}
