package com.sistema.ventas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class CiudadCPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @NotNull
    @Column(name = "secuencia_pais")
    private Integer secuenciaPais;
	
    @NotNull
    @Column(name = "secuencia_provincia")
    private Integer secuenciaProvincia;
    
    @NotNull
    @Column(name = "secuencia_ciudad")
    private Integer secuenciaCiudad;

}
