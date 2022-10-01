package atv5;

import java.util.Scanner;

public class Empresa {

    public String nomeFantasia;
    public String razaoSocial;
    public double faturamento;
    private String cnpj;
    Scanner sc = new Scanner(System.in);
    
    public Empresa(){
        faturamento = 10000.00;
        this.cnpj = "00.000.000-0001/00";
    }
    
    public void cadastrarEmpresa( ){
        
        System.out.println("\n --- Cadastro de Empresa --- \n");
        System.out.println("Informe o nome fantasia: ");
        nomeFantasia = sc.nextLine();
        
        System.out.println("Informe a razão social: ");
        razaoSocial = sc.nextLine();
        
        System.out.println("Informe o faturamento: ");
        faturamento = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o CNPJ: ");
        this.setCnpj(sc.nextLine());
    }
    
    public void setCnpj(String novoCnpj){
        this.cnpj = novoCnpj;
    }
    
    public void imprimirDadosEmpresa(){
        System.out.println("\n-- Dados da Empresa --\n");
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Faturamento: " + faturamento);
        System.out.println("CNPJ: " + cnpj);
    }
}
