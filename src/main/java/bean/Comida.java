package bean;

import abstracts.Produto;

public class Comida extends Produto {
    private String tipoDeCulinaria;
    private boolean vegetariana;
    private boolean vegana;
    
    public Comida() {
        super();
        this.tipoDeCulinaria = "";
        this.vegetariana = false;
        this.vegana = false;
    }

    public Comida(String tipoDeCulinaria, boolean vegetariana, boolean vegana) {
        super();
        this.tipoDeCulinaria = tipoDeCulinaria;
        this.vegetariana = vegetariana;
        this.vegana = vegana;
        
        if (vegana) {
            this.vegetariana = true;
        } else if (!vegetariana) {
            this.vegana = false;
        }
    }

    public String getTipoDeCulinaria() {
        return tipoDeCulinaria;
    }

    public void setTipoDeCulinaria(String tipoDeCulinaria) {
        this.tipoDeCulinaria = tipoDeCulinaria;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        if (!vegetariana) {
            this.vegana = false;
        }
        this.vegetariana = vegetariana;
    }

    public boolean isVegana() {
        return vegana;
    }

    public void setVegana(boolean vegana) {
        if (vegana) {
            this.vegetariana = true;
        }
        this.vegana = vegana;
    }
}
