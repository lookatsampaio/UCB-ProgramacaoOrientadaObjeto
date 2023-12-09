public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirInfo() {
        System.out.println("Informações do livro");
        System.out.println("Título: " + titulo);
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.println("Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("A menina que roubava livros", "A menina", 452);
        meuLivro.imprimirInfo();
    }
}