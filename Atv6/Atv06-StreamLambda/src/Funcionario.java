public class Funcionario {
    private String nome, departamento;
    private int anosDeServico;
    private double salario;

    public Funcionario(String nome, String departamento, int anosDeServico, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.anosDeServico = anosDeServico;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAnosDeServico() {
        return anosDeServico;
    }

    public void setAnosDeServico(int anosDeServico) {
        this.anosDeServico = anosDeServico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", anosDeServico=" + anosDeServico +
                ", salario=" + salario +
                '}';
    }
}
