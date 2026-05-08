# Unita 14 - Polimorfismo

## Argomenti
- Una variabile dichiarata di tipo padre puo' riferire un oggetto
  di tipo figlio.
- **Dispatch dinamico**: il metodo eseguito e' quello effettivo
  dell'oggetto, non quello del tipo della variabile.
- Classi astratte (`abstract`) e metodi astratti.
- Operatore `instanceof` e cast verso il basso.

## Esempio: gerarchia Forma
- `Forma.java` (astratta) con metodo `area()` astratto.
- `Cerchio.java`, `Rettangolo.java`, `Triangolo.java`.
- `TestPolimorfismo.java`: array di `Forma[]` con oggetti diversi.
