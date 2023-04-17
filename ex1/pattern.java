/**
 * pattern
 */
public class pattern {
    
    public static void main(String[] args) {
        int count=1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count--;
            }
            System.out.println(" ");
        }

    }
}