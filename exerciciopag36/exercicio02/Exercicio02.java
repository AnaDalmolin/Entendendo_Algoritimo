package exerciciopag36.exercicio02;

import exerciciopag36.model.Contato;
import exerciciopag36.model.MockAgenda;
import java.util.List;
import java.util.Optional;

/**
 * Exercício 1.4: Pesquisa de de um número na Agenda Telefônica
 * 
 * Este exercício simula a busca do dono do número de telefone passado por parametro
 * em uma agência telefônica. O objetivo é desenvolver uma lógica que permita encontrar
 * e retornar o número de telefone de um contato a partir do seu nome.
 *
 * - **Objetivo**: Dado um telefone, encontrar o dono do telefone correspondente na agenda.
 * - **Objetivo**: Tem que percorer a lista inteira.
 * - **Passos**:
 *   1. Receber número de telefone como entrada.
 *   2. Buscar na lista de contatos da agenda pelo telefone fornecido.
 *   3. Retornar o nome do contato encontrado ou uma mensagem indicando que o contato não foi localizado.
 */
public class Exercicio02 {
    
    MockAgenda agenda;
    List<Contato> contatos;

    public Exercicio02() {
        agenda = new MockAgenda();
        contatos = agenda.getContatos();
    }

    public String buscarNomeTelefone(Contato contatoAnonimo){
        
       Optional<Contato> optional = contatos.stream()
            .filter(cont -> cont.getTelefone().equals(contatoAnonimo.getTelefone()))
            .findFirst();
            
        if (optional.isPresent()) {
            return optional.get().toString(); 
        } else {
            return "Contato não encontrado";
        }

    }

    public static void main(String[] args) {
        
        Exercicio02 exercicio = new Exercicio02();

        Contato contatoAnonimo = new Contato("", "999333333");

        System.out.println(exercicio.buscarNomeTelefone(contatoAnonimo));
    }

}