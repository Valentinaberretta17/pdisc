//clase base que representa cualquier material de la bibloteca
public class Material{

//atributos comunes a todos los materiales
 protected int id;
    protected string titulo;
    protected string autor;
    protected boolean disponible = true;

//constructor pars inicializar  los datos del material
    public Material(int id, string titulo,string autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor =autor;
    }
    //metodo para marcar el material como prestado
public void prestar() {
if (disponible) {
    disponible = false;
    system.out.println("Material prestado: " +titulo);
} else {
    system.out.println("el material ya esta prestado.");
  }
}
public void devolver() {
    disponible = true;
    system.out.println("material devuelto:" + titulo);
}
public boolean isDisponible() {
    return disponible;
}

public string getTitulo() {
    return titulo;
   }
}