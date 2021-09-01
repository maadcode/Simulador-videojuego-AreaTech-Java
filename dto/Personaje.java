
package dto;

public abstract class Personaje {
    private double vida;
    private double energia;
    private double ataqueNormal;

    public Personaje(double vida, double energia, double ataqueNormal) {
        this.vida = vida;
        this.energia = energia;
        this.ataqueNormal = ataqueNormal;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAtaqueNormal() {
        return ataqueNormal;
    }

    public void setAtaqueNormal(double ataqueNormal) {
        this.ataqueNormal = ataqueNormal;
    }
    
    public double atacar(double vidaOponente) {
        return vidaOponente - this.getAtaqueNormal();
    }
}
