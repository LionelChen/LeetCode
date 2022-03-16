package Array;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Solution_146_LRU_Cache {
    int current_size = 0;
    int capacity = 0;
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    class Node{
        int val;
        Node pre;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public Solution_146_LRU_Cache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if(map.containsKey(key)){

            Node temp = map.get(key);
            if(temp!=tail && temp!=head){//if node is not tail nor head
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                temp.next = null;
                temp.pre = head;
                head = temp;
            }else if(temp==head){//if node is head
                return temp.val;
            }else{//node is tail
                tail = temp.next;
                temp.next.pre = null;
                temp.next = null;
                temp.pre = head;
                head.next = temp;
                head = temp;
            }

            return temp.val;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        //empty
        if(current_size==0){
            Node temp = new Node(value);
            temp.pre = null;
            temp.next = null;
            head = temp;
            map.put(key, temp);
            tail = temp;
            current_size++;
            return;
        }
        if(current_size<capacity){//not full
            //check if node already exist
            if(map.containsKey(key)){
                Node temp = map.get(key);
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;

                temp.next = null;
                temp.pre = head;
                head = temp;
                if(temp==tail){
                    tail.next.pre = null;
                    tail = tail.next;
                }

            }else{
                Node temp = new Node(value);
                head.next = temp;
                temp.pre = head;
                map.put(key,temp);
                head = temp;
                current_size++;
            }

        }else{//full
            //check if node already exist
            if(map.containsKey(key)){
                Node temp = map.get(key);
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;

                temp.next = null;
                temp.pre = head;
                head = temp;


            }else{
                map.remove(tail.val);
                tail = tail.next;
                tail.pre = null;
                Node temp = new Node(value);
                head.next = temp;
                temp.pre = head;
                map.put(key,temp);
                head = temp;
            }

        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}

