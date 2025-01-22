import java.util.Scanner;

public class Proc_19 {
    /*Описать функцию RingS(R1, R2) вещественного типа,
    находящую площадь кольца, заключенного между двумя окружностями
    с общим центром и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2).
    С ее помощью найти площади трех колец, для которых даны внешние и внутренние радиусы.
    Воспользоваться формулой площади круга радиуса R: S = π·R2. В качестве значения π использовать 3.14.*/
    public static double RingS(double R1, double R2) {
        if (R1 > R2) {
            return 3.14 * (R1 * R1 - R2 * R2);
        } else {
            return 3.14 * (R2 * R2 - R1 * R1);
    }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус кольца: ");
        double R1 = scan.nextDouble();
        System.out.print("Введите радиус кольца: ");
        double R2 = scan.nextDouble();
        System.out.println("Площадь кольца с радиусами " + R1 + " и " + R2 + " = " + RingS(R1, R2));
    }
}

