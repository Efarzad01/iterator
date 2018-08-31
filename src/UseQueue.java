import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        ((LinkedList<String>) queue).add("NY");
        ((LinkedList<String>) queue).add("CA");
        ((LinkedList<String>) queue).add("LA");


        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //while(!queue.isEmpty()){
            //System.out.println(((LinkedList<String>) queue).pop());
        //}
        //for(String st:queue){
           // System.out.println(st);
        }
    }
