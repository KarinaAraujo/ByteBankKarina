public class ContaTeste
{
    public static void main(final String[] args) {
        final Conta conta = new Conta(1000.0);
        conta.saca(500.0);
        System.out.println("Saldo: " + conta.getSaldo());
        conta.setAgencia(222);
        System.out.println("Agencia: " + conta.getAgencia());
        conta.setNumero(2424);
        System.out.println("Numero: " + conta.getNumero());
        conta.setTitular("Renato");
        System.out.println("Nome: " + conta.getTitular());
        System.out.println("Conta: " + conta);

    }
}