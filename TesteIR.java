public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double imposto;

        if (salario < 1900.0) {
            imposto = 0.0;
        } else if (salario <= 2800.0) {
            imposto = salario * 0.075 - 142.0;
        } else if (salario <= 3751.0) {
            imposto = salario * 0.15 - 350.0;
        } else if (salario <= 4664.0) {
            imposto = salario * 0.225 - 636.0;
        } else {
            imposto = salario * 0.275 - 869.36;
        }

        System.out.println("O IR é " + imposto);

    }
}
