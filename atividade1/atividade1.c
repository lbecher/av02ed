#include "atividade1.h"

Grafo cria(int max) {
  int i;
  Grafo gr = malloc(sizeof *gr);
  gr->n_vertices = max;
  gr->n_aresta = 0;
  gr->conexao = malloc(max * sizeof(no *));
  for (i = 0; i < max; i++) {
    gr->conexao[i] = NULL;
  }
  return gr;
}

void insere_conexao(Grafo gr, tipo_vertice vertice1, tipo_vertice vertice2, float peso) {
  no *p;
  for (p = gr->conexao[vertice1]; p != NULL; p = p->proximo) {
    if (p->nome_vertice == vertice2)
      return;
  }
  p = malloc(sizeof(no));
  p->nome_vertice = vertice2;
  p->peso = peso;
  p->proximo = gr->conexao[vertice1];
  gr->conexao[vertice1] = p;
  gr->n_aresta++;
}

void imprime(Grafo gr) {
  int i;
  no *p;
  printf("Numéro total de vértices= %d; número total de conexões: %d \n \n", gr->n_vertices, gr->n_aresta);
  for (i = 0; i < gr->n_vertices; i++) {
    printf("Vertice %d:",i);
    for (p = gr->conexao[i]; p != NULL; p = p->proximo)
      printf("- %d (%.2f)", p->nome_vertice, p->peso);
    printf("\n");
  }
}
