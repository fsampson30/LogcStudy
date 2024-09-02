import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        ForLoop forLoop = new ForLoop();
        Calculator calculator = new Calculator();
        UtilDates utilDates = new UtilDates();
        ManagingLists managingLists = new ManagingLists();
        WhileLoop whileLoop = new WhileLoop();

        forLoop.repeatFiveTimes();
        System.out.println("Sum value: " + calculator.sumValues() + " " +  utilDates.getInstant());
        System.out.println("Subtract value: " + calculator.subtractValue() + " " +  utilDates.getTimeStamp());
        System.out.println("Multiply value: " + calculator.multiplyValues());
        System.out.println("Division value: " + calculator.divideValues());
        System.out.println("Division value: " + calculator.bigDivideValues());

        System.out.println("List size:  " + managingLists.names.size());
        System.out.println("List first index: " + managingLists.getAllNames().getFirst());
        System.out.println("List last index: " + managingLists.getAllNames().getLast());

        System.out.println("Get specific name:  " + managingLists.getNameById() );

        managingLists.getAllNamesReversed();

        managingLists.addNameToList();

        managingLists.removeNameFromList();

        whileLoop.repetition();


        List<Double> list = new ArrayList<>();
        list.add(5.4);
        list.add(1.2);
        Optional<Double> opt = list.stream().sorted().findFirst();
        System.out.println(opt.get()+" " + list.get(0));

        System.out.println(utilDates.test(3662));


















    }


}