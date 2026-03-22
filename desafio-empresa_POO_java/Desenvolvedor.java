public class Desenvolvedor extends Funcionario{
    private double horaExtra;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, double horaExtra, double valorHoraExtra){
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getHoraExtra(){
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra){
        this.horaExtra = horaExtra;
    }

    public double getValorHoraExtra(){
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + (valorHoraExtra * horaExtra);
    }
}