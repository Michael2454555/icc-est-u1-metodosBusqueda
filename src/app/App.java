package app;

import app.controllers.MetodosBusqueda;
import app.models.Persona;

public class App {

    public static void main(String[] args) {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101,  "Juan");
        personas[1] = new Persona(102,  "Maria");
        personas[2] = new Persona(103,  "Carlos");
        personas[3] = new Persona(104,  "Ana");
        personas[4] = new Persona(105,  "Luis");
        personas[5] = new Persona(106,  "Sofia");
        personas[6] = new Persona(107,  "Pedro");
        MetodosBusqueda mB = new MetodosBusqueda(personas);
        
        
        
        
        
        
        
        
        















        
        // int[] arreglo = {5, 12, 8, 21, 1, 9};
        // int valor = 21;

        // int resultado = metodos.busquedaLineal(arreglo, valor);

        // if (resultado != -1) {
        //     System.out.println("-*Valor encontrado en el índice: " + resultado);
        // } else {
        //     System.out.println("-*Valor no encontrado.");
        // }
    }
}
