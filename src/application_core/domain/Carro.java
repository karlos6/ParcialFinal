package application_core.domain;

/**
 * Clase Carro
 */
public class Carro {
    /**
     * Atributos de la clase carro:
     * placa    - Hace referencia a la placa de un vehiculo
     * galones  - Hace referencia a la capacidad de gasolina
     * modelo   - Hace referencia al modelo del carro
     */
    private String placa;
    private double galones;
    private int modelo;

    /**
     * Costructor del la clase Carro:
     * @param placa   - placa del carro
     * @param galones - capacidad de galones de gasolina 
     * @param modelo  - modelo del carro 
     */
    public Carro(String placa, double galones, int modelo) {
        this.placa = placa;
        this.galones = galones;
        this.modelo = modelo;
    }

    /**
     * Constructor sin parametros
     */
    public Carro() {
    }

    /**
     * Get de la placa 
     * @return optiene la placa del carro
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Set de la placa 
     * @return se modifica la placa del carro
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Get de la placa 
     * @return se optine la capacidad de en galones de gasolina del carro
     */
    public double getGalones() {
        return galones;
    }

    /**
     * Set de la placa 
     * @return se modifica la capacidad de en galones de gasolina del carro
     */
    public void setGalones(double galones) {
        this.galones = galones;
    }

    /**
     * Get de la placa 
     * @return se optine el modelo del carro
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Set de la placa 
     * @return se moddifica el modelo del carro
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }   
    
}
