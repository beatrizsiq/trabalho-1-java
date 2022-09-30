
import calculadora.Calculadora;
import java.util.Scanner;

class Principal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        float num1;
        float num2;
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextFloat();
        
        System.out.println("Soma: " + calculadora.somar(4, 66));
        System.out.println("Subtração: " + calculadora.subtrair(4, 66));
        System.out.println("Multiplicação: " + calculadora.multiplicar(4, 66));
        System.out.println("Divisão: " + calculadora.dividir(4, 66));
    }
}
