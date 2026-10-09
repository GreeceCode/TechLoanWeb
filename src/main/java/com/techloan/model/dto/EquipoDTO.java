package com.techloan.model.dto;

public class EquipoDTO {
    
    private int id;
    private String codigoInterno;
    private int tipoId;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private String estado;

    public EquipoDTO() {}

    public EquipoDTO(int id, String codigoInterno, int tipoId, String marca, String modelo, String numeroSerie, String estado) {
        this.id = id;
        this.codigoInterno = codigoInterno;
        this.tipoId = tipoId;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigoInterno() { return codigoInterno; }
    public void setCodigoInterno(String codigoInterno) { this.codigoInterno = codigoInterno; }

    public int getTipoId() { return tipoId; }
    public void setTipoId(int tipoId) { this.tipoId = tipoId; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
}
