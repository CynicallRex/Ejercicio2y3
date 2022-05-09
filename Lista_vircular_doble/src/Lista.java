import java.util.Scanner;

public class Lista {
    Scanner teclado = new Scanner(System.in);
    Nodo Primero;
    Nodo Ultimo;

    public Lista(){
        Primero = null;
        Ultimo = null;
    }

    public void InsertarNodo(){
        Nodo Nuevo = new Nodo();
        System.out.println(" Ingrese el dato del nuevo Nodo");
        Nuevo.dato = teclado.nextInt();

        if (Primero == null){
            Primero = Nuevo;
            Ultimo = Nuevo;
            Primero.siguiente = Primero;
            Ultimo.anterior = Ultimo;
        }else {
            Ultimo.siguiente = Nuevo;
            Nuevo.siguiente = Primero;
            Nuevo.anterior = Ultimo;
            Ultimo = Nuevo;
            Primero.anterior = Ultimo;
        }
        System.out.println("\n Nodo ingresado con exito \n");
    }

    public void DesplegarListaPU(){
        Nodo Actual = new Nodo();
        Actual = Primero;
        if (Primero != null){
            do {
                System.out.println(Actual.dato);
                Actual = Actual.siguiente;
            }while (Actual != Primero);
        }else {
            System.out.println("\n La lista seencuentra vacia \n");
        }
    }
    public void DesplegarListaUP(){
        Nodo Actual = new Nodo();
        Actual = Ultimo;
        if (Primero != null){
            do {
                System.out.println(Actual.dato);
                Actual = Actual.anterior;
            }while (Actual != Ultimo);
        }else{
            System.out.println("\n La lista seencuentra vacia \n");
        }
    }
}

