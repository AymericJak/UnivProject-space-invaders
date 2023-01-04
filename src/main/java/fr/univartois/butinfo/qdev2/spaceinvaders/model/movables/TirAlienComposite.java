package fr.univartois.butinfo.qdev2.spaceinvaders.model.movables;

import java.util.Random;

import fr.univartois.butinfo.qdev2.spaceinvaders.model.SpaceInvadersGame;

/**
 * @author thomas
 *
 */
public class TirAlienComposite implements ITirsGeneral {
    
    /**
     * 
     */
    Random random = new Random();
    
    /**
     * 
     */
    private SpaceInvadersGame game;
    
    
    
    /**
     * @param game
     */
    public TirAlienComposite(SpaceInvadersGame game) {
        this.game = game;
    }

    
    @Override
    public IAlienAttaque tir() {
        int x = random.nextInt(1,4);
        if (x==1) {
            return new AlienTirePasStrategy();
        }
        else if (x==2) {
            return new AlienTireStrategy();
        }
        else {
            return new AlienTireIntelligent(game);
        }
        
    }

}