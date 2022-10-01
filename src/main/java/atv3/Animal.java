package atv3;

public class Animal {
    public String especie;
    public String nome;
    public String raca;
    public String cor;
    
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
        imprimirEspecie();
        imprimirNome();
        imprimirRaca();
        imprimirCor();
    }
}
