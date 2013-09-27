package agenda;


public class PessoaFisica extends Pessoa{

    // Atributos
    private String sobrenome;
    private String cpf;
    private String empresa;
    private String cargo;
    private String aniversario;
    private Object foto;

    //Construtores    
    public PessoaFisica(String sobrenome, String cpf, String empresa, String cargo, String aniversario, Object foto) {
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.empresa = empresa;
		this.cargo = cargo;
		this.aniversario = aniversario;
		this.foto = foto;
	}
    
    public PessoaFisica(String nome, String cpf) {
        super.nome = nome;
        this.cpf = cpf;  
    }

	public PessoaFisica(String nome,String cpf, String telefone) {
    	super.nome = nome;
        super.telefone = telefone;
        this.cpf = cpf;
    }

    // Métodos
    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Object getFoto() {
        return foto;
    }

    public void setFoto(Object foto) {
        this.foto = foto;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
