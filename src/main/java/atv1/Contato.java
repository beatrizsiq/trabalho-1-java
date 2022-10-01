package atv1;

import java.util.Scanner;

public class Contato {

    public String nome;
    public String telefone;
    public int idade;
    Scanner sc = new Scanner(System.in);

    public void cadastrarContato() {
        System.out.println("\n---Cadastro ---\n ");
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();

        System.out.println("Informe a idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o telefone: ");
        telefone = sc.nextLine();

    }

    public void imprimirContato() {
        System.out.println("\n - Lista -\n");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
    }

}
