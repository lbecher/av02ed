import java.util.List;
import java.util.ArrayList;

public class Lista {
  public List<Nodo> lista;

  public void adiciona_no_inicio(int valor) {
    Nodo novo = new Nodo(valor, null);
    if (this.lista == null) {
      this.lista = new ArrayList<Nodo>();
      this.lista.add(novo);
    } else {
      novo.set_proximo(this.lista.get(0));
      this.lista.add(0, novo);
    }
  }

  public void adiciona_no_fim(int valor) {
    Nodo novo = new Nodo(valor, null);
    if (this.lista == null) {
      this.lista = new ArrayList<Nodo>();
      this.lista.add(novo);
    } else {
      Nodo atual = this.lista.get(0);
      Nodo proximo = this.lista.get(0);
      while (proximo != null) {
        atual = proximo;
        proximo = proximo.get_proximo();
      }
      atual.set_proximo(novo);
      this.lista.add(novo);
    }
  }

  public void adiciona_na_posicao(int i, int valor) {
    Nodo novo = new Nodo(valor, null);
    if (this.lista == null) {
      System.out.printf("Lista não inicializada!\nAdicionando como primeiro elemento!\n");
      this.lista = new ArrayList<Nodo>();
      this.lista.add(novo);
    } else if (i > this.lista.size() || i < 0) {
      System.out.printf("Posição fora do comprimento da lista!\n");
    } else if (i == 0) {
      this.adiciona_no_inicio(valor);
    } else {
      Nodo atual = this.lista.get(0);
      Nodo proximo = this.lista.get(1);
      for (int j = 1; j < i; j++) {
        atual = proximo;
        proximo = proximo.get_proximo();
      }
      atual.set_proximo(novo);
      novo.set_proximo(proximo);
      this.lista.add(i, novo);
    }
  }

  public int remove_do_inicio() {
    if (this.lista == null) {
      System.out.printf("Lista não inicializada!\n");
      return -1;
    } else {
      Nodo nodo = this.lista.get(0);
      this.lista.remove(0);
      return nodo.get_valor();
    }
  }

  public int remove_do_fim() {
    if (this.lista == null) {
      System.out.printf("Lista não inicializada!\n");
      return -1;
    } else if (this.lista.size() == 1) {
      return this.remove_do_inicio();
    } else {
      int i = -1;
      Nodo atual = null;
      Nodo proximo = this.lista.get(0);
      while (proximo != null) {
        atual = proximo;
        proximo = proximo.get_proximo();
        i++;
      }
      int valor = atual.get_valor();
      this.lista.remove(i);

      proximo = this.lista.get(0);
      for (int j = 1; j <= i; j++) {
        atual = proximo;
        proximo = proximo.get_proximo();
      }
      atual.set_proximo(null);
      return valor;
    }
  }

  public int remove_da_posicao(int i) {
    if (this.lista == null) {
      System.out.printf("Lista não inicializada!\n");
      return -1;
    } else if (i > this.lista.size() || i < 0) {
      System.out.printf("Posição fora do comprimento da lista!\n");
      return -1;
    } else if (this.lista.size() == 1) {
      return this.remove_do_inicio();
    } else {
      Nodo atual = null;
      Nodo proximo = this.lista.get(0);
      for (int j = 1; j <= i; j++) {
        atual = proximo;
        proximo = proximo.get_proximo();
      }
      Nodo nodo = atual;
      int valor = nodo.get_valor();

      this.lista.remove(i);

      proximo = this.lista.get(0);
      for (int j = 1; j <= i - 1; j++) {
        atual = proximo;
        proximo = proximo.get_proximo();
      }

      atual.set_proximo(nodo.get_proximo());
      return valor;
    }
  }

  public void printa_lista() {
    if (this.lista == null) {
      System.out.printf("Lista não inicializada!\n");
    } else if (this.lista.size() == 0) {
      System.out.printf("Lista vazia!\n");
    } else {
      for (int j = 0; j < this.lista.size(); j++) {
        Nodo nodo = this.lista.get(j);
        System.out.printf("%d ", nodo.get_valor());
      }
      System.out.printf("\n");
    }
  }
}
