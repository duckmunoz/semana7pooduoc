package model;

//Subclase llamada CentroCultivo que hereda de la clase UnidadOperativa
public class CentroCultivo extends UnidadOperativa {

    private String toneladasProduccion;

    //Constructor de la clase CentroCultivo
    public CentroCultivo(String nombre, String comuna, String toneladasProduccion){
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String getTipo() {
        return "Centro Cultivo";
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " - " +
                "Toneladas de produccion: " + toneladasProduccion + " \n ";
    }
}

