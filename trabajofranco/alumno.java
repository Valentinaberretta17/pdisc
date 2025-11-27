public class alumno {
    private string nombre;
    private string curso;

    public alumno(string nombre,string curso){
        this.nombre = nombre;
        this.curso = curso;
    }
    public prestamo pedirMaterial(Material material){
        if(material.isDisponible()) {
            material.prestar();
            return new prestamo(this,naterial);
        } else {
           system.out.println("el material no esta disponible.");
           return null;
        }
    }
    public void devolverMaterial(Material material) {
        material.devolver();
    }
    public string getNombre() {
        return nombre;
    }
}