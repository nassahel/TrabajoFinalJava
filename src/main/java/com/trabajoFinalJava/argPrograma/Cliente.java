package com.trabajoFinalJava.argPrograma;

import java.util.ArrayList;
import java.util.List;

public class Cliente {


	private String cuil;
	private String razonSocial;
	private List<Servicio> servicios;
	private boolean estadoServicio;

	public Cliente() {
		this.servicios = new ArrayList<>();
	}
	
	public void agregarServicioCliente(Servicio servcio) {
		this.servicios.add(servcio);
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public boolean isEstadoServicio() {
		return estadoServicio;
	}

	public void setEstadoServicio(boolean estadoServicio) {
		this.estadoServicio = estadoServicio;
	}


}
