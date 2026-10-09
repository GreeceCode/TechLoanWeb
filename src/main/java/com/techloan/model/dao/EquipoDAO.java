/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techloan.model.dao;

import com.techloan.conexion.ConexionBD;
import com.techloan.model.dto.EquipoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipoDAO {
   
    // READ: listar todos los equipos
    public List<EquipoDTO> listarEquipos() {
        List<EquipoDTO> lista = new ArrayList<>();
        String sql = "SELECT id, codigo_interno, tipo_id, marca, modelo, numero_serie, estado FROM equipo";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                EquipoDTO equipo = new EquipoDTO();
                equipo.setId(rs.getInt("id"));
                equipo.setCodigoInterno(rs.getString("codigo_interno"));
                equipo.setTipoId(rs.getInt("tipo_id"));
                equipo.setMarca(rs.getString("marca"));
                equipo.setModelo(rs.getString("modelo"));
                equipo.setNumeroSerie(rs.getString("numero_serie"));
                equipo.setEstado(rs.getString("estado"));
                
                lista.add(equipo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar equipos: " + e.getMessage());
        }
        return lista;
    }
    
    // CREATE: registrar un nuevo equipo
    public boolean registrarEquipo(EquipoDTO equipo) {
        String sql = "INSERT INTO equipo (codigo_interno, tipo_id, marca, modelo, numero_serie, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, equipo.getCodigoInterno());
            ps.setInt(2, equipo.getTipoId());
            ps.setString(3, equipo.getMarca());
            ps.setString(4, equipo.getModelo());
            ps.setString(5, equipo.getNumeroSerie());
            ps.setString(6, equipo.getEstado());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar equipo: " + e.getMessage());
            return false;
        }
    }
    
    // READ: obtener un equipo por ID
    public EquipoDTO obtenerPorId(int id) {
        EquipoDTO equipo = null;
        String sql = "SELECT id, codigo_interno, tipo_id, marca, modelo, numero_serie, estado FROM equipo WHERE id = ?";
        
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    equipo = new EquipoDTO();
                    equipo.setId(rs.getInt("id"));
                    equipo.setCodigoInterno(rs.getString("codigo_interno"));
                    equipo.setTipoId(rs.getInt("tipo_id"));
                    equipo.setMarca(rs.getString("marca"));
                    equipo.setModelo(rs.getString("modelo"));
                    equipo.setNumeroSerie(rs.getString("numero_serie"));
                    equipo.setEstado(rs.getString("estado"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar equipo por ID: " + e.getMessage());
        }
        return equipo;
    }

    // UPDATE: actualizar un equipo existente
    public boolean actualizarEquipo(EquipoDTO equipo) {
        String sql = "UPDATE equipo SET codigo_interno = ?, tipo_id = ?, marca = ?, modelo = ?, numero_serie = ?, estado = ? WHERE id = ?";
        
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, equipo.getCodigoInterno());
            ps.setInt(2, equipo.getTipoId());
            ps.setString(3, equipo.getMarca());
            ps.setString(4, equipo.getModelo());
            ps.setString(5, equipo.getNumeroSerie());
            ps.setString(6, equipo.getEstado());
            ps.setInt(7, equipo.getId());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar equipo: " + e.getMessage());
            return false;
        }
    }

    // DELETE: eliminar un equipo por ID
    public boolean eliminarEquipo(int id) {
        String sql = "DELETE FROM equipo WHERE id = ?";
        
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar equipo: " + e.getMessage());
            return false;
        }
    }
    
    
}
