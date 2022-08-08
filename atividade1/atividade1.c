#include "atividade1.h"

tipo_grafo *cria(int max) {
  int i;
  char nome[10];
  tipo_grafo *gr = malloc(sizeof(tipo_grafo));

  gr->n_vertices = max;
  gr->n_aresta = 0;
  gr->vertices = malloc((size_t)(max) * sizeof(tipo_vertice));

  for (i = 0; i < max; i++) {
    gr->vertices[i].cabeca = NULL;
  }

  return gr;
}

void insere_aresta(tipo_grafo *gr, int v1, int v2, float peso) {
  // cria nova aresta
  tipo_aresta *nova = malloc(sizeof(tipo_aresta));
  nova->peso = peso;
  nova->proxima = NULL;
  nova->adjacencia = v2;

  tipo_aresta *anterior, *atual = gr->vertices[v1].cabeca;

  if (atual == NULL) {
    // se lista de arestas não inicializada
    gr->vertices[v1].cabeca = nova;
  } else {
    // senão, busca fim da lista
    while (atual != NULL) {
      anterior = atual;
      if (anterior->adjacencia == v2) {
        printf("\nConexão já adicionada!\n\n");
        free(nova);
        return;
      }
      atual = atual->proxima;
    }

    // coloca nova aresta no fim
    anterior->proxima = nova;
  }

  // incrementa arestas
  gr->n_aresta++;

  printf("\nConexão inserida!\n\n");
}

void imprime(tipo_grafo *gr) {
  int i;
  tipo_aresta *aresta;

  printf("\nNuméro total de vértices: %d\nNúmero total de conexões: %d\n", gr->n_vertices, gr->n_aresta);

  for (i = 0; i < gr->n_vertices; i++) {
    printf("\nVértice %d: ", i);

    aresta = gr->vertices[i].cabeca;

    if (aresta != NULL) {
      printf("%d (%.2f) ", aresta->adjacencia, aresta->peso);
      aresta = aresta->proxima;
    }

    while (aresta != NULL) {
      printf("- %d (%.2f) ", aresta->adjacencia, aresta->peso);
      aresta = aresta->proxima;
    }

    printf("\n");
  }
}
