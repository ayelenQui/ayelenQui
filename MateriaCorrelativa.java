package ar.edu.unlam.pb2.testUnlam;

public class MateriaCorrelativa {

	

	private Materia materiaBuscada;
	private Materia materiaCorrelativa;

	public MateriaCorrelativa(Materia materiaBuscada, Materia materiaCorrelativa) {
		this.materiaBuscada=materiaBuscada;
		this.materiaCorrelativa=materiaCorrelativa;
	}

	public Materia getMateriaBuscada() {
		return materiaBuscada;
	}

	public void setMateriaBuscada(Materia materiaBuscada) {
		this.materiaBuscada = materiaBuscada;
	}

	public Materia getMateriaCorrelativa() {
		return materiaCorrelativa;
	}

	public void setMateriaCorrelativa(Materia materiaCorrelativa) {
		this.materiaCorrelativa = materiaCorrelativa;
	}	

}
