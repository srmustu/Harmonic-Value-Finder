import java.util.Scanner;
public class HarmonicValueFinder {
    public static void main(String[] args) {
        Scanner entr = new Scanner(System.in);
        String m1,m2;
        double calculator = 0,value;

        m1 = "Please enter the number whose harmonic value you want to calculate : ";
        m2 = "Result : ";

        System.out.print(m1);
        value = entr.nextInt();

        for (double i = 1; i <= value; i++){
            calculator += (1/i);
        }

        System.out.print(m2 + calculator);
    }
}
