public class Autor {
    //nombres globales
    public string nombre;
    public string primerApellido;
    public string segundoApellido;

    public Autor(String nombre,String primerApellido){
this.nombre = nombre;
this.primerApellido = primerApellido;
}
    public Autor(String nombre,String primerApellido,String segundoApellido){
this.nombre = nombre;
this.primerApellido = primerApellido;
this.segundoApellido = segundoApellido;
}
}