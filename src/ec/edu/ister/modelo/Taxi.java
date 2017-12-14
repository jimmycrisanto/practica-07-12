/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public class Taxi extends Vehiculo{
  public  Taxi(){
      
  }
    private int numeroLicencia;

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(int numeroLicencia, String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public void consumo() {
        JOptionPane.showMessageDialog(null, "los taxis consumen 12 galones de gasolina  extra");
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +"este es un taxi " ; //To change body of generated methods, choose Tools | Templates.
    }

    
}
