package Aula_02;

public class aula02 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta(); //criando um novo objeto na aplicação

		c1.cor = "Azul"; //referencia para atributo
		c1.ponta = 0.5f; //referencia para atributo
		//c1.tampada = false; //referencia para atributo
		
		c1.tampar();
		c1.status(); //chamada para metodo
		c1.rabiscar();
		
		Caneta c2 = new Caneta(); //criando um novo objeto
		
		c2.modelo = "Stabilo";
		c2.cor = "Preta";
		
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
