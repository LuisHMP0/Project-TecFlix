# TecBack (Sistema de gestão de filmes e séries) 
Este é o repositório do projeto da disciplina BackEnd. Neste projeto, desenvolvemos uma API para um sistema de gestão de filmes e séries.
## Integrantes do Grupo

- Luís Henrique Marrocos Pinheiro (luishmpuniesp@gmail.com)
- Thiago Felinto da Costa Cardoso (thiagofelintocd@gmail.com)

## Descrição do Projeto | Como utilizar

O projeto consiste em uma aplicação em Java (SpringBoot) onde seguimos determinados requisitos para conclusão do projeto, são eles: 

**OBS**: Para fazer essas requisições nós primeiramente rodamos a API localmente e utilizamos o POSTMAN (*Uma empresa global de software que oferece uma plataforma de API para desenvolvedores projetarem, construírem, testarem e colaborarem em APIs.*) 

### RF1

Aqui criamos uma classe UsuarioModel (com seus respectivos campos necessários), UsuarioRepository (Para interação de dados com o banco de dados), UsuarioService (Para a lógica de negócio) e UsuarioController (Para as requisições HTTP). Com isso criamos os endpoints para: 

- Cadastro de Usuário (POST) `/usuarios`
- Listagem de Usuários (GET) `/usuarios`
- Busca de Usuário por ID (GET) `/usuarios/{id}`
- Atualização de Usuário por ID (PUT) `/usuarios/{id}`
- Remoção de usuário por ID (DELETE) `/usuarios/{id}`

Uma vez com a API rodando basta colocar `localhost:8080/` e a requisição que deseja fazer.

### RF3

No requisito funcional três, fizemos praticamente a mesma coisa que fizemos no RF1 e adicionamos ao CartãoController esses endpoints: 

- Criar Cartão (POST) `/cartao`
- Atualizar Cartão (PUT) `/cartao`
- Listar Todos os Cartões (GET) `/cartao`
- Buscar Cartão por ID (GET) `/cartao/{id}`
- Excluir Cartão por ID (DELETE) `/cartao/{id}`

Novamente, uma vez com a API rodando basta colocar `localhost:8080/` e a requisição que deseja fazer.

## Tecnologias Utilizadas

- Backend: Spring Boot
- Banco de Dados: H2
- Controle de Versão: Git e GitHub
- Hospedagem: MINHA MÁQUINA
