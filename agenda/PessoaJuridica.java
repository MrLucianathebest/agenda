package agenda;


public class PessoaJuridica extends Pessoa{

    // Atributos
    private String razaoSocial;
    private String cnpj;
    
    //Construtores    
    public PessoaJuridica() {
    }
    
    public PessoaJuridica(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
    
	public PessoaJuridica(String nome) {
        super.nome = nome;
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