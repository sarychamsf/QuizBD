package controller;

import dao.ContextoDAO;
import dao.ModeloDAO;
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
import model.Modelo;

public class ContextoSer extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        ModeloDAO md = new ModeloDAO();
        ArrayList<Modelo> respuesta = new ArrayList<>();
        if (action.equals("agregar")) {
            try {
                respuesta = md.getAllModelo();
            } catch (SQLException ex) {
                Logger.getLogger(ModeloSer.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/agregar_contexto.jsp");
            request.setAttribute("respuesta", respuesta);
            rd.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ContextoDAO contexto_dao = new ContextoDAO();
        String nombre_contexto = request.getParameter("nombre_contexto");
        String link = request.getParameter("link");
        int id_modelo = Integer.parseInt(request.getParameter("id_modelo"));

        Contexto contexto = new Contexto(nombre_contexto, link, id_modelo);

        try {
            contexto_dao.addContexto(contexto);
        } catch (SQLException ex) {
            Logger.getLogger(ContextoSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("menu.html");

    }

}
