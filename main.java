import java.util.Stack;

public class main {
    public static void main(String[] args) {

        metodos m = new metodos();

        Stack<Integer> pila = m.llenarPila();

        Stack<Integer> resultado = m.procesarPila(pila);

        m.mostrarPila(resultado);
    }
}
