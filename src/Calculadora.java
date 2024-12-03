import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite um valor: ");
        a = sc.nextInt();

        System.out.println("Digite outro valor: ");
        b = sc.nextInt();

        while (true){
            System.out.println("1 = SOMA");
            System.out.println("2 = SUBTRAÇÃO");
            System.out.println("3 = DIVISÃO");
            System.out.println("4 = MULTIPLAÇÃO");

            int menu = 4;


            do {
                menu = sc.nextInt();
                switch (menu){
                    case 1:
                        System.out.printf(" Resultado da Soma é ");
                        System.out.printf("%d + %d = %d\n", a, b, (a + b));
                        break;
                    case 2:
                        System.out.printf(" Resultado da Subtração é ");
                        System.out.printf("%d - %d = %d\n", a, b, (a - b));
                        break;
                    case 3:
                        System.out.printf(" Resultado da Divisão é ");
                        System.out.printf("%d / %d = %d\n", a, b, (a / b));
                        break;
                    case 4:
                        System.out.printf(" Resultado da Multiplicação é ");
                        System.out.printf("%d * %d = %d\n", a, b, (a * b));
                        break;
                    default:
                        System.out.println(" Opção inválida");
                        break;
                }
            }
            while (menu != 4);
        }
    }

}
