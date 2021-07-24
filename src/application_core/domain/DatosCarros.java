package application_core.domain;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase DatosCarro
 */
public class DatosCarros {

    /**
     * Atributos de la clase DatosCarros:
     * Carros - lista donde se van a almacenar los carros
     */
    private List<Carro> carros = new ArrayList<Carro>(); 

    /**
     * Metodo registrarCarro:
     * Metodo para almacenar objetos de tipo carro en la lista de carros
     * @param carro - parametro de tipo carro que ingresa para ser almacenado en la lista de carros
     */
    public void registrarCarro(Carro carro){
        carros.add(carro);
    }

    /**
     * Metodo consultarCarros:
     * Metodo para retornar la lista de los carros almacenados en la lista de carros.
     * @return la lista de carros
     */
    public List<Carro> consultarCarros(){
        return carros;
    }

    /**
     * Metodo buscarCarro:
     * Metodo para buscar un carro individualmente
     * @param placa - resive como parametro la placa para posteriormente ser buscado.
     * @return retorna el carro segun su placa, si no lo encuentra retorna null.
     */
    public Carro buscarCarro(String placa){
        for (Carro car : carros){
            if (placa.equals(car.getPlaca())){
                return car;
            }
        }
        System.out.println("El carro no fue encontrado");
        return null;
    }
    
}
