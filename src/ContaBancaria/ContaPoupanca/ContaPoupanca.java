package ContaBancaria.ContaPoupanca;

import ContaBancaria.ContaBanco;
import Cliente.Cliente;

public class ContaPoupanca extends ContaBanco {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}