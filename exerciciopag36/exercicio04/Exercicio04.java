package exerciciopag36.exercicio04;

import exerciciopag36.model.Contato;
import exerciciopag36.model.MockAgenda;
import java.util.List;

/**
 * Exercício 1.6: Pesquisa de Contato na Agenda Telefônica
 * 
 * Neste exercicio você que ler apenas os contatos que começam com a letra A
 *
 * - **Objetivo**: Dado um nome, encontrar o número de telefone correspondente na agenda.
 * - **Passos**:
 *   1. Receber o nome do contato como entrada.
 *   2. Buscar na lista de contatos da agenda pelo nome fornecido.
 *   3. Retornar o número de telefone do contato encontrado ou uma mensagem indicando que o contato não foi localizado.
 */
public class Exercicio04 {
    
    MockAgenda agenda;
    List<Contato> contatos;
    List<Contato> sublista;

    public Exercicio04() {
        agenda = new MockAgenda();
        contatos = agenda.getContatos();
    }

    public void filtrarContatos(String letra){
        
        List<Contato> sublista = contatos.stream()
        .filter(cont -> cont.getNome().startsWith(letra))
        .toList();


        if (!sublista.isEmpty()) {
            sublista.forEach(cont -> {
                System.out.println(cont.toString());
            });
        } else {
            System.out.println("Contato não encontrado");
        }

    }

    public static void main(String[] args) {
        
        Exercicio04 exercicio = new Exercicio04();
        
        exercicio.filtrarContatos("A");

    }

   

}