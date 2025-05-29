import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {

        int n;
        String output = "";
        Scanner inp = new Scanner(System.in);

        n = inp.nextInt();

        if (n >= 1 && n <= 100) {
            if (n % 2 == 1)
                output = "Weird";
            else {
                if (n >= 2 && n <= 5)
                    output = "Not Weird";
                else if (n >= 6 && n <= 20)
                    output = "Weird";
                else
                    output = "Not Weird";
            }
            System.out.println(output);
        } else
            System.out.println("The number is not within the desired values.");

    }
}
