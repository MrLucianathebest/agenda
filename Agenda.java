package agenda;
import java.util.Vector;

/**
 *
 * @author Wilton e Eduardo
 */
public class Agenda {
    
    private Vector listaPessoas;
    
    public Agenda(){
        listaPessoa = new Vector();
    }
    
    public String adicionarPessoa(Pessoa novaPessoa){
        listaPessoas.add(novaPessoa);
        return "Pessoa Cadastrado com Sucesso!";  
    }
    
}
