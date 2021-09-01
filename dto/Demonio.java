
package dto;

public class Demonio extends Personaje {
    private boolean meta;
    
    public Demonio() {
        super(2000, 2000, 400);
        this.meta = false;
    }
    
    public void transformar() {
        meta = true;
        setAtaqueNormal(this.getAtaqueNormal() * 1.1);
        setEnergia(this.getEnergia()* 1.1);
        setVida(this.getVida()* 1.1);
    }
    
}
