package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.UnidadAbstracta;
import util.DbUtil;

public class UnidadAbstractaDAO {

    private Connection connection;

    public UnidadAbstractaDAO() {
        connection = DbUtil.getConnection();
    }

    public void addUnidadAbstracta(UnidadAbstracta unidadAbstracta) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into unidad_adi(nombre_unidad, id_tabla, id_contexto) values (?, ?, ?)");
        preparedStatement.setString(1, unidadAbstracta.nombre_unidad);
        preparedStatement.setInt(2, unidadAbstracta.id_tabla);
        preparedStatement.setInt(3, unidadAbstracta.id_contexto);
        preparedStatement.executeUpdate();
    }

    public ArrayList<UnidadAbstracta> getAllUnidadAbstracta() throws SQLException {
        ArrayList<UnidadAbstracta> unidadesAbstractas = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from unidad_adi");
        while (rs.next()) {
            UnidadAbstracta unidadAbstracta = new UnidadAbstracta(rs.getString("nombre_unidad"), rs.getInt("id_tabla"), rs.getInt("id_contexto"));
            unidadesAbstractas.add(unidadAbstracta);
        }
        return unidadesAbstractas;
    }

}
