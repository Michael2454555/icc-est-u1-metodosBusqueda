package app.controllers;
import app.models.Persona;
import app.views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;

    public MetodosBusqueda(Persona [] persons){
        showConsole = new ShowConsole();
        this.people= persons;
        showPerson();
        // showPersonByName();
    }
    

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;

    }
    




    public int findPersonByCode(int code ){
        for(int i=0; i < people.length; i++){
            if (people [i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    

    public void showPerson(){
        int codeToFind =showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >=0){
            showConsole.showMessage("Persona con codigo" +" "+codeToFind+" "+ "encontrada");
            showConsole.showMessage((String)people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson]+"");
        }else{
            showConsole.showMessage("Persona no encontrada");
        }
    }
    public int findPersonByName(String name){
        return -1;
    }
    // public void showPersonByName(){
    //     String nameTofinde= showConsole.inputName();
    //     int indexPerson = findPersonByName(nameTofinde);
    //     if (indexPerson >=0){
    //         showConsole.showMessage("Nombre persona" +" "+nameTofinde+" "+ "encontrada");
    //         showConsole.showMessage((String)people[indexPerson].toString());
    //         showConsole.showMessage(people[indexPerson]+"");

    //     }
    // }
}