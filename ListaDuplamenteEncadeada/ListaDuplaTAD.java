package ListaDuplamenteEncadeada;

public interface ListaDuplaTAD {
	public int Tamanho();
	public boolean estaVazia();
	public void inserirInicio(int info);
	public void inserir(int info);
	public void removerInicio();
	public void removerFim();
	public Node busca(int info);
	public void remover (int info);
	public void exibir();
}
