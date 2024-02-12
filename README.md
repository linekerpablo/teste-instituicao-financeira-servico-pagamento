# Serviço de Processamento de Empréstimos

## Sobre o Serviço

Este serviço é responsável por processar solicitações de empréstimos recebidas através de uma fila de mensagens. Ele escuta as mensagens na fila, realiza o processamento necessário e atualiza o status do empréstimo na base de dados.

## Arquitetura do Serviço

O serviço utiliza uma arquitetura orientada a eventos, onde cada solicitação de empréstimo é colocada em uma fila de mensagens (RabbitMQ, por exemplo) e processada de forma assíncrona. Isso permite um processamento eficiente e escalável das solicitações de empréstimo.

## Tecnologias Utilizadas

- **RabbitMQ**: Sistema de mensageria utilizado para a fila de processamento de empréstimos.
- **Spring Boot**: Framework utilizado para criar a aplicação.
- **Spring Cloud Stream**: Utilizado para integrar facilmente com sistemas de mensagens como RabbitMQ.

## Configuração e Execução

### Pré-Requisitos

- RabbitMQ instalado e em execução.
- Java JDK 8 ou superior.
- Maven ou Gradle (dependendo do seu projeto).

### Configuração do RabbitMQ

Certifique-se de que o RabbitMQ está configurado corretamente e em execução. As configurações padrão normalmente são suficientes para desenvolvimento local.

### Executando o Serviço

1. Clone o repositório do serviço:
git clone https://github.com/linekerpablo/teste-instituicao-financeira-servico-pagamento.git

2. Entre no diretório do serviço:
cd teste-instituicao-financeira-servico-pagamento

3. Execute o serviço usando Maven:
./mvnw spring-boot:run

## Processamento de Empréstimos

Quando uma solicitação de empréstimo é recebida na fila, o serviço executa as seguintes etapas:

1. Recebe a mensagem da fila.
2. Deserializa a mensagem para extrair os detalhes do empréstimo.
3. Realiza o processamento necessário (verificação de crédito, etc.).
4. Atualiza o status do empréstimo na base de dados via api.