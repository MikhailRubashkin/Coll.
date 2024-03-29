package Collections;

import java.util.*;

//	Вывести учеников из списка в обратном порядке.

public class StudentsList {

    public static void main(String[] args) {

        ArrayList aList = new ArrayList();

        aList.add("Кирил");
        aList.add("Антон");
        aList.add("Максим");
        Collections.sort(aList,Collections.reverseOrder());
        Iterator ir=aList.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }

        System.out.println();
        ListIterator<String> listIterator = aList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }

}
}
