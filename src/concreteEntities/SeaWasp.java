/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concreteEntities;

import abstractEntities.Animal;
import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public class SeaWasp implements Animal{
    ArrayList<String> data;

    public SeaWasp() {
        data=new ArrayList<String>();
        data.add("Kingdom: Animalia");
        data.add("Phylum: Cnidaria");
        data.add("Class: Cubozoa");
        data.add("Order: Chirodropida");
        data.add("Family: Chirodropidae");
        data.add("Genus: Chironex");
        data.add("Specie: Chironex fleckeri");
    }


    @Override
    public void showData() {
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
    
    
}
