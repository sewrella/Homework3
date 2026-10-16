import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); {

    // 1 ex loops
    int i = 1;

        while (i <= 1000) {
        System.out.println(i);
        i *= 10;
    }

    // 2 ex with for loop
        for (int b = 1; b <= 1000; b *= 10) {
        System.out.println(b);
    }

    // Print Numbers from 1 to N
        System.out.print("Enter n: ");
    int n = scanner.nextInt();

    // while loop
        System.out.println("Using while loop:");
    i = 1;

        while (i <= n) {
        System.out.print(i + " ");
        i++;
    }

    // do-while loop
        System.out.println("\nUsing do-while loop:");
    i = 1;

        do {
        System.out.print(i + " ");
        i++;
    } while (i <= n);

    // for loop
        System.out.println("\nUsing for loop:");

        for (i = 1; i <= n; i++) {
        System.out.print(i + " ");
    }
    int someValue = 4;
    int factorial = 1;
        while (someValue > 1)  {
        factorial *= someValue;
        someValue--;
    }
        System.out.println(factorial);

    int iVal=80;
        do{
        System.out.println(iVal);
        System.out.println(" * 2 =");
        iVal *=2;
        System.out.println(iVal);
    } while (iVal<25);

    int c=1;
        while (c<100) {
        System.out.println(c);
        c*=2;

        for(int b=1 ; b<100; b*=2)
            System.out.println(b);
    }
}
    }}
