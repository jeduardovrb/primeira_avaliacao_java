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

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PalavrasCruzadas {
    private Map<Character, Integer> mapas; 

    public PalavrasCruzadas() {
        mapas = new HashMap<Character, Integer>();

        mapas.put('A', 1);  mapas.put('B', 3); mapas.put('C', 3); mapas.put('D', 2);
        mapas.put('E', 1);  mapas.put('F', 4); mapas.put('G', 2); mapas.put('H', 4);
        mapas.put('I', 1);  mapas.put('J', 8); mapas.put('K', 5); mapas.put('L', 1);
        mapas.put('M', 3);  mapas.put('N', 1); mapas.put('O', 1); mapas.put('P', 3);
        mapas.put('Q', 10); mapas.put('R', 1); mapas.put('S', 1); mapas.put('T', 1);
        mapas.put('U', 1);  mapas.put('V', 4); mapas.put('W', 4); mapas.put('X', 8);
        mapas.put('Y', 4);  mapas.put('Z', 10);
    }

    private String retirarAcento(String pPalavra) {
        return Normalizer.normalize(pPalavra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public int calcular(String pPalavra) {
        int total = 0;

        for (Character letra : this.retirarAcento(pPalavra).toUpperCase().toCharArray()) {
            total += this.mapas.getOrDefault(letra, 0);
        }

        return  total;
    }
}
