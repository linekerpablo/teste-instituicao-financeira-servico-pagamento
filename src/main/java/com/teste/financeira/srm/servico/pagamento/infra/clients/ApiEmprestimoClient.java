package com.teste.financeira.srm.servico.pagamento.infra.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "apiPagamento", url = "${api.emprestimo.url}")
public interface ApiEmprestimoClient {

    @PostMapping("/v1/emprestimos/{emprestimoId}/quitar")
    void quitarEmprestimo(@PathVariable Long emprestimoId);
}