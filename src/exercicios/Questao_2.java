package exercicios;

public class Questao_2 {
	public static void main(String[] args) {
		int count = 1;
		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "***" : "+++++");
			++count;
		}// fim do while
	}// fim do método principal

}
