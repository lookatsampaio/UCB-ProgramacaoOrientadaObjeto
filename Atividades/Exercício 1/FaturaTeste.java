public class FaturaTeste {
    public static void main(String[] args) {
        Fatura minhaFatura = new Fatura("100", "---", 3, 25.50);

        System.out.println("Número da Fatura: " + minhaFatura.getNumero());
        System.out.println("Preço por Item: " + minhaFatura.getPrecoPorItem());
        System.out.println("Quantidade: " + minhaFatura.getQuantidade());
        System.out.println("Descrição: " + minhaFatura.getDescricao());
        System.out.println("Total da Fatura: " + minhaFatura.getTotalFatura());

        minhaFatura.setQuantidade(5);
        minhaFatura.setPrecoPorItem(30.50);

        System.out.println("\nAtualização das Informações:");
        System.out.println("Quantidade: " + minhaFatura.getQuantidade());
        System.out.println("Preço por Item: " + minhaFatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + minhaFatura.getTotalFatura());
    }
}