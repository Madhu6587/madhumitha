import java.util.*;  
import java.io.*;  
class ComparatorMain{  
public static void main(String args[]){  
ArrayList<Student3> al=new ArrayList<Student3>();  
al.add(new Student3(101,"Vijay",23));  
al.add(new Student3(106,"Ajay",27));  
al.add(new Student3(105,"Jai",21));  
System.out.println("Sorting by Name");  
Collections.sort(al,new NameComparator());  
for(Student3 st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
System.out.println("sorting by Age");   
Collections.sort(al,new AgeComparator());  
for(Student3 st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  