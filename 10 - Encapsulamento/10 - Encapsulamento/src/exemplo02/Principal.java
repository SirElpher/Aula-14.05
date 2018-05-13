package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar
		Aluno a = new Aluno();
		a.setNome("Andressa");
		a.setNota1(8);
		a.setNota2(9);
		
		//Exibir os valores informados
		System.out.println(a.getNome());
		System.out.println(a.getNota1());
		System.out.println(a.getNota2());
		
		
	}

}
