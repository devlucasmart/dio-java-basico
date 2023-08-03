package model;

import lombok.RequiredArgsConstructor;
import service.OperacaoService;
@RequiredArgsConstructor
public class ContaCorrente extends Conta {

    private final OperacaoService operacao;
    public void imprimirExtrato() {
        System.out.println("===Extrato model.Conta Corrente=== ");
        operacao.imprimirInformacoesComuns();
    }
}
