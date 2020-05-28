/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concreteEntities;

import abstractEntities.AbstractCreator;
import abstractEntities.Animal;

/**
 *
 * @author jackl
 */

public class Taxonomist extends AbstractCreator{

    @Override
    public Animal createAnimal(int select) {
        /*Animal selection;*/
        switch(select){
            case 1:
                return new Cassowary();      
            case 2:
                return new InlandTaipan();
            case 3:
                return new Jaguar();             
            case 4:
                return new SeaWasp();
            default:
                return null;
        }
        /*return selection;*/
    }
    
}
