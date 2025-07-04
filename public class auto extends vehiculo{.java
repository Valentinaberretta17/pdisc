public class auto extends vehiculo{
    private int cantidadpuertas;

    public auto(string patente,int año,string dueño, int cantidadpuertas) {
        super(patente,año,dueño);
        this.csntidadpuertas = cantidadpuertas;
    }
@Override
public void mostrardatos(){
    super.mostrardatos();
    system.out.println("tipo: auto");
    system.out.println("cantidad de puertas: "n+ this.cantidadpuertas);

}
@Override
public  double calcularimpuesto() {
    double impuestobase = 1000.0;
    return impuestobase + (cantidadpuertas * 50.0);
}
public int getcantidadpuertas() {
    return cantidadpuertas;
  }
}