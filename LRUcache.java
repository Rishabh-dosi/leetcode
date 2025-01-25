import java.util.HashMap;
import java.util.Map;

public class LRUcache {
    public class Node {
        int value, key;
        Node prev, next;

        Node(int key, int value) {
            this.value = value;
            this.key = key;

        }
    }

    Map<Integer, Node> mp = new HashMap<>();
    Node head = new Node(0, 0);
    Node tail = new Node(-1, -1);
    private int capacity;

    public void insert(Node n) {
        mp.put(n.key, n);
        n.next = head.next;
        n.next.prev = n;
        head.next = n;
        n.prev = head;

    }

    public void remove(Node n) {
        mp.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    public void LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!mp.containsKey(key)) {
            return -1;
        } else {
            Node n = mp.get(key);
            remove(n);
            insert(n);
            return n.value;
        }
    }

    public void put(int key, int value) {
        if (mp.containsKey(key))
            remove(mp.get(key));
        if (mp.size() == capacity) {
            remove(tail.prev);

        }
        insert(new Node(key, value));
    }

}
