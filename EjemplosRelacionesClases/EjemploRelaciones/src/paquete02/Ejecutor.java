/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import paquete03.Autor;
public class Ejecutor {

    public static void main(String[] args) {
        // Se crea un objeto de tipo Autor
        Autor aut = new Autor("José", "Alvear");
        String pass = "KSKVjjsj45dfd544";
        aut.establecerPasaporte(pass);

        // Se crea un objeto de tipo Publicación
        int anioPublicacion = 2000;
        
        Publicacion p = new Publicacion(aut, anioPublicacion);
        
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\nPasaporte: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion(),
                p.obtenerAutor().obtenerPasaporte());
        
        aut.establecerApellido("Elizalde");
        
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion(),
                p.obtenerAutor().obtenerPasaporte()););
        
        
    }
}
