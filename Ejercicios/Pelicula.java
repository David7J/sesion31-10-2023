public class Pelicula {
    //Atributos

    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;

    //Metodos constructores
    //Metodo sin parametros
    public Pelicula(){
        this("No disponible", 0, "No disponible", "No disponible", "No disponible");
    }

    //Metodo constructor con todos los parametros
    public Pelicula(String nombre, int duracion, String genero, String calidad, String clasificacion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion = clasificacion;
        
    }

    

    

    //Metodos setters y getters
    //Los metodos getters son para mostrar los valores de los atributos
    public String mostrarGenero() {
        return genero;
    }

    
    

    public String mostrarCalidad() {
        return calidad;
    }

    

    public String mostrarClasificacion() {
        return clasificacion;
    }

    public String mostrarNombre(){  //getNombre
        return this.nombre;
    }

    public int mostrarDuracion(){   //getDuracion
        return this.duracion;
    }
    //Los metodos setters son para modificar los valores de los atributos
    public void establecerNombre(String nombre){    //SetNombre()
        this.nombre = nombre;
    }

    public void establecerDuracion(int duracion){    //SetDuracion()
        if(duracion > 60){
            this.duracion = duracion;
        }else if(duracion > 0 && duracion < 60){
            this.duracion = duracion;
        }
    }

    public void establecerClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void establecerCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void modificarGenero(String genero) {
        this.genero = genero;
    }

}
