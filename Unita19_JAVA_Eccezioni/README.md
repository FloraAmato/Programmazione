# Unita 19 - Gestione delle Eccezioni

## Argomenti
- Gerarchia: `Throwable -> Error / Exception -> RuntimeException`.
- **Checked** (da gestire/dichiarare) vs **unchecked** (runtime).
- `try` / `catch` / `finally`.
- `throws` nella firma per propagare.
- `throw` per lanciare un'eccezione.
- Eccezioni custom (estendono `Exception` o `RuntimeException`).
- `try-with-resources` per la chiusura automatica.

## Esempi
- `Divisione.java`: gestisce `ArithmeticException` e
  `InputMismatchException`.
- `EsempioFinally.java`: dimostra l'esecuzione di `finally`.
- `LetturaFile.java`: try-with-resources con `BufferedReader`.
- `dominio/SaldoInsufficienteException.java` + `dominio/Conto.java`
  + `TestConto.java`: eccezione custom in un dominio bancario.
