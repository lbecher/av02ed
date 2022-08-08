#include <stdio.h>
#include <stdlib.h>

typedef struct Aresta {
  int *proxima;
  int adjacencia;
  float peso;
} tipo_aresta;

typedef struct Vertice {
  tipo_aresta *cabeca;
} tipo_vertice;

typedef struct Grafo {
  tipo_vertice *vertices;
  int n_vertices;
  int n_aresta;
} tipo_grafo;

tipo_grafo *cria(int max);
void insere_aresta(tipo_grafo *gr, int v1, int v2, float peso);
void imprime(tipo_grafo *gr);
