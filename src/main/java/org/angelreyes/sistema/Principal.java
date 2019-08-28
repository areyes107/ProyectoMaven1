package org.angelreyes.sistema;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.angelreyes.dominio.Persona;


public class Principal {
    public static void main(String[] args){
        int contador =1;
        EntityManagerFactory enmanfac = Persistence.createEntityManagerFactory("ConexionDB"); //Interfaz para interactuar con la unidad de persistencia, no posee un constructor.
        EntityManager enman = enmanfac.createEntityManager();
        while(contador<=5){
        Persona persona = enman.find(Persona.class, contador); //buscamos el registro o tupla
        System.out.println(persona);
        contador++;
        }
        enmanfac.close();
        enman.close();
        
    }
}
