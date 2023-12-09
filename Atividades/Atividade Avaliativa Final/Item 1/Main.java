import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Midia> cadastroMidias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite as informações do CD:");
            CD cd = new CD(1, 0.0, "", 0);
            cd.inserirDados(scanner);
            cadastroMidias.add(cd);

            
            System.out.println("\nDigite as informações do DVD:");
            DVD dvd = new DVD(2, 0.0, "", 0);
            dvd.inserirDados(scanner);
            cadastroMidias.add(dvd);

            
            System.out.println("\nDigite as informações do Mídia:");
            Midia midia = new Midia(3, 0.0, "");
            midia.inserirDados(scanner);
            cadastroMidias.add(midia);
        } finally {
            scanner.close();
        }

    
        System.out.println("\nInfos do Cadastro:");
        for (Midia m : cadastroMidias) {
            m.printDados();
            System.out.println();
        }
    }
}