package agenda;


public class PessoaJuridica extends Pessoa{

    // Atributos
    private String razaoSocial;
    private String cnpj;
    
    //Construtores    
    public PessoaJuridica() {
        super.nome = "-";
    }

    public PessoaJuridica(String nome) {
        super.nome = nome;
    }

    public PessoaJuridica(String nome, String telefone) {
        super.nome = nome;
        super.telefone = telefone;
    }

    // Métodos
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}