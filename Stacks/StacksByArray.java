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
public class StacksByArray {

    String itemArray[];
    private int counter = 0;

    public StacksByArray() {
        itemArray = new String[99];
    }

    void push(String item) {

        itemArray[counter] = item;
        counter++;

    }

    String pop() {
        if (isEmpty()) {
            return "Stack is Empty!";
        } else {
            String poppedItem = itemArray[--counter];
            counter--;
            return poppedItem;
        }

    }

    boolean isEmpty() {
        return (counter == -1 || counter == 0);  //something is wrong with this condition
    }

    void display() {
        if (isEmpty()) {
            System.out.print("Stack is Empty!");
        } else {
            int i = --counter;
            while (i != -1) {
                System.out.println(itemArray[i]);
                --i;
            }
        }
    }

    public static void main(String... a) {
        
        StacksByArray sBA = new StacksByArray();
        sBA.push("One");
        sBA.push("Two");
        sBA.push("Three");
        sBA.push("Four");
        System.out.println("Pop Performed: " + sBA.pop());
        sBA.push("Five");

        sBA.display();

    }

}
