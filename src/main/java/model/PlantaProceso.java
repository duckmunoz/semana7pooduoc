package model;

//Subclase llamada PlantaProceso que hereda de la clase UnidadOperativa
public class PlantaProceso extends UnidadOperativa {

    private String capacidadProceso;

    //Constructor de la clase PlantaProceso
    public PlantaProceso(String nombre, String comuna, String capacidadProceso){
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String getTipo(){
        return "Planta de Proceso";
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " - " +
                "Capacidad de proceso: " + capacidadProceso + " \n ";
    }
}