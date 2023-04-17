import java.util.*;

public class Consumer {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("Audi", "Benz", "Amni", "Swipt");
        // cars.add("LLLl");
         cars.stream()
         //.filter(sala->sala.startsWith("A"))
         //.map(a->a.concat(" Car"))
         //.sorted().forEach(name->System.out.println(name));
        // .limit(2).forEach(b->System.out.println(b));
         .skip(2).forEach(b->System.out.println(b));
        /// .forEach(System.out::println);
        //cars.forEach(System.out::println);
    }

}
