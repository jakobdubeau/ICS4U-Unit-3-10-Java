/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Bike class.
*/
public class Bike extends AbstractVehicle {

    /**
    * Cadence.
    */
    private int cadence;

    /**
    * Initial values.
    *
    * @param startMaxSpeed max
    * @param startColour colour
    * @param startTireNum tires
    */

    public Bike(final int startMaxSpeed, final String startColour, final int
                startTireNum) {

        super(startColour, startMaxSpeed, startTireNum);
        cadence = 0;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getCadence() {
        return this.cadence;
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
    * @param someCadence Liscence
    */
    public void setCadence(int someCadence) {
        this.cadence = someCadence;
    }

    /**
    * Bell.
    */
    public void ringBell() {
        System.out.println("Ring Ring!");
    }
}
