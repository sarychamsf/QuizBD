package controller;

import dao.ContextoDAO;
import dao.EsquemaDAO;
import dao.TablaDAO;
import dao.UnidadAbstractaDAO;
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
import model.Contexto;
import model.Tabla;
import model.UnidadAbstracta;

public class UnidadSer extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UnidadAbstractaDAO unidad_dao = new UnidadAbstractaDAO();
        ArrayList<UnidadAbstracta> respuesta = new ArrayList<>();
        String action = request.getParameter("action");
        TablaDAO td = new TablaDAO();
        ArrayList<Tabla> respuesta2 = new ArrayList<>();
        ContextoDAO cd = new ContextoDAO();
        ArrayList<Contexto> respuesta3 = new ArrayList<>();
        if (action.equals("agregar")) {

            try {
                respuesta2 = td.getAllTables();
            } catch (SQLException ex) {
                Logger.getLogger(UnidadSer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                respuesta3 = cd.getAllContexto();
            } catch (SQLException ex) {
                Logger.getLogger(UnidadSer.class.getName()).log(Level.SEVERE, null, ex);
            }

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/agregar_unidades.jsp");
            request.setAttribute("respuesta2", respuesta2);
            request.setAttribute("respuesta3", respuesta3);
            rd.forward(request, response);
        }
        if (action.equals("listar")) {
            try {
                respuesta = unidad_dao.getAllUnidadAbstracta();
            } catch (SQLException ex) {
                Logger.getLogger(TablaSer.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/listar_unidades.jsp");
            request.setAttribute("respuesta", respuesta);
            rd.forward(request, response);
        }

    }

}
