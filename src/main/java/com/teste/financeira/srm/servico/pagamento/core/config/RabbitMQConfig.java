package com.teste.financeira.srm.servico.pagamento.core.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${fila.nome}")
    protected String nomeFila;

    @Bean
    public Queue queue() {
        return new Queue(nomeFila, true);
    }
}
