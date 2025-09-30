package mx.edu.uttt.arreglos;
import javax.swing.*;
import mx.edu.uttt.poo.Alumno;
public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio=0;
        tamanio= obtenerTamanio();
        Alumno alumnos[]= new Alumno[tamanio];

    }
    public static int obtenerTamanio(){
        return Integer.parseInt(JOptionPane.
                showInputDialog("Introduce el numero de alumnos a registrar"));
    }
    public static String Menu(){
        return "===== MENU PRINCIPAL =====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimir Arreglo\n" +
                "3) Salir\n" +
                "Elegir Opcion";
    }
    public static void operaciones(Alumno[] alumnos){
        String opcion= "";
        boolean sentinel= true;

        do {
            opcion= JOptionPane.showInputDialog(Menu());
            switch (opcion) {
                case "1":
                    //Lllenar arreglo
                    break;
                case "2":
                    //Imprimir arreglo
                    break;
                case "3":
                    //salir
                    JOptionPane.showMessageDialog(null, "Bye");
                    sentinel= false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion NO Valida");
            }

        } while (sentinel);
    }
    public static void llenarArrglo(Alumno[] alumnos){
        int i=0;
        boolean activo= false;
        while (i<alumnos.length){
            Alumno alumno= new Alumno();
            alumno.setNombre(JOptionPane.showInputDialog("Introduce el Nombre del Alumno [ " + i + " ]"));
            alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la Edad del Alumno [ " + i + " ]")));
            alumno.setSexo(JOptionPane.showInputDialog("Introduce el sexo del Alumno [ " + i + " ]").charAt(0));
            activo= JOptionPane.showInputDialog("Introduce el Status del Alumno [ " + i + " ] Activo/Inactivo").equalsIgnoreCase("Activo")?true:false;
            alumno.setActivo(activo);
            alumno.setProm(Double.parseDouble(JOptionPane.showInputDialog(JOptionPane.showInputDialog("Introduce el promedio del Alumno [ " + i + " ]"))));
            alumnos[i] = alumno;
            i++;
        }
    }
}
