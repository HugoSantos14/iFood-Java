package bean;

import abstracts.Produto;
import interfaces.GerenciamentoProdutos;
import java.util.ArrayList;

public class Pedido implements GerenciamentoProdutos {
    private final ArrayList<Produto> carrinho;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.carrinho = new ArrayList<>();
        this.cliente = cliente;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        this.carrinho.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        this.carrinho.remove(produto);
    }
    
    public void limparCarrinho() {
        this.carrinho.clear();
    }
}
