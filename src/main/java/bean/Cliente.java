package bean;

import abstracts.Usuario;

public class Cliente extends Usuario {
    private String nome;
    private String endereco;
    
    public Cliente() {
        super();
        this.nome = "";
        this.endereco = "";
    }

    public Cliente(String nome, String endereco) {
        super();
        this.nome = nome;
        this.endereco = endereco;
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
}
