
package spacebatle;

public class hunter extends spaceShip {
   

   private static final double INITIAL_ENERGY = 150.0;
   private static final double SHIELD_ENERGY_RATIO = 0.40;
   private static final double MAX_LASER_ENERGY_ATTACK = 40.0;
   private static final double PAIN_FACTOR = 0.25;

  

    public hunter(String name, double energy, double shieldEnergyRatio) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
    }

    @Override
    public void attack(spaceShip enemy) {
        double attackForce ;
    }
   
   
}
