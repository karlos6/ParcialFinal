package application_core.domain;

public class Carro {
    private String placa;
    private double galones;
    private int modelo;

    public Carro(String placa, double galones, int modelo) {
        this.placa = placa;
        this.galones = galones;
        this.modelo = modelo;
    }

    public Carro() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGalones() {
        return galones;
    }

    public void setGalones(double galones) {
        this.galones = galones;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    

    
    
}
