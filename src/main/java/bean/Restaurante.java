package bean;

import abstracts.Produto;
import interfaces.GerenciamentoProdutos;
import java.util.ArrayList;

public class Restaurante implements GerenciamentoProdutos {
    private String nome;
    private String endereco;
    private final ArrayList<Produto> cardapio;
    
    public Restaurante() {
        this.nome = "";
        this.endereco = "";
        this.cardapio = new ArrayList<>();
    }

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public ArrayList<Produto> getCardapio() {
        return cardapio;
    }
    
    @Override
    public void adicionarProduto(Produto produto) {
        this.cardapio.add(produto);
    }
    
    @Override
    public void removerProduto(Produto produto) {
        this.cardapio.remove(produto);
    }
}
