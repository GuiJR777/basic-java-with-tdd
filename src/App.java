import main.java.CPF;

public class App {
    public static void main(String[] args) throws Exception {
        CPF cpf = new CPF("12345678910");

        System.out.println(cpf.isValid());
    }
}
