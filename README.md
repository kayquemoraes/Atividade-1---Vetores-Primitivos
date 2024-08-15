# README do Projeto

## Visão Geral

Este projeto é uma simples implementação de um sistema de gerenciamento de alunos utilizando classes Java. O projeto inclui três classes:

1. **`Aluno`**: Representa um aluno com um ID, nome e média.
2. **`CadastroAlunos`**: Gerencia um array de objetos `Aluno`, permitindo adicionar, atualizar, buscar e remover alunos.
3. **`Main`**: Contém o método `main` para testar as funcionalidades do sistema de cadastro de alunos.

## Estrutura do Projeto

### Classe `Aluno`

Representa um aluno com os seguintes atributos:
- `id` (int): Identificador único do aluno.
- `nome` (String): Nome do aluno.
- `media` (double): Média do aluno.

### Classe `CadastroAlunos`

Gerencia um array de alunos e oferece os seguintes métodos:
- `adicionar(Aluno aluno)`: Adiciona um novo aluno ao array.
- `buscar(int id)`: Busca um aluno pelo ID e retorna seu índice.
- `atualizar(int indice, Aluno novoAluno)`: Atualiza o aluno no índice especificado.
- `remover(int indice)`: Remove o aluno do índice especificado.
- `listar()`: Lista todos os alunos.

### Classe `Main`

Contém o método `main` para testar as funcionalidades das outras classes.

## Perguntas Frequentes

### 1. Caso seja necessário alterar o tamanho do vetor, como isso pode ser feito? Se o código entregue não suporta essa alteração, liste as melhorias necessárias para que a alteração seja possível.

**Resposta:**

O código atual permite alterar o tamanho do array de alunos usando o método `setTamanhoLista(int novoTamanhoLista)` da classe `CadastroAlunos`. No entanto, este método pode ser aprimorado para lidar melhor com casos onde o novo tamanho é menor ou maior que o tamanho atual do array.

**Melhorias necessárias:**
- **Redimensionamento Dinâmico**: Implementar a capacidade de redimensionar o array para maior ou menor conforme necessário.
- **Gerenciamento de Alunos Excedentes**: Se o novo tamanho for menor, o método deve garantir que os alunos excedentes sejam removidos corretamente.

### 2. O que acontecerá caso o usuário tente incluir uma quantidade de itens maior do que o tamanho do vetor? Existe algo que possa ser feito para mitigar esse risco?

**Resposta:**

Se o usuário tentar adicionar mais alunos do que a capacidade atual do array, o método `adicionar(Aluno aluno)` da classe `CadastroAlunos` imprimirá uma mensagem de erro indicando que a capacidade máxima foi atingida. O aluno não será adicionado ao array.

**Mitigação:**
- **Verificação de Capacidade**: Antes de adicionar um aluno, o método verifica se há espaço suficiente no array.
- **Erro Informativo**: O sistema informa ao usuário quando a capacidade é atingida, permitindo que ações alternativas possam ser tomadas.

### 3. O que acontecerá caso o usuário tente excluir um item que não existe no vetor?

**Resposta:**

Se o usuário tentar remover um aluno usando um índice inválido (fora dos limites do array), o método `remover(int indice)` da classe `CadastroAlunos` imprimirá uma mensagem de erro indicando que o índice é inválido. O item não será removido e o array permanecerá inalterado.

**Mitigação:**
- **Verificação de Índice**: O método verifica se o índice fornecido está dentro dos limites válidos do array antes de tentar remover o aluno.
- **Erro Informativo**: O sistema informa ao usuário quando um índice inválido é fornecido, evitando tentativas de exclusão incorretas.

## Observações

- O sistema utiliza arrays primitivos para armazenar os alunos. Para operações mais complexas, como redimensionamento dinâmico, seria necessário utilizar coleções mais avançadas.
- O código está projetado para ser simples e direto, facilitando a compreensão e a manutenção, mas pode ser melhorado para suportar funcionalidades adicionais conforme necessário.
