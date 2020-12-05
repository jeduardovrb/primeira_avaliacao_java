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

public class Aluno {
    private String nome;
    private String email;

    public Aluno(String pAluno, String pEmail) {
        this.nome = pAluno;
        this.email = pEmail;
    }

    public void setAluno(String pAluno) {
        this.nome = pAluno;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}
