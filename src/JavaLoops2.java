import java.util.Scanner;

/**
 * @author Hacer Nur Yavaş - 3 Haziran 2025
 */
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total;
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            //total = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            total = a;
            for (int j = 0; j < n; j++){
                total +=  b * Math.pow(2,j);
                System.out.print(total + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
