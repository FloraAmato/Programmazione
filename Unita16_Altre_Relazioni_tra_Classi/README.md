# Unita 16 - Altre relazioni tra classi

Oltre all'ereditarieta, le classi possono essere collegate da:
- **Associazione**: una classe usa un'altra (riferimento generico).
- **Aggregazione**: relazione "ha" debole (le parti possono
  esistere senza il tutto).
- **Composizione**: relazione "ha" forte (le parti vivono e
  muoiono col tutto).
- **Dipendenza**: usata localmente in un metodo.

## Esempio
- `Motore.java`, `Ruota.java`: parti.
- `Auto.java`: composta da `Motore` (composizione: l'auto crea
  il proprio motore) e collegata a un `Garage` (aggregazione: il
  garage e' condiviso).
- `Garage.java`: contiene un elenco di auto.
- `TestRelazioni.java`.
