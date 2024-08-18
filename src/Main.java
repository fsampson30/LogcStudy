public class Main {

    public static void main(String[] args) {

        ForLoop forLoop = new ForLoop();
        Calculator calculator = new Calculator();
        UtilDates utilDates = new UtilDates();

        forLoop.repeatFiveTimes();
        System.out.println("Sum value: " + calculator.sumValues() + " " +  utilDates.getInstant());
        System.out.println("Subtract value: " + calculator.subtractValue());
        System.out.println("Multiply value: " + calculator.multiplyValues());
        System.out.println("Division value: " + calculator.divideValues());
        System.out.println("Division value: " + calculator.bigDivideValues());


    }


}