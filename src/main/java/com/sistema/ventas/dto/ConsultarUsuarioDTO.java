package com.sistema.ventas.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConsultarUsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numeroIdentificacion;
	private String nombresCompletos;
    private String usuario;
    private String rol;
    private String estado;
}
