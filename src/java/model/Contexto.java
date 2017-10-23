package model;

public class Contexto {
  
    public int id_contexto;
    public String nombre_contexto;
    public String link;
    public int id_modelo;
    
    public Contexto () {
        
    }
    
    public Contexto (String nombre_contexto, String link, int id_modelo) {
        this.nombre_contexto=nombre_contexto;
        this.link=link;
        this.id_modelo=id_modelo;
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    public String getNombre_contexto() {
        return nombre_contexto;
    }

    public void setNombre_contexto(String nombre_contexto) {
        this.nombre_contexto = nombre_contexto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }
    
    @Override
    public String toString() {
        return "Contexto{" + "id_contexto=" + id_contexto + ", nombre_contexto=" + nombre_contexto + ", link=" + link + ", id_modelo=" + id_modelo + '}';
    }
    
}
