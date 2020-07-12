package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        Case menu = new Case();

        ArrayList<Flavor> flavors = menu.getFlavors();
        flavors.sort(new FlavorComparator());
        for(Flavor flav : flavors){
            System.out.println(flav.getName());
        }

        ArrayList<Cone> cones = menu.getCones();
        cones.sort(new ConeComparator());
        for(Cone cone : cones){
            System.out.println(cone.getCost());
        }
    }

}
