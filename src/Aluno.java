public class Aluno {
    private int id;
    private String nome;
    private double media;

    public Aluno(int id, String nome, double media) {
        this.id = id;
        this.nome = nome;
        this.media = media;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }
}
