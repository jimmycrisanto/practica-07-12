package ec.edu.ister.modelo;

import ec.edu.ister.vista.registro;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public  class Autobus extends Vehiculo{
    public Autobus(){
        
    }
    private int numeroPlazas;

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Autobus(int numeroPlazas, String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    @Override
    public void consumo() {
        registro reg = new registro();
        reg.setVisible(true);
    }

}
