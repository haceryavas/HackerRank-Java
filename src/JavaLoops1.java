import java.util.*;

/**
 * @author Hacer Nur Yavaş - 3 Haziran 2025
 */
public class JavaLoops1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}

