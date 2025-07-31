public class Gerente implements Funcionario{
    private double salarioBase;
    private double bonus;


    public Gerente(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public double calcularSalario(){
        return salarioBase + bonus;
    }

    public String getCargo(){
        return "Gerente";

    }

}
