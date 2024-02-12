package com.teste.financeira.srm.servico.pagamento.infra.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teste.financeira.srm.servico.pagamento.domain.services.interfaces.ServicoDePagamento;

import org.springframework.amqp.core.Queue;

@Component
public class PagamentoListener {

    @Autowired
    private Queue queue;

    @Autowired
    private ServicoDePagamento servicoDePagamento;

    @RabbitListener(queues = "#{queue.name}")
    public void receberMensagem(Long emprestimoId) {
        System.out.println(String.format("Empréstimo %s recebido", emprestimoId));

        servicoDePagamento.quitarEmprestimo(emprestimoId);
        
        System.out.println(String.format("Empréstimo %s pago com sucesso", emprestimoId));
    }
}
