package com.bazlur.java.syntax;

/**
 * This program implements the work of a bicycle theoritically.
 * author: Daiyan Noory Dahy
 * 
 * checking doc commenting
 *
 */

 /* checking multi-line c commenting

  */

  // checking single line c commenting

public class Bicycle{

    private int cadence=0, speed=0,gear=1;
    
    public void changeCAdence(int newValue){
        cadence=newValue;
    }

    public void changeGear(int newValue){

        gear= newValue;
    }

    public void speedUp(int increment){
        speed+=increment;
    }

    public void applyBrakes(int decrement){
        speed-=decrement;
    }

    public void printStates(){

        System.out.println("cadence: "+cadence+"speed: "+speed+"gear: "+gear);
    }

}

