import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    // 🔹 Método para llenar la pila
    public Stack<Integer> llenarPila() {
        Stack<Integer> p = new Stack<>();
        boolean seguir = true;

        while (seguir) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            p.push(num);

            System.out.print("¿Desea continuar? (1=Sí / 0=No): ");
            int opt = sc.nextInt();

            if (opt == 0) {
                seguir = false;
            }
        }
        return p;
    }

    // 🔹 Método para procesar la pila
    public Stack<Integer> procesarPila(Stack<Integer> p) {

        Stack<Integer> nueva = new Stack<>();

        while (!p.isEmpty()) {
            int num = p.pop();

            // 🔥 CONDICIONES
            if (num < 0) {
                num = 0;
            } else if (num >= 8 && num <= 20) {
                num = 50;
            } else if (num > 60 && num < 62) {
                num = 100;
            }

            nueva.push(num);
        }

        return nueva;
    }

    // 🔹 Mostrar pila
    public void mostrarPila(Stack<Integer> p) {
        System.out.println("Pila resultante: " + p);
    }
}