package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Esquema;
import model.Modelo;
import util.DbUtil;

public class ModeloDAO {
    
    private Connection connection;

    public ModeloDAO() {
        connection = DbUtil.getConnection();
    }

    public void addModelo(Modelo modelo) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into modelo_navegacion(nombre_modelo) values (?)");
        preparedStatement.setString(1, modelo.nombre_modelo);
        preparedStatement.executeUpdate();
    }

    public void deleteModelo(int id_modelo) throws SQLException {
        
        PreparedStatement rs = connection.prepareStatement("select * from contexto_n where id_modelo=?");
        rs.setInt(1, id_modelo);
        ResultSet rt=rs.executeQuery();
        ContextoDAO cd=new ContextoDAO();
        while (rt.next()) {
            cd.deleteContexto(rt.getInt("id_modelo"));
        }
        PreparedStatement preparedStatement = connection.prepareStatement("delete from modelo_navegacion where id_modelo=?");
        preparedStatement.setInt(1, id_modelo);
        preparedStatement.executeUpdate();
    }

    public void updateModelo(String modelo,int id_modelo) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update modelo_navegacion set nombre_modelo=?" + " where id_modelo=?");
        preparedStatement.setString(1, modelo);
        preparedStatement.setInt(2, id_modelo);
        preparedStatement.executeUpdate();
    }

    public ArrayList<Modelo> getAllModelo() throws SQLException {
        ArrayList<Modelo> modelos = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from modelo_navegacion");
        while (rs.next()) {
            Modelo modelo = new Modelo(rs.getInt("id_modelo"), rs.getString("nombre_modelo"));
            modelos.add(modelo);
        }
        return modelos;
    }

    public Modelo getModeloById(int id_modelo) throws SQLException {
        Modelo modelo = new Modelo();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from modelo_navegacion where id_modelo=?");
        preparedStatement.setInt(1, id_modelo);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            modelo.id_modelo = rs.getInt("id_modelo");
            modelo.nombre_modelo = rs.getString("nombre_modelo");
        }
        return modelo;
    }   
    
}
