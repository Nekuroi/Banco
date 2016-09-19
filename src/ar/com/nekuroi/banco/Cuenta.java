package ar.com.nekuroi.banco;

public class Cuenta {
	
	private Double saldo;
	
	
	//Constructs:
	
	public Cuenta(){	
		saldo = 0.0;		
	}
	public Cuenta(Double saldo){		
		this.saldo = saldo;
	}
	
	public Cuenta(Integer saldo){	
		this.saldo = saldo.doubleValue();
	}
	
	//Methods:
	
	//Agrega saldo a la cuenta
	public void depositar(Double saldo){	
		this.saldo += saldo;
	}
	
	//Extrae saldo a la cuenta
	public void extraer(Double saldo){
		this.saldo -= saldo;
	}
	
	//Devuelve el saldo actual
	public Double getSaldo(){
		return saldo;
	}


}
