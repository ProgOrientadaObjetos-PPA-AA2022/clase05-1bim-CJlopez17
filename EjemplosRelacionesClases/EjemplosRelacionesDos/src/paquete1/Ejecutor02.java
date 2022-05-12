package paquete1;
import java.util.Scanner;
public class Ejecutor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el nombre del barrio: ");
        String nBarrio = sc.nextLine();
        Barrio b1 = new Barrio(nBarrio);
        
        System.out.println("Ingrese el nomrbre de la persona: ");
        String nombrepersona = sc.nextLine();
        System.out.println("Ingrese el numero de cedula: ");
        String cedula = sc.nextLine();

        Persona personaObejto = new Persona(nombrepersona, cedula, b1); 
        
        System.out.printf("%s\n", personaObejto);
    }
    
}
