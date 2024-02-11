import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListFramework {
    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        System.out.println(list01);

        List<Integer> list02 = new ArrayList<>(list01);
        //duplicate and make a new copy using constructor
        list02.add(4);
        System.out.println(list02);

        List<Integer> list03 = list02.subList(1,3);
        //this won't make a duplicate arraylist
        System.out.println(list03);

        list02.set(1,0);
        System.out.println("Updated list 01: " + list01);
        System.out.println("Updated list 03: " + list03);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Uhh!");
        linkedList.add("Hello");
        linkedList.add("World");
        System.out.println(linkedList);
        ListIterator<String> iterator = linkedList.listIterator();
        System.out.println(iterator.next());
        // next --> return value then index++
        System.out.println(iterator.next());
        // prev --> --index then return value
        System.out.println(iterator.previous());
    }
}
