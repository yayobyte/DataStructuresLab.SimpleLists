package ejlistassimples;

import javax.swing.*;

public class Principal {
    
    public static final String[] options = { "1", "2", "3", "4", "5", "6", "Salir" };

    public static void main(String[] args) {
        
        int c,temp,numbers = 5;
        int[] nArray = new int[5] ;
        JFrame frame = new JFrame("Input Dialog Example 3");
        String option;
        Cola cola = new Cola(5);
        SimpleList list = new SimpleList();
        
        
        for (c=0; c<numbers; c++){
            nArray[c] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese número: " + (c+1),null));
        }
        
        do{
            option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué opción desea ejecutar?\n\n" + 
                "1 - (Colas) Ingresarlo a la cola y sumarlo a medida que se haga pop\n" + 
                "2 - (Listas Simples) Ingresarlo a la lista y sumarlo a medida que se elimine\n" + 
                "3 - (Colas) Ingresarlo a la cola y mostrar el que esté en la 3ra pocisión\n" + 
                "4 - (Listas Simples) Ingresarlo a la lista y mostrar el que esté en la 3ra pocisión\n" + 
                "5 - (Colas) Ingresarlo a la cola y contar cuantos numeros mayores e iguales a 5 hay\n" + 
                "6 - (Listas Simples) Ingresarlo a la lista y contar cuantos numeros mayores e iguales a 5 hay\n" + 
                "Salir"
                ,
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        
            switch (option){
                case "1":
                    for (c=0; c<numbers; c++){
                        cola.push(nArray[c]);
                    }
                    temp =0;
                    c=0;
                    do {
                        JOptionPane.showMessageDialog(null, cola.toString());
                        temp +=cola.pop();
                        JOptionPane.showMessageDialog(null, "La suma va: \n" + temp);
                        c++;
                    }while (c<5);
                    
                    break;
                case "2":
                    for (c=0; c<numbers; c++){
                        list.addNode(nArray[c]);
                    }
                    temp =0;
                    c=0;
                    do {
                        JOptionPane.showMessageDialog(null, list.toString());
                        temp +=list.deleteLastNode();
                        JOptionPane.showMessageDialog(null, "La suma va: \n" + temp);
                        c++;
                    }while (c<5);
                    
                    break;
                case "3":
                    for (c=0; c<numbers; c++){
                        cola.push(nArray[c]);
                    }
                    JOptionPane.showMessageDialog(null, cola.toString());
                    for (c=0; c<2; c++){ //Hacer POP 2 veces para pararse en el 3 elemento
                        cola.pop();
                    }
                    JOptionPane.showMessageDialog(null, "El elemento list(3): \n" + cola.pop());
                    break;
                case "4":
                    for (c=0; c<numbers; c++){
                        list.addNode(nArray[c]);
                    }
                    JOptionPane.showMessageDialog(null, list.toString());
                    for (c=0; c<2; c++){ //Hacer POP 2 veces para pararse en el 3 elemento
                        list.deleteLastNode();
                    }
                    JOptionPane.showMessageDialog(null, "El elemento list(3): \n" + list.deleteLastNode());
                    break;
                case "5":
                    for (c=0; c<numbers; c++){
                        cola.push(nArray[c]);
                    }
                    temp =0;
                    JOptionPane.showMessageDialog(null, cola.toString());
                    for (c=0; c<5; c++){ 
                        temp +=(cola.pop() >= 5)? 1 : 0;
                    }
                    JOptionPane.showMessageDialog(null, "Numeros mayores o iguales a 5: \n" + temp);
                    break;
                case "6":
                    for (c=0; c<numbers; c++){
                        list.addNode(nArray[c]);
                    }
                    temp =0;
                    JOptionPane.showMessageDialog(null, list.toString());
                    for (c=0; c<5; c++){ 
                        temp +=(list.deleteLastNode() >= 5)? 1 : 0;
                    }
                    JOptionPane.showMessageDialog(null, "Numeros mayores o iguales a 5: \n" + temp);
                    break;
                    
            }
        }while (!"Salir".equals(option));
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios" );
        System.exit(0);
    }
}
