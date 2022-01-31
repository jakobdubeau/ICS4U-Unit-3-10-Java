/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Main.
*/
final class Main {

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

        final int thirty = 30;
        final int ninety = 90;
        final int twenty = 20;

        final Bike bike = new Bike(30, "Blue", 2);
        final Truck truck = new Truck("A48N3A", 90, "Red", 4);

        System.out.println("\nThe bike is " + bike.getColour());
        bike.setColour("Orange");
        System.out.println("The bike was painted to " + bike.getColour());

        bike.setCadence(twenty);
        System.out.println("\nThe cadence on the bike is now "
            + bike.getCadence());

        System.out.println("\nRinging bell.");
        bike.ringBell();

        System.out.println("\nThe bike has " + bike.getTireNum() + " tires.");

        System.out.println("\nThe truck's liscence plate is "
            + truck.getLiscence());

        System.out.println("\nThe truck's max speed is "
            + truck.getMaxSpeed());

        truck.accelerate(ninety);
        System.out.println("The truck accelerated to " + truck.getSpeed());

        System.out.println("\nThe truck is now providing air.");
        truck.provideAir();

        System.out.println("\nThe truck has " + truck.getTireNum() + " wheels.");
    }
}
