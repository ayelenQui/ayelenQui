package ar.edu.unlam.pb2.testUnlam;

public class HistorialAcedemico {

	private Curso curso;
	private Alumno alumno;
	private Nota nota;

	public HistorialAcedemico(Curso curso, Alumno alumno, Nota nota) {
		this.curso=curso;
		this.alumno=alumno;
		this.nota=nota;
	}


	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}






	
}
