/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_pila;

import Modelo.Auto;
import java.util.Stack;

public class Ejemplo_Pila {

    public static void main(String[] args) {
        //Definimos la Pila
        Stack<Auto> pila = new Stack<>();
        // Apilamos Elemetos a la Pila
        pila.push(new Auto("CHEVROLET","JOY PLUS"));
        pila.push(new Auto("CHEVROLET","ONIX LT"));
        pila.push(new Auto("CHEVROLET","TRACKER AT"));
        pila.push(new Auto("CHEVROLET","SPIN MT"));
        // Imprimimos los Elementos de la Pila
        System.out.println("1. Elementos de la Pila: " + pila);
        // Último Elemento Insertado
        System.out.println("2. Último Elemento Apilado: " + pila.peek().getModelo());
        
        System.out.println("3. Elemetos Desapilados: ");
        while(!pila.empty()){   // Si no está Vacia 
         System.out.println(pila.pop().getModelo()); // Desapilar Elementos de la Pila
        }
     
    }

}
