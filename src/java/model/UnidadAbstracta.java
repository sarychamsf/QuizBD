package model;

public class UnidadAbstracta {
    
    public int id_unidad;
    public String nombre_unidad;
    public int id_tabla;
    public int id_contexto;
    
    public UnidadAbstracta () {
        
    }

    public UnidadAbstracta(String nombre_unidad, int id_tabla, int id_contexto) {
        this.nombre_unidad = nombre_unidad;
        this.id_tabla = id_tabla;
        this.id_contexto = id_contexto;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getNombre_unidad() {
        return nombre_unidad;
    }

    public void setNombre_unidad(String nombre_unidad) {
        this.nombre_unidad = nombre_unidad;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    @Override
    public String toString() {
        return "UnidadAbstracta{" + "id_unidad=" + id_unidad + ", nombre_unidad=" + nombre_unidad + ", id_tabla=" + id_tabla + ", id_contexto=" + id_contexto + '}';
    }
     
}
