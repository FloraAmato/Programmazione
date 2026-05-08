# Programmazione

Benvenuti nella pagina GitHub del Corso di Programmazione.

Qui troverete i progetti per le esercitazioni del corso, divisi
in base alle Unita di Apprendimento delle lezioni.

Prof. Flora Amato.

## Come usare i progetti

Ogni cartella `Unita..` e' un progetto Java standalone, configurato
per VSCode (estensione **Extension Pack for Java** di Microsoft).
Apri la singola cartella in VSCode con `File -> Open Folder...`,
poi seleziona un file `.java` con un metodo `main` e clicca *Run*.

In alternativa, da terminale dentro la cartella della lezione:
```bash
javac -d bin $(find src -name '*.java')
java -cp bin <NomeClassePrincipale>
```

## Indice delle lezioni

| # | Cartella | Argomento |
|---|----------|-----------|
| 0 | [`Unita0_Introduzione`](./Unita0_Introduzione) | Introduzione al corso |
| 1 | [`Unita01_JAVA_Helloworld`](./Unita01_JAVA_Helloworld) | Primo programma: HelloWorld |
| 2 | [`Unita02_JAVA_introduzione_sviluppo`](./Unita02_JAVA_introduzione_sviluppo) | Ciclo di sviluppo: javac, JVM, bytecode |
| 3 | [`Unita03_ProgModulare`](./Unita03_ProgModulare) | Programmazione modulare, ADT, information hiding |
| 4 | [`Unita04_OOConcettiBase`](./Unita04_OOConcettiBase) | OOP: oggetto, classe, incapsulamento |
| 5 | [`Unita05_JAVA_Classi`](./Unita05_JAVA_Classi) | Classi, costruttori, getter/setter |
| 6 | [`Unita06_JAVA_Getting_Started`](./Unita06_JAVA_Getting_Started) | Mini progetto: rubrica contatti |
| 7 | [`Unita07_Metodi_Overloading`](./Unita07_Metodi_Overloading) | Metodi, parametri, overloading |
| 8 | [`Unita08_JAVA_Tipi`](./Unita08_JAVA_Tipi) | Tipi primitivi, conversioni, costanti |
| 9 | [`Unita09_JAVA_Array`](./Unita09_JAVA_Array) | Array: ricerca, inversione, min/max |
| 10 | [`Unita10_JAVA_Classi_Aspetti_Avanzati`](./Unita10_JAVA_Classi_Aspetti_Avanzati) | static, this, costruttori multipli, Cerchio |
| 11 | [`Unita11_JAVA_Tipi_Array_Aspetti_Avanzati`](./Unita11_JAVA_Tipi_Array_Aspetti_Avanzati) | Array multidim, varargs, wrapper |
| 12 | [`Unita12_JAVA_String`](./Unita12_JAVA_String) | String, equals, palindromo, StringBuilder |
| 13 | [`Unita13_JAVA_Ereditarieta`](./Unita13_JAVA_Ereditarieta) | extends, super, override, gerarchia Veicolo |
| 14 | [`Unita14_JAVA_Polimorfismo`](./Unita14_JAVA_Polimorfismo) | Classi astratte, dispatch dinamico, gerarchia Forma |
| 15 | [`Unita15_JAVA_Object`](./Unita15_JAVA_Object) | toString/equals/hashCode, HashSet |
| 16 | [`Unita16_Altre_Relazioni_tra_Classi`](./Unita16_Altre_Relazioni_tra_Classi) | Composizione vs aggregazione vs associazione |
| 17 | [`Unita17_JAVA_Interfacce`](./Unita17_JAVA_Interfacce) | interface, implements, Comparable, Comparator |
| 18 | [`Unita18_JAVA_Packages`](./Unita18_JAVA_Packages) | package, import, visibilita |
| 19 | [`Unita19_JAVA_Eccezioni`](./Unita19_JAVA_Eccezioni) | try/catch/finally, eccezioni custom, try-with-resources |

## Slide originali

Le slide `.pptx` / `.ppt` di tutte le lezioni si trovano nella
cartella [`Lezioni/`](./Lezioni).

Buone esercitazioni!
