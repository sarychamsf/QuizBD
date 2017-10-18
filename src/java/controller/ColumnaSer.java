package controller;

import dao.ColumnaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Columna;

public class ColumnaSer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("menu.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ColumnaDAO columna_dao = new ColumnaDAO();
        String nombre_columna = request.getParameter("nombre_columna");
        String data_type = request.getParameter("data_type");
        int id_tabla = Integer.parseInt(request.getParameter("id_tabla"));

        Columna columna = new Columna(nombre_columna, data_type, id_tabla);

        try {
            columna_dao.addColumna(columna);
        } catch (SQLException ex) {
            Logger.getLogger(SchemaSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("menu.html");

    }

}
