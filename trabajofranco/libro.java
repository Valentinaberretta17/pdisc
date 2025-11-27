public class libro extends material {
    private string genero;

    public libro(int id,string titulo,string autor,string genero) {
        super(id,titulo,autor);
        this.genero = genero;
    }
}