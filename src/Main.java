import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws Exception {

        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addLast("Элемент 1"); // 0
        linkedList.addLast("Элемент 2"); // 0
        linkedList.addLast("Элемент 3"); // 0
        linkedList.addLast("Элемент 4"); // 0
        linkedList.addLast("Элемент 5"); // 0
        linkedList.addLast("Элемент 6"); // 0
        linkedList.addLast("Элемент 7"); // 0
        linkedList.addLast("Элемент 8"); // 0
        linkedList.addLast("Элемент 9"); // 0
        linkedList.addLast("Элемент 10"); // 0
        linkedList.addLast("Элемент 11"); // 0
        linkedList.addLast("Элемент 12"); // 0


        Iterator iterator = linkedList.Iteratorrevers();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






































    }


}
