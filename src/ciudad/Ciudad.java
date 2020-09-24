
package ciudad;

import java.util.Date;

 
public class Ciudad {
    
    private int numeroDeCiudadanos;
    private Date fechaDeFundacion;
    private String nombre;
    private String alcalde;
    private String producto; /** Es el producto en el que la ciudad se especializa en
    crear, como por ejemplo el arroz o el cafe en el eje cafetero del pais*/
    private Boolean capital; /** Si la ciudad es la capital o no del pais*/
    private String comidaTipica;

    public int getNumeroDeCiudadanos() {
        return numeroDeCiudadanos;
    }

    public void setNumeroDeCiudadanos(int numeroDeCiudadanos) {
        this.numeroDeCiudadanos = numeroDeCiudadanos;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Boolean getCapital() {
        return capital;
    }

    public void setCapital(Boolean capital) {
        this.capital = capital;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }
    
    
    public Ciudad(
            int numeroDeCiudadanos,
            Date fechaDeFundacion,
            String nombre,
            String alcalde,
            String producto,
            Boolean capital,
            String comidaTipica) {
        this.numeroDeCiudadanos = numeroDeCiudadanos;
        this.fechaDeFundacion = fechaDeFundacion;
        this.nombre = nombre;
        this.alcalde = alcalde;
        this.producto = producto;
        this.capital = capital;
        this.comidaTipica = comidaTipica;
        }
    
    
        //Agrega los nacimientos diarios de la ciudad al numero de ciudadanos
    public void nacimientosDiarios(){
        this.numeroDeCiudadanos += 500;
        }
    
        /** Cambia el alcalde de la ciudadd
        */
    public void alcaldeCiudad (String nuevoAlcalde){
        this.alcalde = nuevoAlcalde;
        }
        
    public static void main(String[] args) {
        Ciudad ciudadUno = new Ciudad(
                15850,
                new Date(),
                "Popayan",
                "Gabriel",
                "Algodon",
                false,
                "Arroz con huevo" );
        
        System.out.println(ciudadUno.getNombre());
        System.out.println(ciudadUno.getNumeroDeCiudadanos());
        System.out.println(ciudadUno.getComidaTipica());
        
        ciudadUno.nacimientosDiarios();
        
        System.out.println(ciudadUno.getNombre());
        System.out.println(ciudadUno.getNumeroDeCiudadanos());
        
    }

    
}
    