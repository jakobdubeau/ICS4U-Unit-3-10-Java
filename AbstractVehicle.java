/*
* Vehicles.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*/

/**
* Vehicle class.
*/
public abstract class AbstractVehicle {

    /**
    * Number tires.
    */
    private int tireNum;

    /**
    * Colour.
    */
    private String colour;

    /**
    * Speed.
    */
    private int speed;

    /**
    * Max Speed.
    */
    private int maxSpeed;

    /**
    * Initial values.
    *
    * @param startColour colour
    * @param vehicleMaxSpeed speed
    * @param startTireNum tires
    */

    public AbstractVehicle(final String startColour, final int vehicleMaxSpeed, final
                    int startTireNum) {

        this.colour = startColour;

        this.speed = 0;

        this.maxSpeed = vehicleMaxSpeed;

        this.tireNum = startTireNum;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Setter.
    *
    * @param someColour Colour
    */
    public void setColour(String someColour) {
        this.colour = someColour;
    }

    /**
    * Accelerates.
    *
    * @param acceleration acceleration.
    */
    public void accelerate(final int acceleration) {
        if (acceleration + speed > maxSpeed) {
            System.out.println("\nCannot accelerate more"
                + " than the maximum speed.");
        }
        else {
            speed = speed + acceleration;
        }
    }

    /**
    * Applies brakes to a car.
    *
    * @param brakes the amount to which the speed will be reduced
    */
    public void brake(final int brakes) {
        if (brakes > speed) {
            System.out.println("\nCannot brake more than the current speed.");
        }
        else {
            speed = speed - brakes;
        }
    }
}
