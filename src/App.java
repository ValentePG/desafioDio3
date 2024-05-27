import Banco.AgenciaBancaria;
import Cliente.Cliente;
import ContaBancaria.ContaBanco;
import ContaBancaria.ContaCorrente.ContaCorrente;
import ContaBancaria.ContaPoupanca.ContaPoupanca;


public class App {
    public static void main(String[] args) {

        AgenciaBancaria agencia1 = new AgenciaBancaria("BancoDio");

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        ContaBanco cc = new ContaCorrente(venilton);
        ContaBanco poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente gustavo = new Cliente();
        gustavo.setNome("Gabriel");
        ContaBanco cc2 = new ContaCorrente(gustavo);
        ContaBanco poupanca2 = new ContaPoupanca(gustavo);




        agencia1.setContas(poupanca, cc);
        agencia1.setContas(poupanca2, cc2);


       agencia1.getContas();

    }
}