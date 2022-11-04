import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();

        System.out.println("Nhập b:");
        double b = scanner.nextDouble();

        System.out.println("Nhập c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm: " + (-c / b));
            }
        }
        if (a != 0) {
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
            } else if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Phương trình có 02 nghiệm: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
