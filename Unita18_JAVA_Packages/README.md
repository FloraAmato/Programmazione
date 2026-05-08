# Unita 18 - Package

## Argomenti
- `package` raggruppa classi correlate.
- Convenzione di naming: `com.azienda.modulo`.
- `import` per usare classi di altri package.
- Visibilita: `public`, `private`, `protected`, *package-private*
  (default, senza modificatore).
- Corrispondenza fra package e cartelle filesystem.

## Struttura
```
src/
  it/unina/geometria/Punto.java       (package it.unina.geometria)
  it/unina/geometria/Cerchio.java     (package it.unina.geometria)
  it/unina/util/Stampante.java        (package it.unina.util)
  MainPackage.java                    (default package)
```

## Esecuzione manuale
```bash
javac -d bin $(find src -name "*.java")
java -cp bin MainPackage
```
