
package agenda;

/**
 *
 * @author Wilton e Eduardo
 */
public class Contato {
    
    private String nome;
    private String telefone;
    
    public Contato(String nome){
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
