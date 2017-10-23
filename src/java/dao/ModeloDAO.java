package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

}
