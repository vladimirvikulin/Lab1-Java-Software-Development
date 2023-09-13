import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        try {
            int studentBook = 1106; 
            int C2 = studentBook % 2;  
            int C3 = studentBook % 3;  
            int C5 = studentBook % 5;  
            int C7 = studentBook % 7;
            int C = C3;
            System.out.println("C2:" + C2);
            System.out.println("C3:" + C3);
            System.out.println("C5:" + C5); 
            System.out.println("C7:" + C7);
            System.out.println("C:" + C);
            Scanner in = new Scanner(System.in);
            System.out.print("Input a: ");
            int a = in.nextInt();
            System.out.print("Input b: ");
            int b = in.nextInt();
            System.out.print("Input n (must be > a): ");
            int n = in.nextInt();
            System.out.print("Input m (must be > b): ");
            int m = in.nextInt();
            double S = 0.0; 
         
            if (studentBook <= 1000 || n <= a || m <= b || a <= 0 || b <= 0 || n <= 0 || m <= 0) { 
                System.out.println("Incorrect input data"); 
            } else { 
                for (byte i = (byte)a; i <= n; i++) { // C7 = 0 => byte
                    for (byte j = (byte)b; j <= m; j++) { // C7 = 0 => byte
                        double numerator = ((double)i) / j; //C5 = 1 => /
                        double denominator = i + C; // C2 = 0 => +
                        S += numerator / denominator; 
                    } 
                } 
                System.out.println("Result S:" + S); 
            }   
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
