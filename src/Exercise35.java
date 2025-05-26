import java.util.Scanner;

public class Exercise35 {

    public static void main(String[] args) {

        //Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9
        Scanner scan = new Scanner(System.in);

        System.out.println("Hur många gånger vill du att den ska räkna?");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i*i + " ");
        }



    }
}
