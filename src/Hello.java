public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Ezgi");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");

        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 90;
        if ((topScore > secondTopScore) && topScore < 100) {
            System.out.println("Great than second top score and less than 100");

        }
        if ((topScore > 90)|| (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar != true) {
            System.out.println("This is not supposed to happen");
        }
        boolean isRun = false;
        if (isRun) {
            System.out.println("He supposed to run");
        }

        boolean isDie = false;
        if (!isDie) {
            System.out.println("Fish supposed to die");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");

        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);


        double a = 20.00d;
        double b = 80.00d;
        double t = (a + b)  * 100.00d;
        System.out.println("t = " + t);
        double r = t % 40.00d;
        System.out.println("r = " +r);
        boolean nr = (r == 0) ? true : false ;
        System.out.println("nr = " + nr);
        if (!nr) {
            System.out.println("Got some remainder");

        }







    }
}

