import java.util.date;

public class prestado {
    private Alumno alumno;
    private Material material;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public prestamo(Alumno alumno,Material material) {
        this.alumno = alumno;
        this.material = material ;
        this.fechaPrestamo = new data();
    }
    public void registrarDevolucion(){
        this.fechaDevolucion = new date();
    }
}