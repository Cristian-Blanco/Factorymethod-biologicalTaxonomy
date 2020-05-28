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
public class InlandTaipan implements Animal{
    
    ArrayList<String> data;
    public InlandTaipan() {
        data=new ArrayList<String>();
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Sauropsida");
        data.add("Order: Squamata");
        data.add("Family: Elapidae");
        data.add("Genuso: Oxyuranus");
        data.add("Specie: Oxyuranus microlepidotus");
    }


    @Override
    public void showData() {
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
    
}
