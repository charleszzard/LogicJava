import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Programador(3000.0, 10));
        funcionarios.add( new Gerente(5000.0, 1200.0));
        funcionarios.add( new Estagiario(1500.0));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getCargo() + " - Salário: R$ " + f.calcularSalario());
        }
    }
}
