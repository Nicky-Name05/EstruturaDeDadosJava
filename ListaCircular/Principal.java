package ListaCircular;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lista circular duplamente encadeada");
		
		ListaCircular lista = new ListaCircular();
		ListaCircular lista2 = new ListaCircular();

		System.out.println("Insere de 0 a 4 no começo");
		for (int i = 0; i < 5; i++) {
			lista.inserirInicio(i);
			lista2.inserirInicio(i);
		}
		lista.exibir();

		System.out.println("lista = lista2? " + lista.igual(lista2));
		System.out.println("Insere de -1 a -4 no final");
		for (int i = -1; i > -5; i--) {
			lista.inserirFim(i);
			lista2.inserirFim(i);
		}
		lista.exibir();

		System.out.println("lista = lista2? " + lista.igual(lista2));
		System.out.println("Remove o final (-4)");
		lista.removerFim();
		lista.exibir();

		System.out.println("Remove o começo (4)");
		lista.removerInicio();
		lista.exibir();

		System.out.println("Remove 0");
		lista.remover(0);
		lista.exibir();

		System.out.println("lista = lista2? " + lista.igual(lista2));
		
		System.out.println("tenta remover 4 (não esta na lista)");
		lista.remover(4);
		lista.exibir();

		System.out.println("Busca -2 na lista");
		lista.buscar(-2).exibir();;

		System.out.println("Busca -4 na lista (não esta na lista)");
		lista.buscar(-4);
		
		System.out.println();
	}
}
