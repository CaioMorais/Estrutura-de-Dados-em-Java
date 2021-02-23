
public class Pilha {
	private int CAPACIDADE = 5;
    private Funcionario[] dados = new Funcionario[CAPACIDADE];
    private int topo = -1;
    public int Tamanho()
    {
        return topo + 1;
    }
    
    public void Empilha(Funcionario p_valor) throws Exception
    {
        if (Tamanho() != CAPACIDADE)
        {
            topo++;
            dados[topo] = p_valor;
        }
        else
        {
            throw new Exception("A pilha está cheia!!!");
        }
    }
    public Funcionario Desempilha() throws Exception
    {
        if (Tamanho() == 0)            
            throw new Exception("A pilha está vazia!!!");            
        else
        {
            Funcionario retorno = dados[topo];
            dados[topo] = null;
            topo--;
            return retorno;
        }
    }
    public Funcionario RetornaTopo() throws Exception
    {
        if (Tamanho() == 0)
            throw new Exception("A pilha está vazia!!!");
        else
            return dados[topo];
    }
}
