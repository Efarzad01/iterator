import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue1 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        ((LinkedList<String>) queue).add("Car");
        ((LinkedList<String>) queue).add("Bus");
        ((LinkedList<String>) queue).add("Train");

        Iterator it = queue.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());

            }


            }
        }

