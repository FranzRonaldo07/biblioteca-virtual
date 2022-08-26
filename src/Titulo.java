import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class titulo {
    //variables
    public string titulo;
    public string edicion;
    public string isbn;
    List<Autor> autores;
    List<Categoria> categorias;
    //metodo constructor
    public Titulo() {
        System.out.println("El objeto titulo se creo");
    }
    public Titulo(String titulo,String edicion){
    this.titulo = titulo,
            this.edicion = edicion,
    }
}
