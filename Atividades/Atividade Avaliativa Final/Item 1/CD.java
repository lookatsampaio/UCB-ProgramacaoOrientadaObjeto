import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public void inserirDados(Scanner scanner) {
        super.inserirDados(scanner);
        try {
            System.out.print("Digite o número de músicas: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Apenas números são aceitos!");
                scanner.next(); 
            }
            this.nMusicas = scanner.nextInt();
        } finally {
            
        }
    }
    
    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quantidade de Músicas: " + nMusicas);
    }
}