package atv2;
import java.util.Scanner;

public class Calculadora{
    float num1;
    float num2;
    Scanner sc = new Scanner(System.in);

    public float somar(float num1, float num2){
        return (num1 + num2);
    }
    public float subtrair(float num1, float num2){
        return (num1 - num2);
    }
    public float multiplicar(float num1, float num2){
        return (num1 * num2);
    }
    public float dividir(float num1, float num2){
        return (num1 / num2);
    }
    
    public void informarValores(){
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextFloat();
    }
    
    public void imprimirOperacoes(){
        System.out.println("\n-- Operações matemáticas --\n");
        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        System.out.println("Divisão: " + dividir(num1, num2));
    }
}