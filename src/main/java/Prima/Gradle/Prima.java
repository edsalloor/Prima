package Prima.Gradle;

public class Prima {

	 private transient  int edad;
	 private transient int puntos;
	 private transient int tarifaBasica;
	 private transient int maxPuntosLicencia;
	 //constantes
	 private static final int EDAD1=25;
	 private static final int EDAD2=35;
	 private static final int EDAD3=45;
	 private static final int EDAD4=65;

	 private static final int PUNTO1=1;
	 private static final int PUNTO3=3;
	 private static final int PUNTO5=5;
	 private static final int PUNTO7=7;

	 
	public Prima(int edad,int puntos) {
		super();
		this.edad = edad;
		this.puntos=puntos;
		this.tarifaBasica=500; 
		this.maxPuntosLicencia=30;
	}

	//Prima = TarifaBásica * FactorEdad - ReducciónConductorSeguro
	public Double calculoPrima() {
		double factorEdad;
		int ReducciónConductorSeguro;
		int puntosPerdidos=maxPuntosLicencia-this.puntos;

		if(this.edad<EDAD1) {
			factorEdad=2.8;
			if(puntosPerdidos<=PUNTO1){
				ReducciónConductorSeguro=50;
				return this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
			}
			return this.tarifaBasica*factorEdad;
		}
		if(this.edad>=EDAD1 && this.edad<EDAD2) {
			factorEdad=1.8;
			if(puntosPerdidos<=PUNTO3){
				ReducciónConductorSeguro=50;
				return this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
			}
			return this.tarifaBasica*factorEdad;
		}
		if(this.edad>=EDAD2 && this.edad<EDAD3) {
			factorEdad=1.0;
			if(puntosPerdidos<=PUNTO3){
				ReducciónConductorSeguro=100;
				return this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
			}
			return this.tarifaBasica*factorEdad;
		}
		if(this.edad>=EDAD3 && this.edad<EDAD4) {
			factorEdad=0.8;
			if(puntosPerdidos<=PUNTO7){
				ReducciónConductorSeguro=150;
				return this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
			}
			return this.tarifaBasica*factorEdad;
		} else {
			factorEdad=1.5;
			if(puntosPerdidos<=PUNTO3){
				ReducciónConductorSeguro=200;
				return this.tarifaBasica*factorEdad-ReducciónConductorSeguro;
			}
			return this.tarifaBasica*factorEdad;
		}
	}
}
