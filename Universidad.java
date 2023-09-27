package ar.edu.unlam.pb2.testUnlam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Universidad {

	private String nombreUni;
	private HashSet<Materia> materias;
	private HashSet<Alumno> alumnos;
	private HashSet<CicloLectivo> ciclos;
	private HashSet<Comision> comisiones;
	private HashSet<Curso> cursos;
	private HashSet<Docente> docentes;
	private HashSet<CursoAlumno> cursoAlumnos;
	private HashSet<CursoDocente> cursoDocentes;
	private HashSet<Aula> aulas;
	private HashSet<HistorialAcedemico> historiales;
	private HashSet<Asignacion>asignaciones;
	
	public Universidad(String nombreUni) {
		this.nombreUni=nombreUni;
		this.materias=new HashSet<Materia>();
		this.alumnos=new HashSet<Alumno>();
		this.ciclos=new HashSet<CicloLectivo>();
		this.comisiones=new HashSet<Comision>();
		this.cursos=new HashSet<Curso>();
		this.docentes=new HashSet<Docente>();
		this.cursoAlumnos=new HashSet<CursoAlumno>();
		this.aulas=new HashSet<Aula>();
		this.cursoDocentes=new HashSet<CursoDocente>();
		this.historiales= new HashSet<HistorialAcedemico>();
		this.asignaciones= new HashSet<Asignacion>();

	}

	public Boolean agregarMateria(Materia pb1) {
	return 	this.materias.add(pb1);
	
	}

	public String getNombreUni() {
		return nombreUni;
	}

	public void setNombreUni(String nombreUni) {
		this.nombreUni = nombreUni;
	}

	public HashSet<Materia> getMaterias() {
		return materias;
	}
	

	public void setMaterias(HashSet<Materia> materias) {
		this.materias = materias;
	}

	public Boolean agregarAlumno(Alumno ayelen) {
		return this.alumnos.add(ayelen);
		
	}

	public Boolean crearCiclo(CicloLectivo segundoCuatrimestre) {
		
		return this.ciclos.add(segundoCuatrimestre);
	}

	public Boolean crearComision(Comision comision, Materia pb1, Turnos turno, CicloLectivo ciclo) {
		Boolean crear =false;
		if(!this.comisiones.contains(pb1)&& !this.comisiones.contains(turno)&& !this.comisiones.contains(ciclo))
			crear= this.comisiones.add(comision);
		return crear;
	}
	
	



	public Boolean crearCurso(Curso curso) {
		return this.cursos.add(curso);
		
	}

	public Boolean agregarDocente(Docente ayelen) {
		return this.docentes.add(ayelen);
		
	}

	public void asignarMateriasCorrrelativas(Integer codigo, Integer codigo1) {
		Materia materiaBuscada=buscarMateria(codigo);
		Materia materiaCorrelativa=buscarMateria(codigo1);
		if(materiaBuscada!=null && materiaCorrelativa!=null) {
			materiaBuscada.asignarCorrelativa(materiaCorrelativa);
		}
	
		
	}

	private Materia buscarMateria(Integer codigo) {
		Materia buscada=null;
		for (Materia materia : materias) {
			if(materia.getCodigo().equals(codigo));
			buscada=materia;
		}
		return buscada ;
		
	}

	

	public void eliminarMateriaCorrelativa(Integer codigo, Integer codigo1) {
		Materia materiaBuscada=buscarMateria(codigo);
		Materia materiaCorrelativa=buscarMateria(codigo1);
		
		if(materiaBuscada!=null && materiaCorrelativa!=null) {
			materiaBuscada.eliminarCorrelativa(materiaCorrelativa);
		}
	
		
	}

	public Boolean inscribirAlumnoACurso(Integer dni, Integer codigoCurso) {
		Boolean sePudo=false;
		Alumno alumnoBuscado=buscarAlumno(dni);
		Curso  cursoBuscado=buscarCurso(codigoCurso);
		if(alumnoBuscado!=null && cursoBuscado!=null && !inscriptoAOtroCurso(alumnoBuscado) && !excedeCantidadAula(codigoCurso) && fechaValida(codigoCurso,dni) ){
			
			CursoAlumno cursoAlumno = new CursoAlumno (alumnoBuscado,cursoBuscado);
			sePudo=this.cursoAlumnos.add(cursoAlumno);
			
		}
		return sePudo;
	
	}
	
	public Boolean registroNotas(Integer dni, Integer codigoCurso, Nota nota) {
		Boolean sePudo=false;
		Alumno alumnoBuscado=buscarAlumno(dni);
		Curso  cursoBuscado=buscarCurso(codigoCurso);
		
			Asignacion asign=new Asignacion(alumnoBuscado,cursoBuscado,nota);
					return sePudo=this.asignaciones.add(asign);
				
	}
		
		
	
		
		
	public Integer obtenerNota(Integer dni, Integer codigoCurso) {
		CursoAlumno  cursoBuscado=buscarCurso(codigoCurso,dni);
		Integer nota=cursoBuscado.getNota().getValor();
		return nota;
		
	}	
		
	private CursoAlumno buscarCurso(Integer codigoCurso, Integer dni) {
		
		for (CursoAlumno curso : this.cursoAlumnos) {
			if(curso.getAlumnoBuscado().getDni().equals(dni) && curso.getCursoBuscado().getCodigoCurso().equals(codigoCurso)) {
				return curso;
			}
		}
		return null;
			
		
	}

	/*	AsignarNotaAlumno notaAsiganada= new AsignarNotaAlumno(curso,alumno,nota);
	return sePudo= registrosDeNotas.add(notaAsiganada);*/
	
	
	



			
			


	private Alumno buscarAlumnoencursosAlumnos(Integer dni) {
		Alumno buscadoenLista=null;
		for (CursoAlumno alumno : this.cursoAlumnos) {
			if(alumno.getAlumnoBuscado().equals(dni)) {
				for (Alumno alumno2 : alumnos) {
					if(alumno2.getDni().equals(dni)) {
				
				buscadoenLista=alumno2;
			}
		}
				
	
		
	}
		}
		return buscadoenLista;
			
		}
	private boolean inscriptoAOtroCurso(Alumno alumno) {
		return this.cursoAlumnos.contains(alumno);
		
	}

	private boolean excedeCantidadAula(Integer codigoCurso) {
		Boolean excede=false;
		Curso buscado = buscarCurso(codigoCurso);
		if(buscado.getAula().getCantidadAlumno()>this.cursoAlumnos.size());
		return excede=false;
	}

	private boolean fechaValida(Integer codigoCurso,Integer dni) {
		Boolean fecha=false;
		Curso buscado = buscarCurso(codigoCurso);
		Alumno alumno=buscarAlumno(dni);
		if(buscado.getComision().getSegundoCuatrimestre().getFechaInicioInscripcion().equals(alumno.getFechaIngreso()));
		return fecha=true;
		
		
	}

	
		
				
				
	


	
	private CursoAlumno buscarCursoAl(Integer codigoCursoAlumno) {
		CursoAlumno cursoal=null;
	
		for (CursoAlumno cursoalum : this.cursoAlumnos) {
			if(cursoalum.getCursoBuscado().equals(codigoCursoAlumno)) {
				cursoal=cursoalum;
			}
		}
		return cursoal;
	}

	private Comision buscarComision(Integer codigoComision) {
		Comision comision=null;
		for (Comision comisione : comisiones) {
			if(comisione.getCodigoomision().equals(codigoComision)) {
				comision=comisione;
			}
		}
		return comision;
	}

	private Curso buscarCurso(Integer codigoCurso) {
		Curso buscado=null;
		for (Curso curso : cursos) {
			if(curso.getCodigoCurso().equals(codigoCurso)) {
				buscado= curso;
			}
		}
		return buscado;
	}

	


	private Alumno buscarAlumno(Integer dni) {
		
		for (Alumno alumno : alumnos) {
			if(alumno.getDni().equals(dni)) {
				return alumno;
			}
		}
		return null;
		
	}

	public Boolean agregarAula(Aula aula) {
		if(this.aulas.contains(aula)) {
			return false;
		}
		return this.aulas.add(aula);
	}

	public Boolean agregarDocenteAunCurso(Integer codigoCurso, Integer dni) {
		Boolean sePudo=false;
		Docente docente=buscarDocente(dni);
		Curso curso=buscarCurso(codigoCurso);
		if(docente==null&& curso==null) {
			sePudo=false;
			}
			CursoDocente cursoDocentes= new CursoDocente(docente,curso);
			return sePudo=this.cursoDocentes.add(cursoDocentes);
		}
		
		
	

	private Docente buscarDocente(Integer dni) {
		Docente buscado=null;
		for (Docente docente : docentes) {
			if(docente.getDni().equals(dni))
				buscado=docente;
			
		
		
	}
		return buscado;
	}


	
	public List<Asignacion> listadoMateriasAprobadasPorAlumnos(Integer dni) {
		
		List <Asignacion> materiasAprobadas= new ArrayList<>();
		
		for (Asignacion asig  : this.asignaciones) {
	           
			
            if (asig.getAlumnoBuscado().getDni().equals(dni) && asig.getNota().getValor()>=4) {
			                materiasAprobadas.add(asig);
			            }
			        }

			        
		
		
		return materiasAprobadas;


}


	
	
}


