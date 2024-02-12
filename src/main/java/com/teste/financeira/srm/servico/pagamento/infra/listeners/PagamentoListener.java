package com.teste.financeira.srm.servico.pagamento.infra.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;

@Component
public class PagamentoListener {

    @Autowired
    private Queue queue;

    @RabbitListener(queues = "#{queue.name}")
    public void receberMensagem(Long emprestimoId) {
        // Aqui você processa a mensagem recebida
        System.out.println("Empréstimo recebido: " + emprestimoId);

        // Processar o pagamento com base na mensagem recebida
    }
}
