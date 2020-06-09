package com.curso.java.entidades;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String clave;
	private Integer id;
	static AtomicInteger CANTIDAD_USUARIO = new AtomicInteger(0);
	
	
	
	public Usuario() {
		CANTIDAD_USUARIO.getAndIncrement();
		this.id = CANTIDAD_USUARIO.get();
	}
	
	
	public Usuario(String usuario, String clave) {
		CANTIDAD_USUARIO.getAndIncrement();
		this.usuario = usuario;
		this.clave = clave;
		this.id = CANTIDAD_USUARIO.get();
	}
	
	
	
	@Override
	public String toString() {
		return "Usuarios [usuario=" + usuario + ", clave=" + clave + ", id=" + id + "]";
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}