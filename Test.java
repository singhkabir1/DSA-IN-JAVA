// create a node in linkedlist
// package LinkedList;
// public class Test{
//     public static void main(String[] args) {
//         Node node1 = new Node();
//         Node node2 = new Node();
//         node2.value = 2;
//         node1.value = 1;
//         node1.next = node2;
//         node2.next = null;
//     }
// }

// class Node {
//     public int value;

//     public Node next;
// }


import java.util.LinkedList;

public class Test {
   public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addFirst(4);
        linkedList.addLast(8);
        System.out.println(linkedList);
   }
    
}
