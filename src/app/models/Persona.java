package app.models;

public class Persona {

    private int Code;
    private String Name;
    public Persona(int code, String name) {
        Code = code;
        Name = name;
    }
    public int getCode() {
        return Code;
    }
    public void setCode(int code) {
        Code = code;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString() {
        return "Persona [Code=" + Code + ", Name=" + Name + "]";
    }

    


   
    
}
