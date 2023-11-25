package com.trabajoFinalJava.argPrograma;
//Acá es necesario ingresar la conexión a la base de datos
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tecnico {


		private Integer tecnicoID;
		private List<Servicio> servicios;
		private LocalDate tiempoResolucion;

		public Tecnico() {
			this.servicios = new ArrayList<>();
		}
		
		public void agregarServicioTecnico(Servicio servcio) {
			this.servicios.add(servcio);
		}

		public Integer getTecnicoID() {
			return tecnicoID;
		}

		public void setTecnicoID(Integer tecnicoID) {
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

		public boolean puedeReparar(Incidente incidente)  {
		return this.servicios.stream().anyMatch(servicioIncidente ->incidente.getServicios() == this.servicios);
		}
		
		
		
}
