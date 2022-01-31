/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Truck class.
*/
public class Truck extends AbstractVehicle {

    /**
    * Plate.
    */
    private String liscensePlate;

    /**
    * Initial values.
    *
    * @param startPlate plate
    * @param startMaxSpeed max
    * @param startColour colour
    * @param startTireNum tires
    */

    public Truck(final String startPlate, final int startMaxSpeed,
                 final String startColour, final int startTireNum) {

        super(startColour, startMaxSpeed, startTireNum);
        this.liscensePlate = startPlate;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public String getLiscence() {
        return this.liscensePlate;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getTireNum() {
        return super.tireNum;
    }

    /**
    * Setter.
    *
    * @param someLiscence Liscence
    */
    public void setLiscence(String someLiscence) {
        this.liscensePlate = someLiscence;
    }

    /**
    * Air.
    */
    public void provideAir() {
        System.out.println("Provided Air.");
    }
}
