/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejlistassimples;

/**
 *
 * @author cgutierrez
 */
public class SimpleList {
    private Node first;
    private Node last;
    private int size;
    
    public SimpleList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public boolean isEmpty () {
       return (this.size == 0);
    }
    
    public int getSize () {
        return this.size;
    }
    
    public void addNode (int data) {
        if (this.isEmpty()){
            Node newNode = new Node(data);
            this.first = newNode;
            this.last = newNode;
            newNode.rightNode = newNode;
        }else {
            Node newNode = new Node(data);
            newNode.rightNode = null;
            this.last.rightNode = newNode;
            this.last = newNode;
        }
        this.size ++;
    }
    
    public int deleteLastNode () {
        int data;
        if (this.isEmpty()) {
            data = -1;
        }else {
            if(this.first == this.last) {
                data = this.first.data;
                this.first = null;
                this.last = null;
            }
            else {
                Node current = this.first;
                while(current.rightNode != this.last) {
                    current = current.rightNode;
                }
                //eliminar = actual.nodoDer;
                data = current.rightNode.data;
                current.rightNode = null;
                this.last = current;
            }
            this.size--;
        }
        return data;
    }
    
    public String toString() {
        String text = "Tamaño ("+ this.size +") Values: \n";
        if(this.size != 0) {
            Node temp = this.first;
            for(int i = 0; i < this.size; i++) {
                text = text + temp.data + "\n";
                temp = temp.rightNode;
            }
        }
        return text;
    }
}
