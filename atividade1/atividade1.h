#include <stdio.h>
#include <stdlib.h>

typedef int tipo_vertice;

typedef struct vertice no;
struct vertice {
  tipo_vertice nome;
  no *proximo;
  float peso;
};

typedef struct grafo *Grafo;
struct grafo {
  no **conexao;
  int n_vertices;
  int n_aresta;
};

Grafo cria(int max);
void insere_conexao(Grafo gr, tipo_vertice vertice1, tipo_vertice vertice2, float peso);
void imprime(Grafo gr);
