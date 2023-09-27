package ar.edu.unlam.pb2.testUnlam;

public class Nota {
private Integer valor;


public Nota(Integer valor) {
	this.valor=valor;
	
}
public Nota() {
	this.valor=0;
	
}


public void AsignarValor(Nota nota) {
	this.valor=nota.getValor();
}




public Integer getValor() {
	return valor;
}



public void setValor(Integer valor) {
	this.valor = valor;
}















}
