public class Main {
    public static void main(String[] args) {
        // Testando as implementações
        CadastroAlunos espx = new CadastroAlunos(5);

        // Adicionando alunos
        espx.adicionar(new Aluno(101, "Kayque", 8.5));
        espx.adicionar(new Aluno(102, "Guilherme", 9.0));
        espx.adicionar(new Aluno(103, "Enricco", 7.5));
        espx.adicionar(new Aluno(103, "Gabriel", 8.0));
        espx.adicionar(new Aluno(103, "Samuel", 9.5));

        // Listando alunos
        System.out.println("Lista de Alunos:");
        espx.listar();

        // Buscando aluno por ID
        int indice = espx.buscar(102);
        if (indice != -1) {
            System.out.println("Aluno encontrado no índice: " + indice);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Atualizando um aluno
        espx.atualizar(1, new Aluno(102, "Augusto", 9.5));
        System.out.println("Após atualização:");
        espx.listar();

        // Removendo um aluno
        espx.remover(0);
        System.out.println("Após remoção:");
        espx.listar();
    }
}
