package ar.edu.unlam.pb2.testUnlam;

public class Asignacion {

	private Alumno alumnoBuscado;
	private Curso cursoBuscado;
	private Nota nota;

	public Asignacion(Alumno alumnoBuscado, Curso cursoBuscado, Nota nota) {
		this.alumnoBuscado=alumnoBuscado;
		this.cursoBuscado=cursoBuscado;
		this.nota=nota;
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
	

}
