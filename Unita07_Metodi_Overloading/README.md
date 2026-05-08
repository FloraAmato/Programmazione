# Unita 7 - Metodi e Overloading

## Argomenti dalle slide
- Sintassi di un metodo: modificatori, tipo restituito, nome, lista
  parametri, corpo, `return`.
- Metodi `static` (di classe) vs metodi di istanza.
- Tre modi di invocazione: su oggetto, su classe (`static`), nello
  stesso scope.
- **Passaggio dei parametri**: in Java SEMPRE per valore. Quando
  pero' il valore e' un riferimento, l'oggetto puntato puo' essere
  modificato.
- **Overloading**: metodi con stesso nome ma firma diversa
  (numero/tipo dei parametri). Il tipo di ritorno NON entra nella
  firma.
- Conversioni implicite: `char -> int -> long -> float -> double`.

## Esempi
- `Es3Somma.java`: il metodo `Somma` statico delle slide.
- `CalcoloFattoriale.java`: il metodo `Fattoriale` chiamato da `main`.
- `PassaggioParametri.java`: dimostra che i tipi primitivi sono
  passati per valore mentre per gli oggetti il riferimento permette
  di modificare lo stato.
- `EsempioOverloading.java`: stesso `stampa` su tipi diversi e
  regole di conversione.
- `Quadrato.java`: overloading di `quadrato(int)` e `quadrato(double)`.
