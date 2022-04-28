import javax.swing.*;

public class Ejercicio {
    public static void main(String[] args) {
        Lista listita = new Lista();
        int opcion = 0, el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al Inicio de la Lista\n 2. Mostrar los Datos de la Lista\n"
                                +"3.Salir","Menu de Opciones",3));
                switch (opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Elemento",
                                    "Insertando al Inicio",3));
                            listita.agregarAlInicio(el);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                        }
                        break;
                    case 2:
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Eleccion Incorrecta");
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            }
        }while (opcion != 3);
    }
}
