/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimeiraAvaliacao;

/**
 *
 * @Jorge Eduardo
 */

import java.util.HashMap;
import java.util.Map;

public class Raspadinha {
    private int[] bilhete = new int[6]; 

    public Raspadinha() {
        this.bilhete[0] = 1;
        this.bilhete[1] = 5;
        this.bilhete[2] = 10;
        this.bilhete[3] = 500;
        this.bilhete[4] = 5;
        this.bilhete[5] = 5;

        //this.bilhete[0] = 10;
        //this.bilhete[1] = 5;
        //this.bilhete[2] = 10;
        //this.bilhete[3] = 100;
        //this.bilhete[4] = 5;
        //this.bilhete[5] = 5;
    }

    public double calcular() {
        double valor = 0;
        Map<Integer, Integer> mapas = new HashMap<Integer, Integer>();

        for (int numero : bilhete) {
            mapas.put(numero, mapas.getOrDefault(numero, 0) + 1);
        }

        for (Map.Entry<Integer, Integer > mapa : mapas.entrySet()) {
            if (mapa.getValue() >= 3) {
                valor += (mapa.getKey() * mapa.getValue());
            }
        }

        return valor;
    }
}
