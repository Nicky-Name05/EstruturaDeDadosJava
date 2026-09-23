package ListaDuplamenteEncadeada;

public class Node {
	private int valor;
	private Node next;
	private Node prev;
	
	public Node () {
	}
	public Node(int valor) {
		this.valor = valor;
	}
	public Node(int valor, Node next, Node prev) {
		this.valor = valor;
		this.next = next;
		this.prev = prev;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void exibir() {
		System.out.println("Valor: " + valor);
	}
}
