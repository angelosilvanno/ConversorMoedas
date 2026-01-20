# Conversor de Moedas - Challenge Alura 💰

Este projeto é uma aplicação de terminal desenvolvida em Java para realizar a conversão de moedas em tempo real. O desafio faz parte da formação **Backend Java da Alura**, com o objetivo de aplicar conhecimentos sobre consumo de APIs, manipulação de JSON e organização de código.

## 🔥 Introdução

O sistema consome dados da **ExchangeRate-API** para fornecer cotações atualizadas. Ele foi construído com foco em simplicidade para o usuário e robustez no tratamento de erros.

### Principais Funcionalidades:

* **Conversões disponíveis:** Real (BRL), Dólar (USD) e Euro (EUR).
* **Segurança de Dados:** Uso de arquivos de configuração para proteger a chave da API.
* **Tratamento de Exceções:** O programa não interrompe a execução caso o usuário digite valores inválidos ou ocorram falhas de conexão.
* **Interface Limpa:** Menu interativo e resultados formatados com duas casas decimais.

## 🛠️ Tecnologias Usadas

* **Java 24**: Versão mais recente para aproveitar os recursos modernos da linguagem.
* **HttpClient**: Para realizar requisições HTTP de forma nativa.
* **Java Properties**: Utilizado para gerenciar a chave da API com segurança.
* **Git & GitHub**: Para versionamento e documentação.

## ⚙️ Pré-requisitos e Instalação

### 1. Requisitos do Sistema

* Possuir o **Java JDK 17** ou superior instalado (Projeto validado no Java 24).
* Uma chave de acesso da [ExchangeRate-API](https://www.exchangerate-api.com/).

### 2. Configuração da Chave da API

Para que o projeto funcione e sua chave permaneça segura:

1. Na raiz do projeto, crie um arquivo chamado `config.properties`.
2. Dentro dele, adicione sua chave pessoal:
```properties
api.key=sua_chave_aqui

```

*O arquivo `.gitignore` já está configurado para garantir que este arquivo de configuração não seja enviado ao seu repositório público.*

### 3. Execução

1. Clone o repositório:
```bash
git clone https://github.com/angelosilvanno/ConversorMoedas.git

```


2. Importe o projeto em sua IDE de preferência.
3. Execute a classe `app.Main`.

---

## 📦 Estrutura de Pastas

* `app`: Contém a classe `Main` que inicia a aplicação.
* `service`: Contém a lógica de conexão com a API e extração de dados.
* `view`: Responsável pelo menu e interação direta com o usuário.

## 📄 Licença

* Este projeto foi desenvolvido para fins didáticos como parte do currículo da Alura.
