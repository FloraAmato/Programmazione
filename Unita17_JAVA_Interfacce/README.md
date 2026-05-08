# Unita 17 - Interfacce

## Argomenti
- `interface`: contratto di metodi (per default `public abstract`).
- `implements`: una classe puo' implementarne piu' di una.
- Risolve l'ereditarieta multipla per "tipi".
- Da Java 8: metodi `default` e `static` nelle interfacce.
- Esempi standard: `Comparable`, `Comparator`, `Runnable`.

## Esempi
- `Stampabile.java`, `Salvabile.java`: due interfacce semplici.
- `Documento.java`: classe che le implementa entrambe.
- `TestInterfacce.java`.
- `OrdinaPersone.java`: usa `Comparable` e `Comparator` per
  ordinare per nome o per eta.
