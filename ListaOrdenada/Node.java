package ListaOrdenada;

public class Node {
	private int valor = 0;
	private Node prox;
	
	public Node () {}
	public Node (int valor) {
		this.valor = valor;
		prox = null;
	}
	public Node (int valor, Node prox) {
		this.valor = valor;
		this.prox = prox;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node getProx() {
		return prox;
	}
	public void setProx(Node prox) {
		this.prox = prox;
	}
	
	public void exibir() {
		System.out.println("Valor: " + valor);
	}
}
