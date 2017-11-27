/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ConductorPojo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jairo
 */
public class ConductorServlet extends HttpServlet {

    @EJB
    private ConductorDaoLocal conductorDao;

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            String id = request.getParameter("id");
            String fechaEntradaPeaje = request.getParameter("fechaEntradaPeaje");
            String horaEntradaPeaje = request.getParameter("horaEntradaPeaje");
            String pagoPeaje = request.getParameter("pagoPeaje");
            String nombre = request.getParameter("nombre");
            String cedula = request.getParameter("cedula");
            String tipoPagoStr = request.getParameter("tipoPago");
            int tipoPago = 0;
            if(tipoPagoStr != null && !tipoPagoStr.equalsIgnoreCase("")){
                tipoPago = Integer.parseInt(tipoPagoStr);
            }
            ConductorPojo conductor = new ConductorPojo(id, fechaEntradaPeaje, horaEntradaPeaje, pagoPeaje, tipoPago, nombre, cedula);
            if("Añadir".equalsIgnoreCase(action)){
                conductorDao.anadirConductor(conductor);
            }else if("Borrar".equals(action)){
                conductorDao.borrarConductor(id);
            }else if("Buscar".equalsIgnoreCase(action)){
                conductorDao.leerConductor(id);
            }else if("Editar".equalsIgnoreCase(action)){
                conductorDao.editarConductor(conductor);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
