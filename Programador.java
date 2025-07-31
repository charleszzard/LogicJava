public class Programador implements Funcionario{

    private double salarioBase;
    private int horasExtras;

    public Programador(double salarioBase, int horasExtras) {
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 50);
    }

    @Override
    public String getCargo() {
        return "Programador";
    }

}
