import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ronaldo", "policial", 3, 1000));
        funcionarios.add(new Funcionario("Pedro", "militar", 15, 200000));
        funcionarios.add(new Funcionario("Eddy", "beta", 1, 2));
        funcionarios.add(new Funcionario("Beta", "beta", 5, 0));
        funcionarios.add(new Funcionario("Samara", "panico", 6, 1.99));

        //ex 01:
        funcionarios.stream().filter(f -> f.getSalario() > 900).forEach(System.out::println);
        System.out.println("=============================");
        //ex02:
        funcionarios.stream().filter(f ->f.getAnosDeServico()>=10).map(f->{f.setSalario(f.getSalario()*1.05); return f;}).forEach(System.out::println);
        System.out.println("=============================");
        //ex03:
        funcionarios.stream().sorted((f1,f2)->f1.getNome().compareTo(f2.getNome())).forEach(System.out::println);
        System.out.println("=============================");
        funcionarios.stream().map(f->f.getSalario()).reduce(0.0,Double::sum);
        System.out.println("=============================");
        Map<String, Double> mediaPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(
                                Funcionario::getDepartamento,
                                Collectors.averagingDouble(Funcionario::getSalario)
                        ));
        mediaPorDepartamento.forEach((departamento, media) ->
                System.out.println(departamento + ": " + media)
        );





    }
}
