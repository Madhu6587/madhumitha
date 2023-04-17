import java.io.*;
import java.util.Objects;
  
class Geek 
{
      
//    // public String name;
// //public int id;
//    // public String email;
//    // public int hash;
//    private final String name;
//    private final String email;
          
//     Geek(String name, String email) 
//     {
              
//         this.name = name;
//         this.email = email;
//       //  this.hash=email.hashCode();
//     }
      
//     @Override
//     public boolean equals(Object obj)
//     {
          
//     // checking if both the object references are 
//     // referring to the same object.
//     if(this == obj)
//             return true;
          
//         // it checks if the argument is of the 
//         // type Geek by comparing the classes 
//         // of the passed argument and this object.
//         // if(!(obj instanceof Geek)) return false; ---> avoid.
//         if(obj == null || obj.getClass()!= this.getClass())
//             return false;
          
//         // type casting of the argument. 
//         Geek geek = (Geek) obj;
          
//         // comparing the state of argument with 
//         // the state of 'this' Object.
//         return (geek.name == this.name && geek.email == this.email);
//     }
      
//     @Override
//     public int hashCode()
//     {
          
//         // We are returning the Geek_id 
//         // as a hashcode value.
//         // we can also return some 
//         // other calculated value or may
//         // be memory address of the 
//         // Object on which it is invoked. 
//         // it depends on how you implement 
//         // hashCode() method.
//         //return this.id;
//         //return this.hash;
//         return Objects.hash(name,email);
//     }
      
// }
  String name;
  String email;
public Geek(String name, String email) {
    this.name = name;
    this.email = email;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Geek other = (Geek) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (email == null) {
        if (other.email != null)
            return false;
    } else if (!email.equals(other.email))
        return false;
    return true;
}
}