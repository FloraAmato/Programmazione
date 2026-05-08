# Unita 3 - Programmazione Modulare

Concetti base: modularizzazione, information hiding, coesione,
accoppiamento, ADT (Abstract Data Type).

## Argomenti
- Modulo come unita di scomposizione del software.
- Relazioni "usa" e "e composto da".
- Top-down vs bottom-up.
- Information hiding: l'interfaccia espone solo cio che serve, i
  dettagli implementativi sono nascosti.
- Alta coesione, basso accoppiamento.
- Java realizza la modularita tramite *classi*, *package* e (da Java 9)
  *moduli* veri e propri.

## Esempio: ADT Persona
Realizziamo l'esempio della slide tramite una classe Java che
incapsula i dati e li espone tramite metodi pubblici (interfaccia).

Files:
- `modulare/Persona.java`: ADT con campi privati e metodi pubblici.
- `modulare/TestPersona.java`: programma client che usa Persona
  senza conoscerne i dettagli interni.
