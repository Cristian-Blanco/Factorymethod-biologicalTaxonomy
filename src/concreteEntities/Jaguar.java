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
public class Jaguar implements Animal{
    ArrayList<String> data;
    public Jaguar() {
        data=new ArrayList<String>();
        data.add("Kingdom: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Carnivora");
        data.add("Family: Felidae");
        data.add("Genus: Panthera");
        data.add("Specie: Panthera onca");
    }
    
    @Override
    public void showData() {
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
    
}
