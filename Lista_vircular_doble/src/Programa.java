public class Programa {

    public static void main(String[] args) {

        Lista l = new Lista();

        l.InsertarNodo();
        l.InsertarNodo();
        l.InsertarNodo();
        l.InsertarNodo();

        System.out.println(" \n Despliegue del Primero al Ultimo \n");
        l.DesplegarListaPU();

        System.out.println("\n Despliegue del Ultimo al Primero \n");
        l.DesplegarListaUP();
    }
}
