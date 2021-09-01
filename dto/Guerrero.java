
package dto;

public class Guerrero extends Personaje {
    private double bloqueo;

    public Guerrero() {
        super(3000, 500, 200);
        this.bloqueo = 100;
    }
    
    public double bloquear(double ataque) {
        return ataque - this.bloqueo;
    }
}
