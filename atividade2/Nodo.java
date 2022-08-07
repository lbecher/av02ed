public class Nodo {
	private Dado dado;
	private Nodo proximo;

	public Nodo(Dado dado, Nodo proximo) {
		this.dado = dado;
		this.proximo = proximo;
	}

	public void set_proximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public Dado get_dado() {
		return this.dado;
	}

	public Nodo get_proximo() {
		return this.proximo;
	}
}
