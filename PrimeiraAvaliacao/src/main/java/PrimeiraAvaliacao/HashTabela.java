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

public class HashTabela {
    private Hash[] arryHash;
    private int TAMANHO;

    public HashTabela(int tam) {
        arryHash = new Hash[tam];
        TAMANHO = tam;
        for(int i=0; i < tam; i++) {
            arryHash[i] = new Hash("", "");
        }
    }

    private int funcaoHash(String chave) {
        int v = chave.hashCode();
        return (Math.abs(v) % TAMANHO);
    }

    public void put(String chave, String valor) {
        int pos = funcaoHash(chave);

        if (arryHash[pos].valor != "") {
            if (arryHash[pos].chave.equals(chave)) {
                System.out.println("\n->Esse item ja foi cadastrado, verifique.");
                return;
            }

            System.out.println("-> Ocorreu um erro na posicao " + pos);
            while (pos < TAMANHO) {
                if (pos == TAMANHO - 1 ) {
                    pos = -1;
                }
                pos++;
                if (arryHash[pos].valor.equals("")) {
                    break;
                }
            }
        }

        arryHash[pos].chave = chave;
        arryHash[pos].valor = valor;
    }

    public String get(String chave) {
        int pos = funcaoHash(chave);
        if (arryHash[pos].valor != "") {
            if (arryHash[pos].chave.equals(chave)) {
                return arryHash[pos].valor;
            }
            int inicioBusca = pos;
            while (pos < TAMANHO) {
                if (pos == TAMANHO-1) {
                    pos = -1;
                }
                pos++;
                if (arryHash[pos].valor != "" && arryHash[pos].chave.equals(chave)) {
                    return arryHash[pos].valor;
                }
                if (pos == inicioBusca) {
                    return "";
                }
            }
        }
        return "";
    }

    public boolean remove(String chave) {
        int pos = funcaoHash(chave);

        if (arryHash[pos].chave.equals(chave)) {
            arryHash[pos].chave = "";
            arryHash[pos].valor = "";
            return true;
        }
        else {
            return false;
        }
    }

    public void print() {
        for (int i=0; i<TAMANHO; i++)
            if (arryHash[i].valor != "")
                System.out.print("\nHash[" + i + "] = " + arryHash[i].chave);
    }

    public int size() {
        int i;
        int qtde = 0;
        for (i = 0; i < TAMANHO; i++) {
            if (arryHash[i].valor != "" && arryHash[i].chave != "") {
                qtde++;
            }
        }
        return qtde;
    }

    public boolean containsKey(String chave) {
        int pos = funcaoHash(chave);

        if (arryHash[pos].chave.equals(chave)) {
            return true;
        }

        return false;
    }
}
