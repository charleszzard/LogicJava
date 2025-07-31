public class Estagiario implements Funcionario {
    private double bolsa;

    public Estagiario(double bolsa) {
        this.bolsa = bolsa;
    }

    
    public double calcularSalario(){
        return bolsa;
    }

    public String getCargo(){
        return "Estagiário";
    }
}
