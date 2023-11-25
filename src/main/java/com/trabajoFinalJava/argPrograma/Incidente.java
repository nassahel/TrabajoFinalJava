package com.trabajoFinalJava.argPrograma;

import java.time.LocalDate;

public class Incidente {

		private Integer incidenteID;
		private String tipoProblema;
		private String descripProblema;
		private Cliente cliente;
		private Servicio servicios;
		private EstadoIncidente estadoIncidente;
		private LocalDate tiempoResolucion;
		public Integer getIncidenteID() {
			return incidenteID;
		}
		public void setIncidenteID(Integer incidenteID) {
			this.incidenteID = incidenteID;
		}
		public String getTipoProblema() {
			return tipoProblema;
		}
		public void setTipoProblema(String tipoProblema) {
			this.tipoProblema = tipoProblema;
		}
		public String getDescripProblema() {
			return descripProblema;
		}
		public void setDescripProblema(String descripProblema) {
			this.descripProblema = descripProblema;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public Servicio getServicios() {
			return servicios;
		}
		public void setServicios(Servicio servicios) {
			this.servicios = servicios;
		}
		public EstadoIncidente getEstadoIncidente() {
			return estadoIncidente;
		}
		public void setEstadoIncidente(EstadoIncidente estadoIncidente) {
			this.estadoIncidente = estadoIncidente;
		}
		public LocalDate getTiempoResolucion() {
			return tiempoResolucion;
		}
		public void setTiempoResolucion(LocalDate tiempoResolucion) {
			this.tiempoResolucion = tiempoResolucion;
		}

	public Incidente(Integer incidenteID) {
		this.incidenteID = incidenteID;
	}
}
