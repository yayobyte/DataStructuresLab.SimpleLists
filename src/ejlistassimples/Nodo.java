package ejlistassimples;


//Clase Nodo. Utiliza el enlace llamado nodoDer o nodo derecho y el valor a introducir.
public class Nodo {
    Nodo nodoDer;
    int dato;

    public Nodo(int dato) {
        this.dato = dato;
        this.nodoDer = null;
    }

}