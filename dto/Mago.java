
package dto;

public class Mago extends Personaje {
    private double curacion;
    
    public Mago() {
        super(1000, 3000, 300);
        curacion = 100;
    }
    
    public void curar() {
        this.setVida(this.getVida() + curacion);
    }
    
}
