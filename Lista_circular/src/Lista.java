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
        Nodo nuevo = new Nodo();
        System.out.println("Ingrese el Dato: ");
        nuevo.dato = teclado.nextInt();

        if (Primero == null){
            Primero = nuevo;
            Ultimo = nuevo;
            Primero.siguiente = Primero;
        }else {
            Ultimo.siguiente = nuevo;
            nuevo.siguiente = Primero;
            Ultimo = nuevo;
        }
        System.out.println("\n Nodo ingrsado correctamente \n");
    }

    public void DesplegarLista(){
        Nodo Actual = new Nodo();
        Actual = Primero;
        if (Primero != null){

            do {
                System.out.println(Actual.dato);
                Actual = Actual.siguiente;
            }while (Actual != Primero);

        }else {
            System.out.println("\n La lista esta vacia \n");
        }
    }
}
