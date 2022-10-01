package atv4;
import java.util.Scanner;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;
    Scanner sc = new Scanner(System.in);
    
    public Funcionario() {
        salario = 1100.00;
    }
    
    public void cadastrarFuncionario(){
        System.out.println("\n --- Cadastro Funcionário --- \n");
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Informe o cargo: ");
        cargo = sc.nextLine();
        
        System.out.println("Informe o salário: ");
        salario += sc.nextDouble();
    }
    
    public void imprimirDadosFuncionario(){
        System.out.println("\n-- Dados do funcionário --\n");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
    
}
