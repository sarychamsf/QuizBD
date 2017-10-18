package controller;

import dao.EsquemaDAO;
import dao.TablaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Esquema;
import model.Tabla;

public class TablaSer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        EsquemaDAO ed = new EsquemaDAO();
        ArrayList<Esquema> respuesta = new ArrayList<>();
        try {
            respuesta = ed.getAllEsquemas();
        } catch (SQLException ex) {
            Logger.getLogger(TablaSer.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/agregar_tabla.jsp");
        request.setAttribute("respuesta", respuesta);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        TablaDAO tabla_dao = new TablaDAO();
        String nombre_tabla = request.getParameter("nombre_tabla");
        System.out.println(nombre_tabla);
        System.out.println(request.getParameter("id_esquema"));
        int id_esquema = Integer.parseInt(request.getParameter("id_esquema"));

        Tabla tabla = new Tabla(nombre_tabla, id_esquema);

        try {
            tabla_dao.addTabla(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(SchemaSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("menu.html");

    }

}
