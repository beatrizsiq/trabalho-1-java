package atv1;

class Principal {

    public static void main(String args[]) {

        Contato contato = new Contato();        
        System.out.println("\nOlá, você está na classe de Contatos:\n");
        contato.cadastrarContato();
        contato.imprimirContato();
    }
}
