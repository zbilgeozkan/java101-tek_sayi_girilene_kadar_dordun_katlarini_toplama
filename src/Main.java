// Tek sayı girilene kadar dördün katlarını toplayan program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();

        while (num % 2 == 0) {
            if (num % 4 == 0) {
                sum += num;
            }

            System.out.print("Lütfen bir sayı giriniz: ");
            num = input.nextInt();
        }
        System.out.println("Toplam: " + sum);
    }
}