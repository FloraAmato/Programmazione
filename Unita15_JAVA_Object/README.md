# Unita 15 - La classe Object

Tutte le classi Java derivano da `java.lang.Object`. Conviene
spesso fare l'override di alcuni suoi metodi.

## Argomenti
- `toString()`: rappresentazione testuale dell'oggetto.
- `equals(Object)`: confronto logico.
- `hashCode()`: contratto con `equals` per le strutture hash.
- `getClass()`: introspezione del tipo a runtime.
- Cenni a `clone()` e `finalize()` (deprecato).

## Esempi
- `Libro.java`: classe con override di `toString`, `equals`, `hashCode`.
- `TestLibro.java`: dimostra l'uso in un `HashSet`.
