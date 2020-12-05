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

public class CrivoEratostenes {
   public void processar(int pValue) {
        boolean numerosPrimos[] = new boolean[pValue + 1];

        for (int i = 2; i <= pValue; i++) {
            numerosPrimos[i] = true;
        }

        for (int i = 2; i <= pValue; i++) {
            if (numerosPrimos[i]) {
                for (int j = i; i * j <= pValue; j++) {
                    numerosPrimos[i*j] = false;
                }
            }
        }

       //return numerosPrimos;
       System.out.println("Resultado dos números Primos.");

        for (int i = 0; i < numerosPrimos.length; i++) {
            if (numerosPrimos[i]) {
                System.out.printf("%d ", i);
            }
        }
    }  
}
