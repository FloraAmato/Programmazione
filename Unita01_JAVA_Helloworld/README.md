# Unita 1 - Welcome to Java!

Primo programma Java: struttura, compilazione ed esecuzione.

## Argomenti dalle slide
- Dichiarazione di classe (`public class HelloWorld { ... }`)
- Metodo `main` come punto di avvio
- `System.out.println(...)`
- Commenti su singola e su piu linee
- Convenzioni di naming (CamelCase per le classi)
- Compilazione con `javac` e produzione del bytecode `.class`
- Esecuzione con `java` tramite la JVM

## File inclusi
- `HelloWorld.java`: il classico primo programma.
- `HelloMondo.java`: variante in italiano con piu istruzioni di stampa.
- `MioPrimoProgramma.java`: stampa varia che usa `print`/`println`.

## Esecuzione da terminale
```bash
javac -d bin src/HelloWorld.java
java -cp bin HelloWorld
```
