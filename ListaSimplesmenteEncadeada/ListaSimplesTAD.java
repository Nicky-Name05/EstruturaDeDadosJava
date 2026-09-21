package ListaSimplesmenteEncadeada;

public interface ListaSimplesTAD {
	public int Tamanho();
	public void exibir();
	public void inserir(int info);
	public void inserirFim(int info);
	public void remover(int info);
	public void removerInicio();
	public void removerFim();
	public Node busca(int info);
	public boolean estaVazia();
}
