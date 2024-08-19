import java.util.ArrayList;
import java.util.List;

public class ManagingLists {

    List<String> names = new ArrayList<>();

    public ManagingLists() {
        names.add("Flavio");
        names.add("Juliana");
        names.add("Fernanda");
        names.add("Natalia");
        Person person = new Person("SomeGuy",21L);
        names.add(person.name());
    }

    public List<String> getAllNames() {
        return names;
    }

    public String getNameById() {
        return names.stream().filter(name -> name.equals("Juliana")).findFirst().get();
    }

    public void getAllNamesReversed() {
        names.stream().toList().reversed().forEach(System.out::println);
    }

    public void addNameToList() {
        names.addLast("Fofucho");
        names.stream().toList().forEach(System.out::println);
    }

    public void removeNameFromList() {
        names.removeIf(name -> name.equals("Fofucho"));
        names.stream().toList().forEach(System.out::println);
    }


}
