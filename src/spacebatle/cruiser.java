
package spacebatle;

import java.util.Random;


public class cruiser extends spaceShip{
   
   private int numPhotonTorpedo;  
   private static final double INITIAL_ENERGY = 100.0;
   private static final double SHIELD_ENERGY_RATIO = 0.45;
   private static final double MAX_LASER_ENERGY_ATTACK = 50.0;
   private static final double PAIN_FACTOR = 0.20;
   private static final double TORPEDO_FORCE = 75.0;

    public cruiser(String name, int numPhotonTorpedo) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
        this.numPhotonTorpedo= numPhotonTorpedo;
    }

    public double getSHIELD_ENERGY() {
        return this.energy*this.shieldEnergyRatio;
    }
    
    public double getLaserGunEnergy(){
        Random rng = new Random();
        double laserGunEnergy=this.energy*(1-this.shieldEnergyRatio);
        if(laserGunEnergy>this.MAX_LASER_ENERGY_ATTACK) laserGunEnergy=this.MAX_LASER_ENERGY_ATTACK;        
        return laserGunEnergy;
    }
    
    @Override
    public void attack(spaceShip enemy) {        
        
        double attackForce = getLaserGunEnergy() *Math.random();
        
    }
   
    
    
}
