import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int y, x;

        System.out.println("ingresa un numero entero");

        x = op.nextInt();

        System.out.println("ingresa otro numero entero");

        y = op.nextInt();

        Suma evaluar = new Suma();
        evaluar.x = x;
        evaluar.y = y;
        evaluar.mostrarResultado();
    }

}