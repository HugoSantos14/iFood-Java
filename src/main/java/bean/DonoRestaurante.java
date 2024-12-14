package bean;

import abstracts.Usuario;

public class DonoRestaurante extends Usuario {
    private Restaurante restaurante;

    public DonoRestaurante() {
        super();
        this.restaurante = new Restaurante();
    }

    public DonoRestaurante(String email, String senha, Restaurante restaurante) {
        super(email, senha);
        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
