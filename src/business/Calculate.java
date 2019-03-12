package business;

import domain.Pet;

public class Calculate {

    // polymorphic example 2 (
    public int totalCost(Pet p){
        final int STARTFEE = 300;
        return STARTFEE + p.cost();
    }
}
