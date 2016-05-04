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
public class Cola {
    
    private int size;  
    private int cola[]; 
    private int front;
    private int end; 
   
    public Cola (int size) {
        this.front = 0;   
        this.end = 0;
        this.size = size;
        cola = new int[size];
    }
    
    public boolean push(int data) {
        if(this.end == this.size) {
            return false;
        }else{
            cola[this.end]=data;
            this.end++;
            return true;
        }
    }
    
    public int pop() {
        int data;
        if(this.front == this.end) {  // Esta vacia la Cola?
            return 0;
        }else{
            data = cola[this.front];
            cola[this.front] = 0;
            this.front++;
            return data; 
        }
    }
    
    public String toString() {
        String text = "Cantidad elementos ("+ (this.end - this.front) +") Values: \n";
        if(this.front == this.end) {
            text = text + "Cola Vacia\n";
        }
        for(int i=this.front; i<this.end; i++) {
            text = text + "cola["+i+"]= " + cola[i] + "\n";
        }
        text = text + "\nFrente= "+this.front+" \nFinal = "+this.end+" \nTamaño  = "+this.size;
        return text;
    }
}
