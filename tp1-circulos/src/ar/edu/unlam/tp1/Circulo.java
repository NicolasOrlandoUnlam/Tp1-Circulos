package ar.edu.unlam.tp1;

public class Circulo {
	private Double radio;
	private Double perimetro;
	private Double area;
	
public Circulo(Double radio){
		
		this.radio = radio;
		this.perimetro = 0.0;
		this.area = 0.0;
}

public Double dameElAreaDeUnCirculo(){
	
	this.area = 3.14 * this.radio * this.radio;
	return this.area;
}

public Double dameElPerimetroDeUnCirculo(){
	
	this.perimetro = 2 * 3.14 * this.radio;
	return this.perimetro;
}

public Double dameElRadioDeUnCirculo(){
	
	return this.radio;
}
	

}
