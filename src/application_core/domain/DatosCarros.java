package application_core.domain;
import java.util.ArrayList;
import java.util.List;



public class DatosCarros {
    private List<Carro> carros = new ArrayList<Carro>(); 

    public void registrarCarro(Carro carro){
        carros.add(carro);
    }

    public List<Carro> consultarCarros(){
        return carros;
    }
    
}
