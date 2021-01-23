package com.sistema.ventas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_roles")
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "secuencia_rol")
    private Integer secuenciaRol;
	
	@Column(name = "abreviatura")
    private String abreviatura;
	
	@Column(name = "descripcion")
    private String descripcion;
	
	@Column(name = "es_activo")
    private String esActivo;
}
