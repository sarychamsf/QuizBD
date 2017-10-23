package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Contexto;
import util.DbUtil;

public class ContextoDAO {

    private Connection connection;

    public ContextoDAO() {
        connection = DbUtil.getConnection();
    }

    public void addContexto(Contexto contexto) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into contexto_n(nombre_contexto, link, id_modelo) values (?, ?, ?)");
        preparedStatement.setString(1, contexto.nombre_contexto);
        preparedStatement.setString(2, contexto.link);
        preparedStatement.setInt(3, contexto.id_modelo);
        preparedStatement.executeUpdate();
    }

    public ArrayList<Contexto> getAllContexto() throws SQLException {
        ArrayList<Contexto> contextos = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * contexto_n");
        while (rs.next()) {
            Contexto unidadAbstracta = new Contexto(rs.getString("nombre_unidad"), rs.getString("link"), rs.getInt("id_contexto"));
            contextos.add(unidadAbstracta);
        }
        return contextos;
    }

}
