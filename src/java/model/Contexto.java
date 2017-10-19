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

    @Override
    public String toString() {
        return "Contexto{" + "id_contexto=" + id_contexto + ", nombre_contexto=" + nombre_contexto + ", link=" + link + ", id_modelo=" + id_modelo + '}';
    }
    
}
