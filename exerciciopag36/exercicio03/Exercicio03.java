package exerciciopag36.exercicio03;

import exerciciopag36.model.Contato;
import exerciciopag36.model.MockAgenda;
import java.util.List;

/**
 * Exercício 1.5: Pesquisa de de um número na Agenda Telefônica
 * 
 * Este exercício vai percorer a agenda telefonica e ler cada um dos contatos
 *
 * - **Objetivo**: Percorer a lista telefonica lendo todos os números
 * - **Passos**:
 *   3. Retornar lista telefonica.
 */
public class Exercicio03 {
    
    MockAgenda agenda;
    List<Contato> contatos;

    public Exercicio03() {
        agenda = new MockAgenda();
        contatos = agenda.getContatos();
    }

    public void printContatos() {
        contatos.forEach(cont -> {
            System.out.println(cont.toString());
        });
    }

    public static void main(String[] args) {
        
        Exercicio03 exercicio = new Exercicio03();
        
        exercicio.printContatos();
    }

   

}