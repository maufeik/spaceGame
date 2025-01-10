
package spacebatle;

import java.util.Random;


public class cruiser extends spaceShip{
   
   private int numPhotonTorpedo;  
   private static final double INITIAL_ENERGY = 100.0;
   private static final double SHIELD_ENERGY_RATIO = 0.45;
   private static final double MAX_LASER_ENERGY_ATTACK = 50.0;
   private static final double PAIN_FACTOR = 0.20;
   private static final double TORPEDO_FORCE = 75.0;
   private weapon cruiserWeapon;

    public cruiser(String name, int numPhotonTorpedo) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
        this.numPhotonTorpedo= numPhotonTorpedo;
        if(Math.random()<0.5)cruiserWeapon=weapon.LASER_GUN;
        else cruiserWeapon=weapon.PHOTONIC_TORPEDO;
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
        double attackForce=0.0;
        
        if(cruiserWeapon==weapon.LASER_GUN){
            attackForce = getLaserGunEnergy() * Math.random();
        }else{
            attackForce = this.TORPEDO_FORCE;
            this.numPhotonTorpedo--;
        }
        enemy.receiveAttack(attackForce);
    }

    @Override
    public void receiveAttack(double force) {
        double pain = force * this.PAIN_FACTOR;
        if(force>getSHIELD_ENERGY()){
            this.energy=0.0;
        }else{
            this.energy-=pain;
            this.energy= Math.max(0.0, this.energy);
        }   
    }
    public void stateInfo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("CRUISER: {")
                 .append("name=").append(this.name)
                 .append(", energy=").append(this.energy)
                 .append(", numPhotonTorpedo=").append(this.numPhotonTorpedo)
                 .append(", alive=").append(this.alive)
                 .append("}");
    }
}