public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Contorno", "Bandeirante", "DF");
        Endereco endereco2 = new Endereco("Avenida2", "Tagutatinga", "DF");
        Endereco endereco3 = new Endereco("Rua4", "Ceilandia", "DF");

        Telefone telefone1 = new Telefone("9324968531", "Celular", "61");
        Telefone telefone2 = new Telefone("9432567831", "Residencial", "61");
        Telefone telefone3 = new Telefone("8256765213", "Celular", "61");

        Aluno aluno1 = new Aluno("Kauan", "77788899932", "kanomura@gmail.com", 6.9);
        aluno1.setEndereco(endereco1);
        aluno1.addTelefone(telefone1);

        Aluno aluno2 = new Aluno("James", "11122233356", "james@gmail.com", 5.0);
        aluno2.setEndereco(endereco2);
        aluno2.addTelefone(telefone2);

        Curso curso1 = new Curso("Ciencias da Computacao");
        Curso curso2 = new Curso("Engenharia de Software");

        Professor professor1 = new Professor("Hially", "55566677790", "hially@gmail.com", "Doutorado", 7500.0);
        professor1.setEndereco(endereco3);
        professor1.addTelefone(telefone3);

        Disciplina disciplina1 = new Disciplina("Programacao Orientada a Objetos");

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina1.adicionarCurso(curso1);
        disciplina1.adicionarCurso(curso2);
        disciplina1.setProfessor(professor1);

        professor1.addCurso(curso1);

        disciplina1.mostrarDisciplina();

        System.out.println("\nDados do primeiro aluno:");
        aluno1.mostrarAluno();

        System.out.println("\nDados do segundo aluno:");
        aluno2.mostrarAluno();

        System.out.println("\nDados do Professor:");
        professor1.mostrarProfessor();
    }
}