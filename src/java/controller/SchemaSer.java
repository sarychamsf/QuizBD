/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EsquemaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Esquema;

/**
 *
 * @author Sary
 */
public class SchemaSer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("agregar_esquema.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EsquemaDAO esquema_dao = new EsquemaDAO();
        String nombre_esquema = request.getParameter("nombre_esquema");

        Esquema esquema = new Esquema(nombre_esquema);
        try {
            esquema_dao.addEsquema(esquema);
        } catch (SQLException ex) {
            Logger.getLogger(SchemaSer.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("SchemaSer");

    }

}
