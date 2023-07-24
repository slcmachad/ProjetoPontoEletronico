🔨 Em construção 🔨


# Aplicação de Ponto Eletrônico

## Descrição do Projeto

Este é um projeto de uma aplicação de ponto eletrônico desenvolvido em Spring Boot, que permite aos funcionários de um pequeno comércio registrar seus horários de entrada e saída. O sistema também oferece funcionalidades para o administrador gerenciar os funcionários, editar registros de ponto e calcular os valores totais das horas trabalhadas.

## Requisitos Funcionais

- Autenticação de usuários: A aplicação terá dois tipos de login, um para administradores e outro para funcionários.
- Registro de ponto: Os funcionários poderão inserir os horários de entrada e saída, bem como a data correspondente, permitindo registrar a jornada de trabalho diária.
- Gerenciamento de horários: O administrador poderá visualizar, editar e excluir os registros de ponto dos funcionários para corrigir dados incorretos ou adicionar informações ausentes.
- Gerenciamento de funcionários: O administrador poderá adicionar novos funcionários, atualizar informações dos funcionários existentes e também remover funcionários quando necessário.
- Registro e controle de pagamento: A aplicação permitirá ao administrador inserir o valor correspondente à hora de trabalho dos funcionários e registrar os valores pagos a cada um. Isso possibilitará calcular o lucro com base nas horas trabalhadas e os valores pagos.

## Requisitos Não Funcionais

- Segurança: Implementar mecanismos de autenticação segura para proteger os dados sensíveis e garantir que apenas usuários autorizados possam acessar informações confidenciais.
- Usabilidade: Desenvolver uma interface de usuário intuitiva e de fácil utilização, tornando o registro de ponto e o gerenciamento de funcionários simples e acessível.
- Performance: Garantir que a aplicação seja responsiva e eficiente, mesmo com um número crescente de funcionários e registros de ponto.
- Escalabilidade: Projetar a aplicação para lidar com um aumento futuro no número de usuários e funcionários sem comprometer o desempenho.

## Arquitetura e Tecnologias Utilizadas

- Arquitetura: MVC (Model-View-Controller)
- Linguagem de Programação e Framework: Java e Spring Boot
- Banco de Dados: PostgreSQL

## Instruções de Desenvolvimento

1. Clone este repositório para a sua máquina local.
2. Importe o projeto no IntelliJ IDEA ou outra IDE de sua preferência como um projeto Maven.
3. Configure corretamente o banco de dados PostgreSQL no arquivo de configuração do projeto (application.properties ou application.yml).
4. Siga os passos de desenvolvimento descritos no arquivo README.md.
