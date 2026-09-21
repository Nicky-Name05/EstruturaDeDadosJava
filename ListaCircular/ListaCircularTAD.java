package ListaCircular;

public interface ListaCircularTAD {
	public int Tamanho();
	public boolean estaVazia();
	public void inserirInicio(int info);
	public void inserirFim(int info);
	public void removerInicio();
	public void removerFim();
	public Node buscar(int info);
	public void remover (int info);
	public void exibir();
}
