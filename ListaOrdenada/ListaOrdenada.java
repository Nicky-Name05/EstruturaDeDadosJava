package ListaOrdenada;

public class ListaOrdenada {
	private int tamanho = 0;
	private Node head;
	
	public ListaOrdenada() {
		head = null;
	}
	
	public int tamanho() {
		return tamanho;
	}

	public Node getHead() {
		return head;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public void inserir(int valor) {
		Node indice = head;
		if (estaVazia() || head.getValor() > valor) {
			head = new Node(valor, indice);
		}
		else {
			Node ante = null;
			while(indice != null) {
				if(indice.getValor() > valor) {
					Node novo = new Node (valor, indice);
					ante.setProx(novo);
					tamanho++;
					return;
				}
				ante = indice;
				indice = indice.getProx();
			}
			Node novo = new Node (valor, indice);
			ante.setProx(novo);
		}
		tamanho++;
	}
	public void remover(int valor) {
		if (estaVazia()) {
			System.out.println("Lista vazia");
		}
		else {
			Node ante = null;
			for(Node indice = head; indice != null; indice = indice.getProx()) {
				if(indice.getValor() > valor) {
					System.out.println("Valor nao existe");
					return;
				}
				if(indice.getValor() == valor) {
					ante.setProx(indice.getProx());
					tamanho--;
					return;
				}
				ante = indice;
			}
			System.out.println("Valor nao existe");
		}
		tamanho--;
	}
	
	public Node busca(int valor) {
		if (estaVazia()) {
			System.out.println("Lista vazia");
		}
		else {
			for(Node indice = head; indice != null; indice = indice.getProx()) {
				if(indice.getValor() == valor) {
					return indice;
				}
			}
			System.out.println("Valor nao existe");
		}
		return null;
	}
	
	public void exibir() {

		if (estaVazia()) {
			System.out.println("Lista vazia");
		}
		else {
			Node indice = head;
			while(indice != null) {
				indice.exibir();
				indice = indice.getProx();
			}
		}
	}
}
