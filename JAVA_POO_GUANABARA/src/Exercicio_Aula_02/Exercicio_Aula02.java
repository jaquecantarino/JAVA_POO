package Exercicio_Aula_02;

public class Exercicio_Aula02 {

	public static void main(String[] args) {
		
		Notebook n1 = new Notebook();
		VideoAula vd1 = new VideoAula();
		
		n1.carga = 50;
		n1.marca = "Acer";
		n1.modelo = "Aspire 3";
		
		n1.abrir();
		
		n1.ligar();
		
		n1.status();
		
		vd1.duracao = 5;
		vd1.titulo = "JAVA POO";
		vd1.professor = "Guanabara";
		vd1.live = 3;
		
		vd1.conclusao();
		vd1.status();

	}

}
