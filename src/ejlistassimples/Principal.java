package ejlistassimples;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        /*
        SimpleList list = new SimpleList();

        list.addNode(5);
        list.addNode(10);
        list.addNode(15);

        JOptionPane.showMessageDialog(null, list.toString());

        JOptionPane.showMessageDialog(null, "Elemento Eliminado: " + list.deleteLastNode());

        JOptionPane.showMessageDialog(null,list.toString());
        
        JOptionPane.showMessageDialog(null, "Elemento Eliminado: " + list.deleteLastNode());
        
        JOptionPane.showMessageDialog(null,list.toString());
        
        JOptionPane.showMessageDialog(null, "Elemento Eliminado: " + list.deleteLastNode());
        
        JOptionPane.showMessageDialog(null,list.toString());
        
        JOptionPane.showMessageDialog(null, "Elemento Eliminado: " + list.deleteLastNode());
*/        

        Cola col = new Cola(3);

        JOptionPane.showMessageDialog(null, col.toString());

        col.push(3);
        JOptionPane.showMessageDialog(null, col.toString());

        col.push(4);
        JOptionPane.showMessageDialog(null, col.toString());

        col.push(5);
        JOptionPane.showMessageDialog(null, col.toString());

        col.pop();
        JOptionPane.showMessageDialog(null, col.toString());

        col.pop();
        JOptionPane.showMessageDialog(null, col.toString());

        col.pop();
        JOptionPane.showMessageDialog(null, col.toString());

    }
}
