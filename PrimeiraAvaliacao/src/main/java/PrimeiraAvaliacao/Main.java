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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Aluno aluno1 = new Aluno("Aluno 1", "E-mail 1");
        //Aluno aluno2 = new Aluno("Aluno 2", "E-mail 2");

        //Frequentador frequentador = new Frequentador();
        //frequentador.adicionar(aluno1);
        //frequentador.adicionar(aluno2);

        //System.out.println("ola mundo");
        //System.out.println("O valor do prêmio calculado é R$ " + new Raspadinha().calcular());
        //System.out.println("O total de " + new PalavrasCruzadas().calcular("JáVA") + " números.");

       // CrivoEratostenes Crivo = new CrivoEratostenes();
       // Crivo.processar(100);
       HashTabela jj = new HashTabela(10);

       for (int i = 0; i < 10; i++){
           jj.put("Chave" + (i + 1), "Valor" + (i + 1));
       }

       jj.print();
    }

}
