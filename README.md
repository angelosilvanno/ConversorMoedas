# Conversor de Moedas - Challenge Alura

Este projeto é uma aplicação de terminal em Java que realiza a conversão de moedas em tempo real, utilizando a **ExchangeRate-API**. O objetivo principal é praticar requisições HTTP, manipulação de dados JSON e boas práticas de organização de código e segurança.

## 🔥 Introdução

O sistema oferece um menu interativo onde o usuário pode escolher entre diferentes pares de moedas para conversão.

### Funcionalidades:

* Conversão entre **Real (BRL)**, **Dólar (USD)** e **Euro (EUR)**.
* Tratamento de entradas do usuário para evitar erros de digitação (letras ou símbolos).
* Formatação de resultados para duas casas decimais.
* **Segurança**: A chave da API é carregada de um arquivo externo protegido, não ficando exposta no código-fonte.

---

### ⚙️ Pré-requisitos

Para rodar este projeto na sua máquina, siga estes passos:

1. **Java JDK**: Certifique-se de ter o Java instalado (versão 17 ou superior).
2. **Chave da API**: Crie uma conta gratuita em [exchangerate-api.com](https://www.exchangerate-api.com/) para obter sua chave pessoal.
3. **Configuração de Segurança**:
* Na pasta raiz do projeto, crie um arquivo chamado `config.properties`.
* Dentro dele, adicione sua chave seguindo este formato: `api.key=SUA_CHAVE_AQUI`.
* *Nota: O arquivo `.gitignore` já está configurado para não enviar sua chave ao GitHub.*



### 📦 Tecnologias usadas:

* **Java 17+**: Linguagem base do projeto.
* **HttpClient**: Para realizar as chamadas à API de câmbio.
* **Java Properties**: Para gerenciar as configurações e proteger dados sensíveis.
* **Git**: Para versionamento e controle de código.

---

### Como instalar e rodar:

```bash
# Clone o repositório
git clone https://github.com/angelosilvanno/ConversorMoedas.git

# Entre na pasta
cd ConversorMoedas

# Crie o arquivo config.properties e adicione sua chave conforme instruído acima.

# Execute a classe Main através da sua IDE ou terminal.

```

