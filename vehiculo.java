public abstract class vehiculo{
    private string patente;
    private int año;
    private  string dueño;

    public vehiculo(string patente ,int año,string dueño) {
        this.patente=patente;
        this.año= año
        this.dueño=dueño
    }
    public void mostrardaatos(){
        System.out.println("--- datos del vehiculo ---");
System.out.println("patente: " + this.patente);
System.out.println("año: " + this.año);
System.out.println("dueño:" + this.dueño);
    }
    public abstract double calcularimpuesto();
    public string getPatente() {
        return this.patente;
    }
    public int año() {
        return  this.año;
 }
 public string getdueño(){
    return this.dueño;
 }
    }
}      x                                                                                                                                                                                                                        