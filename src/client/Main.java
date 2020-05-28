/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import abstractEntities.AbstractCreator;
import abstractEntities.Animal;
import concreteEntities.Taxonomist;
import java.util.Scanner;

/**
 *
 * @author jackl
 */
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        int option=0;
        do{
            option=menu();
            AbstractCreator creator = new Taxonomist();
            Animal lethal = creator.createAnimal(option);
            lethal.showData();
        }while(option!=5);
    }
     public static int  menu(){
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Solicitar clasificacion cientifica del Casuario central. \n"
                + "2.   Solicitar clasificacion cientifica de la serpiente taipan del interior. \n"
                + "3.   Solicitar clasificacion cientifica del jaguar. \n"
                + "4.   Solicitar clasificacion cientifica de la avispa de mar. \n"     
                + "5.   Cerrar programa. \n\n"
                + "Seleccion opcion..."
        );
        return Integer.parseInt(reader.nextLine());
    }
}
