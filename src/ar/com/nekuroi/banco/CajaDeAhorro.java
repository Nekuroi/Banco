package ar.com.nekuroi.banco;

public class CajaDeAhorro extends Cuenta {
	
	private Double interes;
	
	
	//Constructs:
	
	public CajaDeAhorro(){
		super();
		interes = 0.0;
	}
	
	public CajaDeAhorro(Double saldo){
		super(saldo);
		interes = 0.0;
	}
	
	public CajaDeAhorro(Double saldo, Double interes){
		super(saldo);
		setInteres(interes);
	}
	
	//Methods:
	
	/*public void setInteres(Double interes){
		this.interes = interes;
	}*/
	
	private void setInteres(Double interes){
		if(interes>=0 && interes<=100){
			this.interes = interes;	
		}
	}
	
	public Double getInteres(){
		return interes;
	}
	
	public void executeInteres(){
		super.depositar(super.getSaldo() * (interes/100));
	}
	
	public void extraer(Double saldo){
		if (super.getSaldo() > saldo){
			super.extraer(saldo);
		}else{
			System.out.print("Saldo insuficiente");
		}
	}

}
