import application_core.domain.Carro;
import application_core.domain.DatosCarros;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Objeto de tipo DatosCarros.  
         */        
        DatosCarros datosVehiculos = new DatosCarros();

        /**
         * Objetos de tipo carro.
         */
        Carro car1 = new Carro("12HD1",15.4,1234);
        Carro car2 = new Carro("99KS2",25.7,9876);
        Carro car3 = new Carro("69D21",30.2,3456);
        Carro car4 = new Carro("31JH2",17.7,3245);
        Carro car5 = new Carro("902Y8",23.5,6321);     
        
        /**
         * Registro de los carros e insercion.
         * (Metodo registrarCarro)
         */
        datosVehiculos.registrarCarro(car1);
        datosVehiculos.registrarCarro(car2);
        datosVehiculos.registrarCarro(car3);
        datosVehiculos.registrarCarro(car4);
        datosVehiculos.registrarCarro(car5);

        /**
         * Muestra los carros registrados
         * (Metodo consultarCarros)
         */
        System.out.println("Lista de carros:");
        for (Carro car : datosVehiculos.consultarCarros()) {
            System.out.println("placa: "+car.getPlaca()+" Galones:"+car.getGalones()+" Modelo: "+car.getModelo());           
        }

        /**
         * Busca un carro segun su placa.
         * (Metodo buscarCarro)
         */
        System.out.println("");
        System.out.println("Buscar carro segun su placa:");
        Carro c = datosVehiculos.buscarCarro("12HD1");
        System.out.println("placa: "+c.getPlaca()+" Galones:"+c.getGalones()+" Modelo: "+c.getModelo());






        



    


    }
}
