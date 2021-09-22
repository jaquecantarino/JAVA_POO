package Exercicio_Aula_02;

public class Notebook {
	
	String marca;
	String modelo;
	int carga;
	boolean ligado;
	boolean aberto;
	
	void status() {
		System.out.println("Notebook da marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Bateria "+this.carga);		
	}
	
	void ligar() {
		if (this.aberto == true && this.carga > 0) {
			this.ligado=true;
			System.out.println("Notebook ligado!");
		} else if (this.aberto == false){
			System.out.println("Abra o notebook para ligar");
		} else if (this.carga < 0) {
			System.out.println("Bateria baixa, carregue o notebook.");
		}

		
	}
	
	void desligar() {
		this.ligado=false;
		
	}
	
	void abrir() {
		this.aberto=true;
		
	}
	
	void fechar() {
		if(this.ligado==false) {
			this.aberto=false;
		} else {
			System.out.println("Desligue o notebook para fechar");
		}
	}

}
