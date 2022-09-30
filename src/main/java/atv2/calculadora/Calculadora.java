// Desenvolva um classe na linguagem de programação Java com nome Calculadora que contenha 
// os métodos: somar, subtrair, dividir e multiplicar. Todos os métodos devem receber dois
// atributos e imprimir o resultado da operação, conforme cada método. Todos os métodos devem ser públicos.

package calculadora;

public class Calculadora{

    public float somar(float num1, float num2){
        return (num1 + num2);
    }
    public float subtrair(float num1, float num2){
        return (num1 - num2);
    }
    public float multiplicar(float num1, float num2){
        return (num1 * num2);
    }
    public static float dividir(float num1, float num2){
        return (num1 / num2);
    }
}