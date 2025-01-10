
package spacebatle;

/**
 *
 * @author mtr0338
 */
public abstract class spaceShip implements spaceFigther{

    protected String name;
    protected double energy;
    protected boolean alive;
    protected double shieldEnergyRatio;

    public spaceShip(String name, double energy, double shieldEnergyRatio) {
        this.name = name;
        this.energy = energy;
        this.shieldEnergyRatio = shieldEnergyRatio;
        this.alive=true;
    }

    public spaceShip() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }  

    public boolean isAlive(){
        return this.alive;
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }  
    
    public double getShieldEnergyRatio() {
        return shieldEnergyRatio;
    }

    public void setShieldEnergyRatio(double shieldEnergyRatio) {
        this.shieldEnergyRatio = shieldEnergyRatio;
    }
    
    

    
    
    
}
