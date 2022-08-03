public class Nodo {
  private int valor;
  private Nodo proximo;

  public Nodo(int valor, Nodo proximo) {
    this.valor = valor;
    this.proximo = proximo;
  }

  public void set_proximo(Nodo proximo) {
    this.proximo = proximo;
  }

  public int get_valor() {
    return this.valor;
  }

  public Nodo get_proximo() {
    return this.proximo;
  }
}
