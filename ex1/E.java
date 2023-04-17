import java.util.List;

public interface E {
    public List<Student> getAllStudents();
    public void insertStudent(Student student);
    public Student getStudent(int age);
    public void deleteStudent(Student student);
}

