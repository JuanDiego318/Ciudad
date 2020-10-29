/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portadora;

/**
 *
 * @author JuanDi
 */
public class ciudades {
    private String Ciudad;
    private String Alcalde;
    private int Ciudadanos;
    private Boolean Capital;
    private String EmpresaPrinc;

    public ciudades(String Ciudad, String Alcalde, int Ciudadanos, boolean Capital, String EmpresaPrinc){
        this.Ciudad = Ciudad;
        this.Alcalde = Alcalde;
        this.Capital = Capital;
        this.Ciudadanos = Ciudadanos;
        this.EmpresaPrinc = EmpresaPrinc;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getAlcalde() {
        return Alcalde;
    }

    public void setAlcalde(String Alcalde) {
        this.Alcalde = Alcalde;
    }

    public int getCiudadanos() {
        return Ciudadanos;
    }

    public void setCiudadanos(int Ciudadanos) {
        this.Ciudadanos = Ciudadanos;
    }

    public boolean getCapital() {
        return Capital;
    }

    public void setCapital(boolean Capital) {
        this.Capital = Capital;
    }

    public String getEmpresaPrinc() {
        return EmpresaPrinc;
    }

    public void setEmpresaPrinc(String EmpresaPrinc) {
        this.EmpresaPrinc = EmpresaPrinc;
    }


}
    
