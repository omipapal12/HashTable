package com.bridgelabz;
import java.util.ArrayList;

public class HashTableMain<K,V> {
    Node head;
    Node tail;
    private final int numOfBuckets;
    ArrayList<Node<K, V>> myBucketArray;
    public HashTableMain() {
        this.numOfBuckets = 20;
        this.myBucketArray = new ArrayList<>();
        for (int i = 0; i < numOfBuckets; i++)
            this.myBucketArray.add(null);
    }
    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        Node<K, V> myNode = this.myBucketArray.get(index);
        if (myNode == null) {
            myNode = new Node<>(key, value);
            this.myBucketArray.set(index, myNode);
        }
        myNode = (Node<K, V>) searchNode(key);
        if (myNode == null) {
            myNode = new Node<>(key, value);
            this.append(myNode);
        } else {
            myNode.setValue(value);
        }
    }
    private Node<K, V> searchNode(K key) {
        return null;
    }
    private int getBucketIndex(K key) {
        // TODO Auto-generated method stub
        return 0;
    }
    // Append the value in the linked list
    public void append(Node myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public Integer get(String word) {
        return null;
    }
    public void remove(String string) {
    }
}