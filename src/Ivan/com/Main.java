package Ivan.com;
/* 6. Напишите класс BaseConverter для конвертации из градусов по Цельсию в
Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
и делает конвертацию. */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert temperature in Celsius degrees");
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();
	    BaseConverter T = new BaseConverter(t);
	    T.convert(t);
    }
}
