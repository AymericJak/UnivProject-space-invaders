/**
 * Ce fichier fait partie du projet projet-2022-2023-b-1.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.qdev2.spaceinvaders.model.movables;


/**
 * Le type IStateMur
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public interface IStateMur {

    public IStateMur getNextState();
    
    public String getSpriteName();
    
    
}

