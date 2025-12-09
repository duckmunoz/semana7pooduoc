package model;

//Clase padre
public class UnidadOperativa {

    private String nombre;

    private String comuna;

    //Constructor de la clase UnidadOperativa: inicializa los atributos
    public UnidadOperativa(String nombre, String comuna){
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getTipo(){
        return "Unidad Operativa";
    }

    public String mostrarInformacion(){
        return "Tipo: " + getTipo() +
                "\nNombre: " + this.nombre +
                "\nComuna: " + this.comuna;
    }

}
