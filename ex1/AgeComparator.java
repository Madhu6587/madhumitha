import java.util.*;  
class AgeComparator implements Comparator<Student3>{  
public int compare(Student3 s1, Student3 s2){  
 if(s1.age==s2.age)  
 return 0;  
 else if(s1.age>s2.age)  
 return 1;  
 else  
 return -1;  
 } 
//return s1.age-s2.age;
}












