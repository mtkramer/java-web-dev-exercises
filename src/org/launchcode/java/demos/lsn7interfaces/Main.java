package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Case menu = new Case();

        ArrayList<Flavor> flavors = menu.getFlavors();
        flavors.sort(new FlavorComparator());
        for(Flavor flav : flavors){
            System.out.println(flav.getAllergens());
        }

        ArrayList<Cone> cones = menu.getCones();
        cones.sort(new ConeComparator());
        for(Cone cone : cones){
            System.out.println(cone.getCost());
        }

        ArrayList<Topping> toppings = menu.getToppings();
        toppings.sort(new ToppingComparator());
        for(Topping topping : toppings){
            System.out.println(topping.getName());
        }
    }

}
