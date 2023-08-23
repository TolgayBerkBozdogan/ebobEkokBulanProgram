import java.util.Scanner;

public class ebobEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("BirinciSayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıy Giriniz: ");
        number2 = input.nextInt();
        int i = 1, e = 1, result1, r1 = 0, a = 1, result2;
        while (i <= number2) {
            result1 = number1 / i;
            result2 = number2 / i;
            if (number1 % i == 0 && number2 % i == 0) {
                r1 = i;
            }
            i++;
        }
        System.out.println("Sayıların Ebobu = " + r1);
        e = (number1*number2)/r1;
        System.out.println("Sayıların Ekoku = " + e);
    }
}
