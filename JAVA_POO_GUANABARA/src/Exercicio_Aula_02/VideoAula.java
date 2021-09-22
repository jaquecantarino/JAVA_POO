package Exercicio_Aula_02;

public class VideoAula {
	
	String titulo;
	String professor;
	int duracao;
	int live;
	boolean emExecucao;
	boolean completo;
	
	void status() {
		System.out.println("Aula: "+this.titulo);
		System.out.println("Professor: "+this.professor);
		System.out.println("Duração: "+this.duracao);
	}
	
	void executar() {
		this.emExecucao = true;
		
	}
	
	void pause() {
		this.emExecucao = false;
		
	}
	
	void conclusao() {
		if(this.duracao != this.live) {
			this.completo = true;			
		} else {
			System.out.println("Termine de assistir a aula para concluir.");
		}
		
	}
	

}
