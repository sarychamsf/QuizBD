package model;

public class UnidadAbstracta {
    
    public int id_unidadA;
    public String nombre_unidadA;
    public int id_tabla;
    public int id_contexto;
    
    public UnidadAbstracta () {
        
    }

    public UnidadAbstracta(String nombre_unidadA, int id_tabla, int id_contexto) {
        this.nombre_unidadA = nombre_unidadA;
        this.id_tabla = id_tabla;
        this.id_contexto = id_contexto;
    }

    @Override
    public String toString() {
        return "UnidadAbstracta{" + "id_unidadA=" + id_unidadA + ", nombre_unidadA=" + nombre_unidadA + ", id_tabla=" + id_tabla + ", id_contexto=" + id_contexto + '}';
    }
     
}
