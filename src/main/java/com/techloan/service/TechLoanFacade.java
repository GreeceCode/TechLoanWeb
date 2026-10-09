/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techloan.service;

import com.techloan.model.dao.EquipoDAO;
import com.techloan.model.dto.EquipoDTO;
import java.util.List;

public class TechLoanFacade {
    
    private EquipoDAO equipoDAO;

    public TechLoanFacade() {
        this.equipoDAO = new EquipoDAO();
    }

    public List<EquipoDTO> obtenerTodosLosEquipos() {
        return equipoDAO.listarEquipos();
    }
    
    public void registrarEquipo(EquipoDTO equipo) {
        equipoDAO.registrarEquipo(equipo);
    }
    
    public EquipoDTO obtenerEquipoPorId(int id) {
        return equipoDAO.obtenerPorId(id);
    }

    public void actualizarEquipo(EquipoDTO equipo) {
        equipoDAO.actualizarEquipo(equipo);
    }

    public void eliminarEquipo(int id) {
        equipoDAO.eliminarEquipo(id);
    }
    
}
