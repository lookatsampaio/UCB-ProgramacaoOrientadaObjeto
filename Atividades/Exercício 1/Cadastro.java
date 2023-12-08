import java.util.Scanner;

public class Cadastro{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Cadastro da Pessoa");
        System.out.print("Insira seu nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Sua Idade: ");
        int idadePessoa = scanner.nextInt();

        
        scanner.nextLine(); 
        System.out.println("Cadastro de Pet");
        System.out.print("Nome do Pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Tipo de Pet: ");
        String tipoPet = scanner.nextLine();

        
        System.out.println("Cadastro de Veículo");
        System.out.print("Marca do veículo: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Modelo do veículo: ");
        String modeloVeiculo = scanner.nextLine();

        
        System.out.println("\nDados Cadastrados:");
        System.out.println("Pessoa: \n nome: " + nomePessoa + ", idade: " + idadePessoa);
        System.out.println("Pet: \n nome: " + nomePet + ", tipo: " + tipoPet);
        System.out.println("Veículo: \n marca: " + marcaVeiculo + ", modelo: " + modeloVeiculo);

        scanner.close();
    }
}