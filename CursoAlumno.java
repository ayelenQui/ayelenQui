package ar.edu.unlam.pb2.testUnlam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CursoAlumno {

	private Alumno alumnoBuscado;
	private Curso cursoBuscado;
	private Nota nota;
	private HashSet<CursoAlumno> inscriptos;
	

	public CursoAlumno(Alumno alumnoBuscado, Curso cursoBuscado) {
		this.alumnoBuscado=alumnoBuscado;
		this.cursoBuscado=cursoBuscado;
		this.inscriptos= new HashSet<CursoAlumno>();
		this.nota =new Nota ();
		
	}

	public CursoAlumno(Nota nota2) {
		this.nota=nota2;
	}
	public boolean agregarInscriptos(CursoAlumno  dni) {
		if(this.inscriptos.contains(dni) ) {
			return false;
		}
		return this.inscriptos.add(dni);
	}
	

	public Alumno getAlumnoBuscado() {
		return alumnoBuscado;
	}

	public void setAlumnoBuscado(Alumno alumnoBuscado) {
		this.alumnoBuscado = alumnoBuscado;
	}

	public Curso getCursoBuscado() {
		return cursoBuscado;
	}

	public void setCursoBuscado(Curso cursoBuscado) {
		this.cursoBuscado = cursoBuscado;
	}





	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public HashSet<CursoAlumno> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(HashSet<CursoAlumno> inscriptos) {
		this.inscriptos = inscriptos;
	}
	
	




	public void AsignarValor(Nota nota) {
		this.nota=nota;
	}

	public Boolean calificar(Integer dni, Nota nueva) {
		Boolean sePudo=false;
		for (CursoAlumno cursoAlumno : inscriptos) {
			if(cursoAlumno.getAlumnoBuscado().getDni().equals(dni)) {
				AsignarValor(nueva);
				sePudo=true;
			}
			}
		return sePudo;
		}
	
	
		
	}


	
	
	


	