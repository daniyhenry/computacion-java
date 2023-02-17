import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //variables
        double x = 0;
        double y = 0;
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        double modulo = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));

        //proceso
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;
        modulo = x % y;
        {

            System.out.println("La suma de los numeros es " + suma);
            System.out.println("La resta de los numeros es " + resta);
            System.out.println("La multiplicacion de los numeros es " + multiplicacion);
            System.out.println("La division de los numeros es " + division);
            System.out.println("EL modulo de los numeros es " + modulo);
        }
    }
}