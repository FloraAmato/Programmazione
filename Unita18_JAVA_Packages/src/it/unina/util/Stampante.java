package it.unina.util;

import it.unina.geometria.Cerchio;

public class Stampante {
    public static void stampa(Cerchio c) {
        System.out.printf("Cerchio in (%.1f, %.1f) r=%.1f area=%.2f%n",
                c.getCentro().getX(), c.getCentro().getY(),
                c.getRaggio(), c.area());
    }
}
