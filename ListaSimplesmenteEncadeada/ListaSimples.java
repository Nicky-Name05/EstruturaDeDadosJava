package ListaSimplesmenteEncadeada;

public class ListaSimples implements ListaSimplesTAD{
	private int tamanho = 0;
	private Node head;
	
	public ListaSimples() {
		
	}
	

	public int Tamanho() {
		return tamanho;
	}
	public void exibir() {
		Node temp = head;
		System.out.println("--v--");
		while(temp != null) {
			temp.exibir();
			temp = temp.getNext();
		}
		System.out.println("--^--");
	}
	public void inserir(int info) {
		Node temp = head;
		head = new Node(info, temp);
		tamanho++;
	}
	public void inserirFim(int info) {
		if (head ==  null) {
			head = new Node(info, head);
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new Node(info));
	}
	public void remover(int info) {
		if(estaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.getNext() != null) {
			if(temp.getValor() == info) {
				prev.setNext(temp.getNext());
			}
			prev = temp;
			temp = temp.getNext();
		}
		tamanho--;
		System.out.println("Não exite");
		System.out.println("--^--");

	}
	public void removerInicio() {
		if(estaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		head = head.getNext();
		tamanho--;
	}
	
	public void removerFim() {
		if(estaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(null);
		tamanho--;
	}
	public Node busca(int info) {
		Node temp = head;
		System.out.println("--v--");
		while(temp != null) {
			if(temp.getValor() == info) {
				temp.exibir();
				return temp;
			}
			temp = temp.getNext();
		}

		System.out.println("Não exite");
		System.out.println("--^--");
		return null;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
}
