public class App {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 2000);
        funcionario1.calcularSalario();

        Gerente gerente1 = new Gerente("Maria", 4000, 1500);
        gerente1.calcularSalario();

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Carlos", 3000, 10, 50);
        desenvolvedor1.calcularSalario();
        
        System.out.println("Funcionario: " + funcionario1.getNome());
        System.out.println("Salário Final: " + funcionario1.calcularSalario());
        System.out.println();

        System.out.println("Funcionario: " + gerente1.getNome());
        System.out.println("Salário Final: " + gerente1.calcularSalario());
        System.out.println();

        System.out.println("Funcionario: " + desenvolvedor1.getNome());
        System.out.println("Salário Final: " + desenvolvedor1.calcularSalario());
        
    }
}