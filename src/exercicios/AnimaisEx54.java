package exercicios;

public class AnimaisEx54 {
	void comer() {
		System.out.println("O animal está comendo!");
	}
	
	void dormir() {
		System.out.println("O animal está dormindo!");
	}
	
	public static void main(String[] args) {
		
	}
}

class Cachorro extends AnimaisEx54 {
	@Override
	void comer() {
		System.out.println("O cachorro está comendo!");
	}
	
	@Override
	void dormir() {
		System.out.println("O cachorro está dormindo!");
	}
	
	void latir() {
		System.out.println("O cachorro está latindo!");
	}
}

class Gato extends AnimaisEx54 {
	@Override
	void comer() {
		System.out.println("O gatinho está comendo!");
	}
	
	@Override
	void dormir() {
		System.out.println("O gatinho está dormindo!");
	}
	
	void miar() {
		System.out.println("O gatinho está miando!");
	}
}