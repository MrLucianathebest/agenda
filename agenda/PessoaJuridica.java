package agenda;


public class PessoaJuridica extends Pessoa{

    // Atributos
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String endereco;
    private String email;
    private String site;
    
    //Construtores    
    public PessoaJuridica() {
        this.nome = "-";
    }

    public PessoaJuridica(String nome) {
        this.nome = nome;
    }

    public PessoaJuridica(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
