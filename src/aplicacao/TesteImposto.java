package aplicacao;

public class TesteImposto {
	public static void main(String[] args) {
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = new PessoaFisica("Ana", 1500, "123.456.789-10");
		contribuintes[1] = new PessoaFisica("Carlos", 3000, "987.654.321-00");
		contribuintes[2] = new PessoaFisica("Mariana", 5000, "555.555.555-55");
		contribuintes[3] = new PessoaJuridica("Empresa A", 25000, "01.234.567/0001-00");
		contribuintes[4] = new PessoaJuridica("Empresa B", 80000, "98.765.432/0001-99");
		contribuintes[5] = new PessoaJuridica("Empresa C", 150000, "12.345.678/0001-88");

		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte);
			System.out.println("Imposto a ser pago: R$" + contribuinte.calcularImposto());
			System.out.println();
		}
	}
}