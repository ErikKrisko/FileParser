import java.util.Iterator;
import java.util.LinkedList;

public class doubleLinkedList {

    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("Audi");
        list.add("Mercedes");
        list.add("Hyundai");

        list.addFirst("Honda");

        list.addLast("Volswagen");

        list.add(2, "Toyota");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}