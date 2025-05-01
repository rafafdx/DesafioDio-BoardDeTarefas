# Board de Tarefas

Este repositório contém a implementação de um sistema de gerenciamento de tarefas em Java, desenvolvido como parte de um projeto prático orientado à objetos. O sistema permite o cadastro, listagem e alteração do status de tarefas.

## 📌 Descrição do Projeto

O sistema simula um quadro de tarefas com funcionalidades básicas:

- Cadastrar novas tarefas com título, descrição e data de conclusão.
- Listar todas as tarefas registradas.
- Atualizar o status de uma tarefa (pendente, em andamento, concluída).
- Excluir tarefas do board.

### Exemplo de Funcionamento:

#### Cadastro de uma tarefa:

```
Título: Estudar Java
Descrição: Praticar os conceitos de POO
Data de conclusão: 05/05/2025
```

#### Saída esperada:

```
Tarefa cadastrada com sucesso!
```
#### Saída esperada:

```
1. Estudar Java - Em andamento - 05/05/2025
2. Criar API REST - Pendente - 10/05/2025
```

## 🛠 Tecnologias Utilizadas

- Java 17+
- Programação Orientada a Objetos (POO)
- Collections para manipulação de listas
- Scanner para entrada de dados (modo console)

## 🚀 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/rafafdx/board-de-tarefas.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd board-de-tarefas
   ```
3. Compile o projeto:
   ```bash
   javac *.java
   ```
4. Execute o programa principal:
   ```bash
   java Main
   ```
5. Siga as instruções exibidas no console para interagir com o board de tarefas.

## 📂 Estrutura do Projeto

```
/board-de-tarefas
│── Main.java  # Classe principal que inicia o programa
│── Tarefa.java  # Classe que representa uma tarefa
│── TarefaService.java  # Regras de negócio para manipular tarefas
│── TarefaRepository.java  # Armazena e gerencia a lista de tarefas
│── Status.java  # Enum com os possíveis status de uma tarefa
│── README.md  # Documentação do projeto
```

## 🛠 Melhorias Futuras

- Persistência de dados em arquivos ou banco de dados.
- Interface gráfica com JavaFX ou Web.
- Filtro de tarefas por status.
- Testes automatizados com JUnit.

## 📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo.

---

Feito com 💻 por rafafdx 🚀



