
package ciudad;

import java.util.Date;

public class CiudadTecnologica extends Ciudad{
    private float velocidadDeInternet;
    private int nivelDeEconomia;
    private String tipoPromedioDeComputadoras;

    public CiudadTecnologica(int numeroDeCiudadanos, 
            Date fechaDeFundacion, 
            String nombre, 
            String alcalde, 
            String producto, 
            Boolean capital, 
            String comidaTipica,
            float velocidadDeInternet,
            int nivelDeEconomia,
            String tipoPromedioDeComputadoras) {
        super(numeroDeCiudadanos, 
                fechaDeFundacion,
                nombre, 
                alcalde, 
                producto, 
                capital, 
                comidaTipica);
        this.nivelDeEconomia = nivelDeEconomia;
        this.tipoPromedioDeComputadoras = tipoPromedioDeComputadoras;
        this.velocidadDeInternet = velocidadDeInternet;
    }

    public float getVelocidadDeInternet() {
        return velocidadDeInternet;
    }

    public void setVelocidadDeInternet(float velocidadDeInternet) {
        this.velocidadDeInternet = velocidadDeInternet;
    }

    public int getNivelDeEconomia() {
        return nivelDeEconomia;
    }

    public void setNivelDeEconomia(int nivelDeEconomia) {
        this.nivelDeEconomia = nivelDeEconomia;
    }

    public String getTipoPromedioDeComputadoras() {
        return tipoPromedioDeComputadoras;
    }

    public void setTipoPromedioDeComputadoras(String tipoPromedioDeComputadoras) {
        this.tipoPromedioDeComputadoras = tipoPromedioDeComputadoras;
    }
    
    
 
}
