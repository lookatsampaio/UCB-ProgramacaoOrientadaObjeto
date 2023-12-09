import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }


   
    @Override
public void inserirDados(Scanner scanner) {
    super.inserirDados(scanner);
    try {
        System.out.print("Digite o número de faixas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Apenas números são aceitos!");
            scanner.next();
        }
        this.nFaixas = scanner.nextInt();
    } finally {
        
    }
}

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quantidade de Faixas: " + nFaixas);
    }
}