package app.controllers;

import app.models.Persona;
import app.views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] personas;
    private ShowConsole pantalla;
    
    public MetodosBusquedaBinaria(Persona[] personas){
        
       this.personas=personas;
       this.pantalla = new ShowConsole();
       pantalla.showMessage("Metodo de Busqueda Binaria");
    }

    private int findPersonbyCode(int code){
        int bajo = 0;
        int alto = personas.length-1;
        while (alto>=bajo) {
            int central = (alto+bajo)/2;
            if (personas[central].getCode() == code){
                return central;

            }
            if(personas[central].getCode()> code){
                alto= central-1;

            }else{
                bajo=central+1;
            }
            
            
        }
       
        return -1;
    }
    


    
    public void showPersonByCode(){

        int codeToFinde = pantalla.inputCode();
        int indexPersona = findPersonbyCode(codeToFinde);
        if(indexPersona == -1){
            pantalla.showMessage("Persona con codigo " +codeToFinde+" no encontrada");

        }else{
            pantalla.showMessage("Persona con codigo "+" "+codeToFinde+" "+"  encontrada");
            pantalla.showMessage(personas[indexPersona].toString());
        }
        System.out.println("");
    }
    public static void ordenarBurbuja(Persona[] personas){
        int n = personas.length;
        for(int i=0; i < n - 1; i++){
            for(int j =0 ; j < n-1-i;j++){
                if(personas[j].getName().compareTo(personas[j+1].getName())>0){
                    Persona temp=personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = temp;
                }
            }
        }
    }
    private int findPersonbyName(String name){
        int bajo = 0;
        int alto = personas.length-1;
        while (alto>=bajo) {
            int central1 = (alto+bajo)/2;
            if (personas[central1].getName() == name ){
                return central1;

            }
            if(personas[central1].getName().equalsIgnoreCase(name)){

            }
            if(personas[central1].getName().compareToIgnoreCase(name) < 0){
                alto= central1-1;

            }else{
                bajo=central1+1;
            }
            
            
        }
        return -1;
    }
    public void showPersonaByName(){
        
        String nameToFinde=pantalla.inputName();
        int indexPersona = findPersonbyName(nameToFinde);
        if(indexPersona>=0){
            pantalla.showMessage("Nombre persona" +" "+nameToFinde+" "+ "encontrada");
            pantalla.showMessage(personas[indexPersona].toString());


        }

    }

}