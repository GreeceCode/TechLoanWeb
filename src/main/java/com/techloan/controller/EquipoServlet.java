/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techloan.controller;

import com.techloan.model.dto.EquipoDTO;
import com.techloan.service.TechLoanFacade;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "EquipoServlet", urlPatterns = {"/equipos"})
public class EquipoServlet extends HttpServlet {
    
    private TechLoanFacade facade;
    
    @Override
    public void init() throws ServletException {
        super.init();
        facade = new TechLoanFacade();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "listar";
        }

        switch (accion) {
            case "listar":
                List<EquipoDTO> listaEquipos = facade.obtenerTodosLosEquipos();
                request.setAttribute("equipos", listaEquipos);
                request.getRequestDispatcher("listarEquipos.jsp").forward(request, response);
                break;
                
            case "editar":
                int idEd = Integer.parseInt(request.getParameter("id"));
                EquipoDTO eq = facade.obtenerEquipoPorId(idEd);
                request.setAttribute("equipo", eq);
                request.getRequestDispatcher("editarEquipo.jsp").forward(request, response);
                break;
                
            case "eliminar":
                int idDel = Integer.parseInt(request.getParameter("id"));
                facade.eliminarEquipo(idDel);
                response.sendRedirect("equipos");
                break;
                
            default:
                response.sendRedirect("equipos");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String idStr = request.getParameter("id");
        
        String codigoInterno = request.getParameter("codigoInterno");
        int tipoId = Integer.parseInt(request.getParameter("tipoId"));
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String numeroSerie = request.getParameter("numeroSerie");
        String estado = request.getParameter("estado");
        if (estado == null || estado.isEmpty()) {
            estado = "Disponible";
        }

        EquipoDTO equipo = new EquipoDTO();
        equipo.setCodigoInterno(codigoInterno);
        equipo.setTipoId(tipoId);
        equipo.setMarca(marca);
        equipo.setModelo(modelo);
        equipo.setNumeroSerie(numeroSerie);
        equipo.setEstado(estado);

        if (idStr == null || idStr.isEmpty()) {
            // Registro nuevo
            facade.registrarEquipo(equipo);
        } else {
            // Actualización
            equipo.setId(Integer.parseInt(idStr));
            facade.actualizarEquipo(equipo);
        }
        
        response.sendRedirect("equipos");
    }
}