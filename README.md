🖥️ Workshop App Desktop JavaFX + JDBC

Este projeto consiste no desenvolvimento de uma aplicação desktop utilizando JavaFX integrado com JDBC para acesso a banco de dados, construído como parte do curso Java COMPLETO - Programação Orientada a Objetos + Projetos, ministrado pelo professor Nélio Alves na Udemy.

O sistema simula um gerenciamento de departamentos e vendedores, com interface gráfica moderna e integração com banco de dados relacional.

🚀 Funcionalidades
Cadastro, edição e exclusão de Departamentos
Cadastro, edição e exclusão de Vendedores (Sellers)
Interface gráfica com JavaFX (FXML + CSS)
Integração com banco de dados via JDBC
Atualização dinâmica de telas
Tratamento de exceções personalizadas
Validação de dados em formulários

🧠 Conceitos Aplicados

Este projeto foi desenvolvido com foco em:

Programação Orientada a Objetos (POO)
Arquitetura em camadas (GUI, Services, DAO)
Padrão DAO (Data Access Object)
JavaFX (FXML, Scene Builder, Controllers)
JDBC para acesso a banco de dados
Injeção manual de dependências
Observadores (Listeners)
Tratamento de exceções

📂 Estrutura do Projeto
src/
├── application
│   ├── Main.java
│   └── application.css
│
├── db
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
├── gui
│   ├── DepartmentFormController.java
│   ├── DepartmentListController.java
│   ├── MainViewController.java
│   ├── SellerFormController.java
│   ├── SellerListController.java
│   ├── *.fxml
│
├── gui.listeners
│   └── DataChangeListener.java
│
├── gui.util
│   ├── Alerts.java
│   ├── Constraints.java
│   └── Utils.java
│
├── model.dao
│   ├── DaoFactory.java
│   ├── DepartmentDao.java
│   └── SellerDao.java
│
├── model.dao.impl
│   ├── DepartmentDaoJDBC.java
│   └── SellerDaoJDBC.java
│
├── model.entities
│   ├── Department.java
│   └── Seller.java
│
├── model.exceptions
│   └── ValidationException.java
│
└── model.services
    ├── DepartmentService.java
    └── SellerService.java

▶️ Como Executar

✅ Pré-requisitos
Java 17+
JavaFX SDK configurado
MySQL instalado
Driver JDBC (MySQL Connector)

⚙️ Configuração do Banco
Crie um banco de dados no MySQL
Configure o arquivo:
dburl=jdbc:mysql://localhost:3306/seu_banco
user=seu_usuario
password=sua_senha

▶️ Execução
Clone o repositório:
git clone https://github.com/seu-usuario/Workshop_Udemy_App_Desktop_JavaFX_JDBC.git
Abra na sua IDE (Eclipse recomendado)
Configure o JavaFX VM Options:
--module-path CAMINHO_PARA_FX/lib --add-modules javafx.controls,javafx.fxml
Execute a classe:
application.Main

🛠️ Tecnologias Utilizadas
Java
JavaFX
JDBC
MySQL
Scene Builder

🖼️ Interface
Telas construídas com FXML
Estilização com CSS
Navegação entre telas
Formulários interativos

📚 Créditos

Projeto desenvolvido com base no curso do professor Nélio Alves, disponível na Udemy.

📈 Objetivo Pessoal

Este projeto representa um avanço na minha jornada como desenvolvedor Java, consolidando conhecimentos em aplicações desktop, integração com banco de dados e construção de interfaces gráficas profissionais.
