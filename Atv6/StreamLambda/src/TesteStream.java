import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TesteStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.stream().map( n -> n*2)
                .forEach(System.out::println);
        numeros.forEach(System.out::println);
        List<String>frutas = Arrays.asList("uva","banana","abacaxi","morango","maca");
        List<String> filtradas = frutas.stream()
                .filter(f ->f.length()>5)
                .toList();
        filtradas.forEach(System.out::println);
        int somaDobroPares = numeros.stream()
                .filter(n-> n%2==0)
                .map(n->n*2)
                .reduce(0,Integer::sum);
        System.out.println("resultado: "+somaDobroPares);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ronaldo", 18));
        pessoas.add(new Pessoa("Pedro", 21));
        pessoas.add(new Pessoa("Jennifer", 89));
        pessoas.add(new Pessoa("Edson", 123));
        pessoas.add(new Pessoa("Milena", 999999999));

        List<Pessoa> deMaior = pessoas.stream().filter(p -> p.getIdade()>17).toList();
        deMaior.forEach(System.out::println);

        pessoas.stream().filter(p -> p.getNome().startsWith("A")).forEach(System.out::println);
    }
}
