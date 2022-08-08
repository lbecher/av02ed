public class Lista {
  // atributos
  private Nodo cabeca;
  private int tamanho;
  
  // construtor
  public Lista() {
    this.cabeca = null;
    this.tamanho = 0;
  }

  // métodos
  public void adiciona_no_inicio(Dado dado) {
    Nodo novo = new Nodo(dado, null);

    if (this.tamanho == 0) {
      this.cabeca = novo;
      this.tamanho = 1;
    } else {
      novo.set_proximo(this.cabeca);
      this.cabeca = novo;
      this.tamanho++;
    }
  }

  public void adiciona_no_fim(Dado dado) {
    Nodo novo = new Nodo(dado, null);

    if (this.tamanho == 0) {
      this.cabeca = novo;
      this.tamanho = 1;
    } else {
      Nodo nodo = this.cabeca;
      Nodo anterior = null;
      
      // encontra o fim da lista
      while (nodo != null) {
        anterior = nodo;
        nodo = nodo.get_proximo();
      }
      
      anterior.set_proximo(novo);
      this.tamanho++;
    }
  }

  public void adiciona_na_posicao(int i, Dado dado) {
    Nodo novo = new Nodo(dado, null);
    
    if (i >= tamanho || i < 0) {
      System.out.printf("Valor da posição fora do comprimento atual da estrutura de dados!\n");
    } else if (this.tamanho == 0) {
      this.cabeca = novo;
      this.tamanho = 1;
    } else if (i == 0) {
      this.adiciona_no_inicio(dado);
    } else {
      Nodo nodo = this.cabeca;
      Nodo anterior = null;
      
      // encontra nodo da posição i
      for (int j = 0; j < i; j++) {
        anterior = nodo;
        nodo = nodo.get_proximo();
      }
      
      novo.set_proximo(nodo);
      anterior.set_proximo(novo);
      this.tamanho++;
    }
  }

  public Dado remove_do_inicio() {
    if (this.tamanho == 0) {
      System.out.printf("Estrutura de dados vazia!\n");
      return null;
    } else {
      Dado dado = this.cabeca.get_dado();
      this.cabeca = this.cabeca.get_proximo();
      this.tamanho--;
      return dado;
    }
  }

  public Dado remove_do_fim() {
    if (this.tamanho < 2) {
      return this.remove_do_inicio();
    } else {
      Nodo nodo = this.cabeca.get_proximo();
      Nodo anterior = this.cabeca;
      Nodo anterior_do_anterior = null;
      
      // encontra o fim da lista
      while (nodo != null) {
        anterior_do_anterior = anterior;
        anterior = nodo;
        nodo = nodo.get_proximo();
      }
      
      Dado dado = anterior.get_dado();
      anterior_do_anterior.set_proximo(null);
      this.tamanho--;
      return dado;
    }
  }

  public Dado remove_da_posicao(int i) {
    if (i >= tamanho || i < 0) {
      System.out.printf("Valor da posição fora do comprimento atual da estrutura de dados!\n");
      return null;
    } else if (this.tamanho < 2) {
      return this.remove_do_inicio();
    } else if (this.tamanho == i - 1) {
      return this.remove_do_fim();
    } else {
      Nodo nodo = this.cabeca.get_proximo();
      Nodo anterior = this.cabeca;
      Nodo anterior_do_anterior = null;
      
      // encontra nodo da posição i
      for (int j = 0; j < i; j++) {
        anterior_do_anterior = anterior;
        anterior = nodo;
        nodo = nodo.get_proximo();
      }
      
      Dado dado = anterior.get_dado();
      anterior_do_anterior.set_proximo(nodo);
      this.tamanho--;
      return dado;
    }
  }
  
  public int get_tamanho() {
    return this.tamanho;
  }

  public void printa() {
    System.out.printf("\nEstrutura de dados: ");
    if (this.cabeca == null) {
      System.out.printf("vazia!\n\n");
    } else {
      Nodo nodo = this.cabeca;
      Dado dado = null;
      while (nodo != null) {
        dado = nodo.get_dado();
        System.out.printf("%d ", dado.get_dado());
        nodo = nodo.get_proximo();
      }
      System.out.printf("\n\n");
    }
  }
}
