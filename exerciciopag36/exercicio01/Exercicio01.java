package exerciciopag36.exercicio01;

import exerciciopag36.model.Contato;
import exerciciopag36.model.MockAgenda;
import java.util.List;
import java.util.Optional;

/**
 * Exercício 1.3: Pesquisa de Contato na Agenda Telefônica
 * 
 * Este exercício simula a busca de um número de telefone associado a um nome específico
 * em uma agência telefônica. O objetivo é desenvolver uma lógica que permita encontrar
 * e retornar o número de telefone de um contato a partir do seu nome.
 *
 * - **Objetivo**: Dado um nome, encontrar o número de telefone correspondente na agenda.
 * - **Passos**:
 *   1. Receber o nome do contato como entrada.
 *   2. Buscar na lista de contatos da agenda pelo nome fornecido.
 *   3. Retornar o número de telefone do contato encontrado ou uma mensagem indicando que o contato não foi localizado.
 */
public class Exercicio01 {

    MockAgenda agenda;
    List<Contato> contatos;

    public Exercicio01() {
        agenda = new MockAgenda();
        contatos = agenda.getContatos();
    }

    public String buscarContato(Contato contatoAna) {
        
        Optional<Contato> contatoEncontrado = contatos.stream()
            .filter(cont -> cont.getNome().equals(contatoAna.getNome()))
            .findFirst();
        
        if (contatoEncontrado.isPresent()) {
            return contatoEncontrado.get().toString();
        } else {
            return "Contato não encontrado";
        }
    }

    public static void main(String[] args) {

        Exercicio01 exercicio = new Exercicio01();

        Contato contatoAna = new Contato("Ana", ""); 

        exercicio.buscarContato(contatoAna);

        System.out.println("Telefone de Ana: " + contatoAna.toString());

    }
}