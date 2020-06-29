import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: ");
        int size = scan.nextInt();
        double[] numbers = new double[size];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }

        for (double number : numbers) {
            System.out.println("liczba: " + number);
            double squaredNumber = number * number;
            System.out.println("do kwadratu: " + squaredNumber);

            sum = squaredNumber + sum;  //sum+=squaredNumber;
        }
        
        System.out.println("suma wszystkich: " + sum);
    }
}

