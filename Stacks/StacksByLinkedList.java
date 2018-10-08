/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author ShawShank
 */
public class StacksByLinkedList {

    private class Node {

        String item;
        Node next;
    }

    Node head = null;

    boolean isEmpty() {
        return head == null;
    }

    void push(String item) {

        if (head == null) {
            head = new Node();
            head.item = item;
            head.next = null;
        }
        Node oldHead = head;
        head = new Node();
        head.item = item;
        head.next = oldHead;
    }

    String pop() {
        if(head.next!=null){
             String delItem = head.item;
        head = head.next;
        return delItem;
        }else
            return "Stack is empty!";
       
    }

    void display() {
        Node temp = head;

       while (temp.next != null) {     //how is it showing the last node's element?
            System.out.println(temp.item);
            temp = temp.next;
        }

    }

    public static void main(String... s) {

        StacksByLinkedList sBLL = new StacksByLinkedList();
        sBLL.push("one");
        sBLL.push("two");
        sBLL.push("three");
        sBLL.push("four");
        sBLL.push("five");
        sBLL.push("six");
        sBLL.display();
        System.out.println("Deleted Element: "+sBLL.pop());
        System.out.println("Deleted Element: "+sBLL.pop());
        System.out.println("Deleted Element: "+sBLL.pop());

        sBLL.display();

    }
}
