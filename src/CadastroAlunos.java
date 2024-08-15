public class CadastroAlunos {
    private Aluno[] alunos; //Lista alunos só com objeto Aluno
    private int tamanhoLista; //Tamanho inicial da lista
    private int tamanhoAtual; //Tamanho atual da lista

    // Construtor que inicia a lista passando como parâmetro o tamanho inicial dela (tamanhoLista)
    public CadastroAlunos(int capacidade) {
        tamanhoLista = capacidade;
        this.alunos = new Aluno[tamanhoLista];
        this.tamanhoAtual = 0;
    }

    public void setTamanhoLista(int novoTamanhoLista) {
        if (novoTamanhoLista < tamanhoAtual) {
            // Se o novo tamanho é menor que o número atual de alunos, remova os alunos excedentes
            for (int i = novoTamanhoLista; i < tamanhoAtual; i++) {
                alunos[i] = null;
            }
            tamanhoAtual = novoTamanhoLista;
        }

        // Cria um novo array com o novo tamanho
        Aluno[] novoArray = new Aluno[novoTamanhoLista];

        // Copia os alunos existentes para o novo array
        for (int i = 0; i < tamanhoAtual; i++) {
            novoArray[i] = alunos[i];
        }

        // Substitui o array antigo pelo novo
        alunos = novoArray;
        tamanhoLista = novoTamanhoLista;
    }

    // Adicionar novo aluno na lista
    public void adicionar(Aluno aluno){
        // Condição para evitar adicionar um aluno com o id já existente na lista
        if (buscar(aluno.getId()) != -1) {
            System.out.println("Erro: Já existe um aluno com o ID " + aluno.getId() + ".");
            return;
        }
        // Condição para não adicionar novos alunos caso a lista esteja cheia
        if (tamanhoAtual < alunos.length){
            alunos[tamanhoAtual] = aluno;
            tamanhoAtual++;
        }else{
            System.out.println("Erro: Capacidade máxima atingida.");
        }
    }

    // Buscar o aluno pelo id e retorna sua posição em índice
    public int buscar(int id){
        for (int i = 0; i < tamanhoAtual; i++) {
            if (id == alunos[i].getId()){
                return i;
            }
        }
        return -1;
    }

    // Atualiza a lista por índice
    public void atualizar(int indice, Aluno novoAluno){
        if (indice < tamanhoAtual && indice >= 0){
            alunos[indice] = novoAluno;
        }else{
            System.out.println("Erro: Índice inválido.");
        }
    }

    // Remove o aluno por índice e diminui o tamanho da lista para a quantidade de alunos correta
    public void remover(int indice){
        if (indice < tamanhoAtual && indice >= 0){
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                alunos[indice] = alunos[indice + 1];
            }

            alunos[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        }else{
            System.out.println("Erro: Índice inválido.");
        }
    }

    // Lista todos os alunos da lista
    public void listar(){
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println("Índice: " + i);
            System.out.println("ID: " + alunos[i].getId());
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Média: " + alunos[i].getMedia() + "\n");
        }
    }
}
