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
public class Cassowary implements Animal{
    ArrayList<String> data;
    public Cassowary() {
        data=new ArrayList<String>();
        data.add("Kingdom: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Aves");
        data.add("Order: Casuariiformes");
        data.add("Family: Casuariidae");
        data.add("Genus: Casuarius");
        data.add("Specie: Casuarius casuarius");
    }

    @Override
    public void showData() {
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
    
}
