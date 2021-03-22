import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" write a year");
        int year = input.nextInt();
        leabyearcontrol(year);

    }

    public static void leabyearcontrol(int year) {
        boolean istisna = year % 100 == 0 && year % 400 == 0;
        boolean istisna1 = year % 400 == 0 && year % 4000 == 0;

        if ((year % 4 == 0||istisna==true)&&istisna1==false) {
            System.out.println("this year is leabyear");

        }else System.out.println("not leab year");

    }
}
