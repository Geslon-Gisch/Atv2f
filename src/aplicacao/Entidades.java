package aplicacao;

abstract class Contribuinte {
	private String nome;
	private double rendaBruta;

	public Contribuinte(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}

	public String getNome() {
		return nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public abstract double calcularImposto();

	@Override
	public String toString() {
		return "Contribuinte [ Nome: " + nome + ", Renda Bruta: R$" + rendaBruta + "]";
	}
}

class PessoaFisica extends Contribuinte {
	private String cpf;

	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public double calcularImposto() {
		double renda = getRendaBruta();
		if (renda <= 1903.98) {
			return 0;
		} else if (renda <= 2826.65) {
			return renda * 0.075 - 142.80;
		} else if (renda <= 3751.05) {
			return renda * 0.15 - 354.80;
		} else if (renda <= 4664.68) {
			return renda * 0.225 - 636.13;
		} else {
			return renda * 0.275 - 869.36;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", CPF: " + cpf;
	}
}

class PessoaJuridica extends Contribuinte {
	private String cnpj;

	public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public double calcularImposto() {
		return getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + ", CNPJ: " + cnpj;
	}
}