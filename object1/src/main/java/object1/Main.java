package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
      // Logger logger=Logger.getLogger(Main.class.getName());
        //logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John",30,160);
        System.out.println("Person is" + person1);

        Car mycar = new Car("Mazda", "RX7", 1987, 99999,"Red");
        System.out.println("Look at my" + mycar);

        Chair mychair = new Chair("Leather","Black", 5, 7);
        System.out.println("My chair is made up of" + mychair);

        Dog thatdog = new Dog("Bingo", 6, "Mutt","Grey");
        System.out.println("My friends dog is" + thatdog);


    }


}
