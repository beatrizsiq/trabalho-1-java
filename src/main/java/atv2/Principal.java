
import atv2.Calculadora;
import java.util.Scanner;

class Principal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        float num1;
        float num2;
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextFloat();
        
        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));
    }
}
