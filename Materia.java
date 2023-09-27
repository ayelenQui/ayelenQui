package ar.edu.unlam.pb2.testUnlam;

import java.util.ArrayList;
import java.util.Objects;

public class Materia {

	private Integer codigo;
	private String nombre;

	private ArrayList<Materia> correlativas;

	public Materia(Integer codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.correlativas=new ArrayList<Materia>();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(codigo, other.codigo);
	}

	public Boolean asignarCorrelativa(Materia materiaCorrelativa) {
		
		if(this.correlativas.contains(materiaCorrelativa)) 
		 return false;
	
		return this.correlativas.add(materiaCorrelativa);
	}

	public Boolean eliminarCorrelativa(Materia materiaCorrelativa) {
		
		if(!(this.correlativas.contains(materiaCorrelativa))){
		
		return false;
		
		
	}
		return this.correlativas.remove(materiaCorrelativa);
}

	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}


	
}