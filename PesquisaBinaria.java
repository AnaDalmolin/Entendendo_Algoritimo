
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PesquisaBinaria {


    public void adicionarNumerosAleatorios(List<Double> lista, double quantidade) {
        Random random = new Random();
        for (double i = 0; i < quantidade; i++) {
            lista.add(Double.valueOf(random.nextInt(100) + 1)); // Adiciona um número aleatório entre 1 e 100
        }
    }

    public void imprimirLista(List<Double>  lista) {
        for (Double numero : lista) {
            System.out.println(numero);
        }
    }

    public String pesquisaBinariaFuncao(List<Double> lista, Double item) {
        int baixo = 0;
        int alto = lista.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            Double chute = lista.get(meio);
            if (chute.equals(item)) {
                return "O item foi encontrado na posição " + meio;
            } else if (chute < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return "O item não foi encontrado";
    }


    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();    

        PesquisaBinaria pb = new PesquisaBinaria();
        lista.add(2.0);
        lista.add(22.0);
        lista.add(37.0);
        lista.add(76.0);
        lista.add(99.0);
        pb.imprimirLista(lista);
    }
}