import java.util.*;  
class NameComparator implements Comparator<Student3>{  
public int compare(Student3 s1,Student3 s2){  
return s1.name.compareTo(s2.name);  
}  
}  
