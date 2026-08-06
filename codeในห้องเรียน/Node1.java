public class Node1<T> {
    public T nodeValue; 
    public Node1<T> next;

    public Node1() {
        nodeValue = null;
        next = null;
    }

    public Node1(T item) {
        nodeValue = item;
        next = null;
    }

    public static void main(String[] args) {
        Node1<String> p = new Node1<String>("red");
        System.out.println("p = " + p);
        System.out.println("p.nodeValue = " + p.nodeValue);
        System.out.println("p.next before = " + p.next);

        Node1<String> q = new Node1<String>("green");
        Node1<String> m = new Node1<String>("pink");
        Node1<String> n = new Node1<String>("yellow");

        System.out.println("q = " + q);
        System.out.println("q.nodeValue = " + q.nodeValue);
        System.out.println("q.next = " + q.next);

        // แทรก n ไว้ระหว่าง p และ q (p -> n -> q)
        p.next = n;
        n.next = q;
        System.out.println("p.next After = " + p.next);
        System.out.println("n.next After = " + n.next);

        Node1<String> head = p;
        System.out.println("head. = " + head);

        q.next = m;
        System.out.println("q.next After = " + q.next);

        Node1<String> teil = m; 
        System.out.println("teil. = " + teil);
    }
}
