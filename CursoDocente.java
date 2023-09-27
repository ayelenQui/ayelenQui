package ar.edu.unlam.pb2.testUnlam;

public class CursoDocente {


	private Docente docente;
	private Curso curso;

	public CursoDocente(Docente docente, Curso curso) {
		// TODO Auto-generated constructor stub
		this.docente=docente;
		this.curso=curso;
	}



	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	


}
