package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

//Clase que gestiona las unidades operativas
public class GestorUnidades {
    private List<UnidadOperativa> unidad = new ArrayList<>();

    //Constructor de la clase GestorUnidades
    public GestorUnidades() {
        UnidadOperativa c1 = new CentroCultivo("Cultivos Tera ", "Talcahuano", "3000");
        UnidadOperativa c2 = new CentroCultivo("Prisma Cultivos", "Coronel", "5000");
        UnidadOperativa p1 = new PlantaProceso("Procesos Quadra", "Macul", "10000");
        UnidadOperativa p2 = new PlantaProceso("Planta Penta", "Huechuraba", "5000");
        UnidadOperativa p3 = new PlantaProceso("Procesos Prima", "San Bernardo", "4000");
        unidad.add(c1);
        unidad.add(c2);
        unidad.add(p1);
        unidad.add(p2);
        unidad.add(p3);
    }

    public List<UnidadOperativa> getUnidades(){
        return unidad;
    }


}

