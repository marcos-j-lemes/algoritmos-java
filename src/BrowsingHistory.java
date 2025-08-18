
import java.util.LinkedList;

/*
The linkedList challenge I'm working on is very simple because it's not a doubly linked list.
This means that rewriting the entire list is required to change any element.
 */

public class BrowsingHistory {

    static LinkedList<String> history = new LinkedList<>();
    static LinkedList<String> oldList = new LinkedList<>();

    public static void main(String[] args){

        history.add("github.com");
        history.add("google.com");
        history.add("aws.com");
        history.add("leetcode.com");

        printList(history);

        forward(history);
        backHistory(history);
        backHistory(history);
        backHistory(history);

        current(history);

        add("Youtube.com");

        printList(history);

    }

    public static void printList(LinkedList<String> list){
        int count = 1;
        for(String s: list){
            System.out.println(count +" -> "+ s);
            count++;
        }
        System.out.println(" ");
    }

    public static void backHistory(LinkedList<String> list){
        if(list.size() == 1){
            System.out.println("No history record (can't go forward)");
        }else{
            oldList.add(list.removeLast());
        }
    }

    public static void forward(LinkedList<String> list){

        if(!oldList.isEmpty()){
            list.addLast(oldList.getFirst());
            oldList.removeFirst();
        }else{
            System.out.println("No history record (can't go forward)");
        }
    }

    public static void current(LinkedList<String> list){
        System.out.println("you are in: "+ list.getLast());
    }

    public static void add(String page){
        oldList.clear();
        history.addLast(page);
    }
}
