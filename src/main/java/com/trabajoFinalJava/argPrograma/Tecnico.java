package com.trabajoFinalJava.argPrograma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tecnico {


		private String tecnicoID;
		private List<Servicio> servicios;
		private LocalDate tiempoResolucion;

		public Tecnico() {
			this.servicios = new ArrayList<>();
		}
		
		public void agregarServicioTecnico(Servicio servcio) {
			this.servicios.add(servcio);
		}

		public String getTecnicoID() {
			return tecnicoID;
		}

		public void setTecnicoID(String tecnicoID) {
			this.tecnicoID = tecnicoID;
		}

		public List<Servicio> getServicios() {
			return servicios;
		}

		public void setServicios(List<Servicio> servicios) {
			this.servicios = servicios;
		}

		public LocalDate getTiempoResolucion() {
			return tiempoResolucion;
		}

		public void setTiempoResolucion(LocalDate tiempoResolucion) {
			this.tiempoResolucion = tiempoResolucion;
		}

		
		
		
		
}
