package service;

import lombok.RequiredArgsConstructor;
import model.Conta;

@RequiredArgsConstructor
public class OperacaoService extends Conta{

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {

        saldo += valor;
    }

    public void transferir(double valor, OperacaoService contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInformacoesComuns() {
        System.out.println(String.format("Titular : %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
