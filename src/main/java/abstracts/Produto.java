package abstracts;

public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int tempoDePreparo;

    public Produto() {
        this.nome = "";
        this.descricao = "";
        this.preco = 0.0;
        this.tempoDePreparo = 0;
    }

    public Produto(String nome, String descricao, double preco, int tempoDePreparo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoDePreparo = tempoDePreparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }
}
