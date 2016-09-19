package ar.com.nekuroi.banco;

public class CuentaCorriente extends Cuenta {
	
	private Double descubierto;
	
	public CuentaCorriente(){
		super();
	}
	
	public CuentaCorriente(Double saldo, Double descubierto){
		super(saldo);
		setDescubierto(descubierto);
	}
	
	
	//Methods:
		
	public void disminuirDescubierto(Double descubierto){
		this.descubierto -= descubierto;
	}
	
	public void aumentarDescubierto(Double descubierto){
		this.descubierto += descubierto;
	}
	
	public Double getDescubierto(){
		return descubierto;
	}
	
	private void setDescubierto(Double descubierto){
		if (descubierto >= 0.0){
			this.descubierto = descubierto;
		}
	}
	
	//Chequea si hay suficiente saldo para poder extraer dinero, si no, chequea si con el descubierto alcanza.
	public void extraer(Double importe){
		if (super.getSaldo() > importe){
			super.extraer(importe);
		}else{
			if ((super.getSaldo() + descubierto) >= importe){
				disminuirDescubierto(importe - super.getSaldo());
				super.extraer(super.getSaldo());
			}else{
				//System.out.print("Saldo insuficiente");
			}
		}
	}

}
