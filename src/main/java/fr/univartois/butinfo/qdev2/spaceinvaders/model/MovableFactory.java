/**
 * Ce fichier fait partie du projet projet-2022-2023-b-1.
 *
 * (c) 2022 pierre.schreiner
 * Tous droits réservés.
 */

package fr.univartois.butinfo.qdev2.spaceinvaders.model;

import java.util.Random;

import fr.univartois.butinfo.qdev2.spaceinvaders.model.movables.VaisseauAlien;
import fr.univartois.butinfo.qdev2.spaceinvaders.model.movables.deplacements.DeplacementNormal;
import fr.univartois.butinfo.qdev2.spaceinvaders.model.movables.tirs.Tir;
import fr.univartois.butinfo.qdev2.spaceinvaders.model.movables.tirsaliens.AlienTirePasStrategy;
import fr.univartois.butinfo.qdev2.spaceinvaders.model.movables.vaisseaujoueur.VaisseauJoueur;
import fr.univartois.butinfo.qdev2.spaceinvaders.view.ISpriteStore;

/**
 * Le type MovableFactory
 *
 * @author pierre.schreiner
 *
 * @version 0.1.0
 */
public class MovableFactory implements IMovableFactory {

    /**
     * 
     */
    private ISpriteStore spriteStore;
    /**
     * 
     */
    private Random random = new Random();

    /**
     * 
     */
    private SpaceInvadersGame game;

    /*
     * (non-Javadoc) 
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#setSpriteStore(fr.
     * univartois.butinfo.qdev2.spaceinvaders.view.ISpriteStore)
     */
    @Override
    public void setSpriteStore(ISpriteStore spriteStore) {
        this.spriteStore = spriteStore;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#setGame(fr.
     * univartois.butinfo.qdev2.spaceinvaders.model.SpaceInvadersGame)
     */
    @Override
    public void setGame(SpaceInvadersGame game) {
        this.game = game;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#createAlien(int,
     * int)
     */
    @Override
    public IMovable createAlien(int x, int y) {
        return new VaisseauAlien(game,x,y, spriteStore.getSprite("alien"), new DeplacementNormal(), new AlienTirePasStrategy());
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#createShip(int,
     * int)
     */
    @Override
    public IMovable createShip(int x, int y) {
        return new VaisseauJoueur(game, x, y, spriteStore.getSprite("ship"));
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#createShot(int,
     * int)
     */
    @Override
    public IMovable createShot(int x, int y) {
        return new Tir(game, x, y, spriteStore.getSprite("shot"));
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#createShotAlien(
     * int, int)
     */
    @Override
    public IMovable createShotAlien(int x, int y) {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.qdev2.spaceinvaders.model.IMovableFactory#createStrongShot(
     * int, int)
     */
    @Override
    public IMovable createStrongShot(int x, int y) {
        return null;
    }
    
    @Override
    public IMovable createMur(int x, int y) {
        return null;
    }

    @Override
    public IMovable createBonus(int x, int y) {
        return null;
    }
    
    @Override
    public IMovable createBomb(int x, int y) {
        return null;
    }

}
