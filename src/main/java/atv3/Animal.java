package atv3;
import java.util.Scanner;

public class Animal {
    public String especie;
    public String nome;
    public String raca;
    public String cor;
    Scanner sc = new Scanner(System.in);
    
    public void cadastrarAnimal(){
        System.out.println("\n --- Cadastro Animais ---\n");
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Informe a espécie: ");
        especie = sc.nextLine();
        
        System.out.println("Informe a raça: ");
        raca = sc.nextLine();
        
        System.out.println("Informe a cor: ");
        cor = sc.nextLine();
    }
    
    public void imprimirEspecie(){
        System.out.println("Espécie: " + especie);               
    }
    
    public void imprimirNome(){
        System.out.println("Nome: " + nome);            
    }
    
    public void imprimirRaca(){
        System.out.println("Raça: " + raca);
    }
    
    public void imprimirCor(){
        System.out.println("Cor: " + cor);
    }
    
    public void imprimirDadosAnimal(){
        System.out.println("\n Informações sobre o animal cadastrado: ");
        imprimirEspecie();
        imprimirNome();
        imprimirRaca();
        imprimirCor();
    }
    
}
