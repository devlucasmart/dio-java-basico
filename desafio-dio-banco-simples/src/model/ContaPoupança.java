package model;

import lombok.RequiredArgsConstructor;
import service.OperacaoService;

@RequiredArgsConstructor
public class ContaPoupança extends Conta {

    private final OperacaoService operacao;
    public void imprimirExtrato() {
        System.out.println("===Extrato model.Conta Poupança=== ");
        operacao.imprimirInformacoesComuns();
    }
}
