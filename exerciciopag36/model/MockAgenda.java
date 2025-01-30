package exerciciopag36.model;

import java.util.ArrayList;
import java.util.List;

public class MockAgenda {

    List<Contato> contatos = new ArrayList<>();

    public MockAgenda() {
        contatos.add(new Contato("João", "999123456"));
        contatos.add(new Contato("Maria", "999111111"));
        contatos.add(new Contato("Pedro", "999222222"));
        contatos.add(new Contato("Ana", "999333333"));
        contatos.add(new Contato("Lucas", "999444444"));
        contatos.add(new Contato("Juliana", "999555555"));
        contatos.add(new Contato("Gabriel", "999666666"));
        contatos.add(new Contato("Carla", "999777777"));
        contatos.add(new Contato("Rafael", "999888888"));
        contatos.add(new Contato("Fernanda", "999999999"));
        contatos.add(new Contato("Mateus", "998111111"));
        contatos.add(new Contato("Larissa", "998222222"));
        contatos.add(new Contato("Thiago", "998333333"));
        contatos.add(new Contato("Beatriz", "998444444"));
        contatos.add(new Contato("Gustavo", "998555555"));
        contatos.add(new Contato("Camila", "998666666"));
        contatos.add(new Contato("Renato", "998777777"));
        contatos.add(new Contato("Amanda", "998888888"));
        contatos.add(new Contato("Diego", "998999999"));
        contatos.add(new Contato("Vanessa", "997111111"));
        contatos.add(new Contato("Felipe", "997222222"));
        contatos.add(new Contato("Bruna", "997333333"));
        contatos.add(new Contato("Marcelo", "997444444"));
        contatos.add(new Contato("Isabela", "997555555"));
        contatos.add(new Contato("Vinícius", "997666666"));
        contatos.add(new Contato("Patrícia", "997777777"));
        contatos.add(new Contato("André", "997888888"));
        contatos.add(new Contato("Sofia", "997999999"));
        contatos.add(new Contato("Ricardo", "996111111"));
        contatos.add(new Contato("Natália", "996222222"));
        contatos.add(new Contato("Bruno", "996333333"));
        contatos.add(new Contato("Caroline", "996444444"));
        contatos.add(new Contato("Leonardo", "996555555"));
        contatos.add(new Contato("Luana", "996666666"));
        contatos.add(new Contato("Eduardo", "996777777"));
        contatos.add(new Contato("Elaine", "996888888"));
        contatos.add(new Contato("Henrique", "996999999"));
        contatos.add(new Contato("Aline", "995111111"));
        contatos.add(new Contato("Rodrigo", "995222222"));
        contatos.add(new Contato("Paula", "995333333"));
        contatos.add(new Contato("César", "995444444"));
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
