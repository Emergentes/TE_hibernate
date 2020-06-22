package entidades;

public class Anuncios  implements java.io.Serializable {
     private Integer id;
     private String titulo;
     private String contenido;
     private Integer idCategoria;

    public Anuncios() {
    }

	
    public Anuncios(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    public Anuncios(String titulo, String contenido, Integer idCategoria) {
       this.titulo = titulo;
       this.contenido = contenido;
       this.idCategoria = idCategoria;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Integer getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}


