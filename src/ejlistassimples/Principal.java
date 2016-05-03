package ejlistassimples;


public class Principal {

    public static void main(String[] args) {

        ListaS list = new ListaS();

        list.addLast(5);
        list.addLast(10);
        list.addLast(15);

        list.tamano();
        list.imprimir();

        list.deleteLast();

        list.tamano();
        list.imprimir();
        
        list.deleteLast();
        
        list.tamano();
        list.imprimir();
        
        list.deleteLast();
        
        list.tamano();
        list.imprimir();
        
        list.deleteLast();

    }
}
