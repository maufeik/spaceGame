
package spacebatle;

public class hunter extends spaceShip {
   

   private static final double INITIAL_ENERGY = 150.0;
   private static final double SHIELD_ENERGY_RATIO = 0.40;
   private static final double MAX_LASER_ENERGY_ATTACK = 40.0;
   private static final double PAIN_FACTOR = 0.25;

  
    public hunter(String name){
        
    }
    public hunter(String name, double energy, double shieldEnergyRatio) {
        super(name, INITIAL_ENERGY, SHIELD_ENERGY_RATIO);
    }

    @Override
    public void attack(spaceShip enemy) {
        double attackForce ;
    }

    @Override
    public void receiveAttack(double force) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void stateInfo(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("HUNTER: {")
                 .append("name=").append(this.name)
                 .append(", energy=").append(this.energy)
                 .append(", alive=").append(this.alive)
                 .append("}");
    }
   
}
