package Banco;

import ContaBancaria.ContaBanco;
import ContaBancaria.IConta;

import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private String nome;
    private final List<ContaBanco> contas = new ArrayList<>();

    public AgenciaBancaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getContas() {
        contas.forEach(IConta::imprimirExtrato);
    }

    public void setContas(ContaBanco corrente, ContaBanco poupanca) {
        contas.add(corrente);
        contas.add(poupanca);
    }
}
