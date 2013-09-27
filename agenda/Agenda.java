package agenda;
import java.util.Vector;

/**
 *
 * @author Wilton e Eduardo
 */
public class Agenda {
    
    private Vector<Pessoa> listaPessoas;
    
    public Agenda(){
        listaPessoas = new Vector<Pessoa>();
    }
    
    public String adicionarPessoa(Pessoa novaPessoa){
        listaPessoas.add(novaPessoa);
        return "Pessoa Cadastrado com Sucesso!";  
    }
    
}
