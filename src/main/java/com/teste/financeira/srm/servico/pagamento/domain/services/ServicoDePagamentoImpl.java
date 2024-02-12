package com.teste.financeira.srm.servico.pagamento.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.financeira.srm.servico.pagamento.domain.services.interfaces.ServicoDePagamento;
import com.teste.financeira.srm.servico.pagamento.infra.clients.ApiEmprestimoClient;

@Service
public class ServicoDePagamentoImpl implements ServicoDePagamento {

    private final ApiEmprestimoClient apiEmprestimoClient;

    @Autowired
    public ServicoDePagamentoImpl(ApiEmprestimoClient apiEmprestimoClient) {
        this.apiEmprestimoClient = apiEmprestimoClient;
    }

    public void quitarEmprestimo(Long emprestimoId) {
        try {
            apiEmprestimoClient.quitarEmprestimo(emprestimoId);   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
