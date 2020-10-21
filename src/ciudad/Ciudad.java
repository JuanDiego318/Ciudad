
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
    
    private Empresas empresasPrincipales = null;
    private Bancos bancoEspecial;
    private Ciudadano personaImportante;
    
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
        this.personaImportante = new Ciudadano("Florez");
        }

    public Ciudadano getPersonaImportante() {
        return personaImportante;
    }

    public Empresas getEmpresasPrincipales() {
        return empresasPrincipales;
    }

    public void setEmpresasPrincipales(Empresas empresasPrincipales) {
        this.empresasPrincipales = empresasPrincipales;
    }

    public Bancos getBancoEspecial() {
        return bancoEspecial;
    }

    public void setBancoEspecial(Bancos bancoEspecial) {
        this.bancoEspecial = bancoEspecial;
    }
    
    

    
    

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
    
    
    
    
    
        //Agrega los nacimientos diarios de la ciudad al numero de ciudadanos
    public void nacimientosDiarios(){
        this.numeroDeCiudadanos += 500;
        this.capital = true;
        }
    
        /** Cambia el alcalde de la ciudadd
        */
    public void alcaldeCiudad(){
        this.alcalde = "santiago";
        }
    
    public void productoGenerado(){
        this.producto = "cafe";
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
        
        Bancos banco1 = new Bancos(
                10, 
                "BanColombia");
                
        
    
        
        System.out.println("DATOS AÑO 2019");
        
        System.out.println(ciudadUno.getNombre());
        System.out.println(ciudadUno.getNumeroDeCiudadanos());
        System.out.println(ciudadUno.getComidaTipica());
        System.out.println(ciudadUno.getAlcalde());
        System.out.println(ciudadUno.getProducto());
        
        
        ciudadUno.nacimientosDiarios();
        ciudadUno.alcaldeCiudad();
        
        System.out.println("---DATOS ACTUALIZADOS PARA NUEVO AÑO---");
        
        System.out.println(ciudadUno.getNombre());
        System.out.println(ciudadUno.getNumeroDeCiudadanos());
        System.out.println(ciudadUno.getComidaTipica());
        System.out.println(ciudadUno.getCapital());
        System.out.println(ciudadUno.getAlcalde());
        System.out.println(ciudadUno.getProducto());
        
        System.out.println("---BANCOS DE COLOMBIA---");
        ciudadUno.setBancoEspecial(banco1);
        System.out.println(ciudadUno.getBancoEspecial().getNombre());
        System.out.println(ciudadUno.getBancoEspecial().getCantidad());
        
        
        
    }

    
}
    