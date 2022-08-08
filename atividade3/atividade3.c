#include "atividade3.h"

void ordenacao_shellsort(int *a, int size) {
  int i, j, h = 1, aux;

  //define quantas posições h 
  do {
    h = 3 * h + 1;
  } while (h < size);

  // ordena
  do {
    h /= 3;
    for (i = h; i < size; i++) {
      aux = a[i];
      j = i - h;

      while (j >= 0 && aux < a[j]) {
        a[j + h] = a[j];
        j -= h;
      }
      a[j + h] = aux;
    }
  } while (h > 1);
}
