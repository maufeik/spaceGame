
package spacebatle;

/**
 *
 * @author mtr0338
 */
public class SpaceBatle {

    public static void main(String[] args) {
        spaceShip ship = new cruiser("Enterprise", 100);
        spaceShip ship1 = new hunter("Klingon");
       
        int round = 1;
        
        do {
            System.out.println("===round: "+round+"====");
            
        } while (ship.isAlive()&&ship1.isAlive());
        
        
        
    }
    
}
