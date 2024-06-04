# TecBack (Sistema de gestão de filmes e séries) 
Este é o repositório do projeto da disciplina BackEnd. Neste projeto, desenvolvemos uma API para um sistema de gestão de filmes e séries.
## Integrantes do Grupo

- Luís Henrique Marrocos Pinheiro (luishmpuniesp@gmail.com)
- Thiago Felinto da Costa Cardoso (thiagofelintocd@gmail.com)

## Como Rodar a API no IntelliJ

Este guia fornece instruções passo a passo sobre como clonar este repositório do GitHub e configurá-lo para rodar a API no IntelliJ IDEA.

#### Clonando o Repositório do GitHub

1. Clone o repositório do GitHub para o seu ambiente local:
    ```
    git clone <URL_do_repositório>
    ```

2. Abra o IntelliJ IDEA.

3. Vá para `File` -> `New` -> `Project from Version Control` -> `Git`.

4. Cole o URL do repositório clonado.

5. Escolha o diretório local onde deseja clonar o repositório.

6. Clique em "Clone" para iniciar o processo de clonagem.

#### Importando o Projeto no IntelliJ

1. Após a conclusão da clonagem, o IntelliJ abrirá o projeto automaticamente.

2. Se isso não acontecer, você pode abrir o projeto manualmente selecionando a pasta do projeto clonado.

#### Configurando a API

1. Dentro do IntelliJ, navegue até o código-fonte da API que deseja executar.

2. Verifique se todas as dependências necessárias estão presentes no arquivo de configuração.

3. Se necessário, instale as dependências executando a resolução de dependências do Maven.

4. Certifique-se de que a configuração de execução esteja correta. Geralmente, você precisa configurar um ponto de entrada para sua aplicação, como uma classe principal ou um arquivo de configuração.

#### Executando a API

1. Após configurar o projeto corretamente, você pode executar a API dentro do IntelliJ.

2. Encontre a opção de execução (geralmente um botão de reprodução) e clique nele para iniciar a API.

3. O IntelliJ mostrará o output do console, onde você poderá ver qualquer mensagem de log ou erro produzido pela aplicação.

Com esses passos, você deve ser capaz de clonar um repositório do GitHub e rodar uma API no IntelliJ sem problemas. Certifique-se de revisar a documentação do projeto para quaisquer instruções específicas de configuração ou execução.

## Descrição do Projeto 

O projeto consiste em uma aplicação em Java (SpringBoot) onde seguimos determinados requisitos para conclusão do projeto, são eles: 

**OBS**: Para fazer essas requisições nós rodamos a API localmente e utilizamos o POSTMAN (*Uma empresa global de software que oferece uma plataforma de API para desenvolvedores projetarem, construírem, testarem e colaborarem em APIs.*) para fazer as chamadas HTTP. 

### RF1 - Requisito Funcional 01

Aqui criamos uma classe Usuario (com seus respectivos campos necessários), UsuarioRepository (Para interação de dados com o banco de dados), UsuarioService (Para a lógica de negócio) e UsuarioController (Para as requisições HTTP). Com isso criamos os endpoints para: 

- Cadastro de Usuário (POST) `/usuarios`
- Listagem de Usuários (GET) `/usuarios`
- Busca de Usuário por ID (GET) `/usuarios/{id}`
- Atualização de Usuário por ID (PUT) `/usuarios/{id}`
- Remoção de usuário por ID (DELETE) `/usuarios/{id}`

Uma vez com a API rodando basta colocar `localhost:8080/` e a requisição que deseja fazer.

### RF3 - Requisito Funcional 03

No requisito funcional três, fizemos praticamente a mesma coisa que fizemos no RF1 e adicionamos ao CartãoController esses endpoints: 

- Criar Cartão (POST) `/cartao`
- Atualizar Cartão (PUT) `/cartao`
- Listar Todos os Cartões (GET) `/cartao`
- Buscar Cartão por ID (GET) `/cartao/{id}`
- Excluir Cartão por ID (DELETE) `/cartao/{id}`

Novamente, uma vez com a API rodando basta colocar `localhost:8080/` e a requisição que deseja fazer.

### RF4 - Requisito Funcional 04

Aqui precisamos dar foco maior à série, criando a estrutura necessária (Serie, SerieRepository, SerieService e ServiceController) para a exibição de informações detalhadas, e apenas adicionar certas funcionalidades ao FilmeController, uma vez que ele já estava com alguns códigos prontos. 

Então para cumprir com o RF4, adicionamos ao SerieController essas funcionalidades:

- Salvar uma nova série (POST) `/serie`
- Listar todas as séries (GET) `/serie`
- Atualizar uma série existente com base no ID (PUT) `/serie/{id}`
- Buscar uma série pelo ID (GET) `/serie/{id}`
- Excluir uma série pelo ID (DELETE) `/serie/{id}^`

E para o FilmeController, adicionamos apenas oque estava faltando, afinal o código já tinha outros enpoints feitos em sala de aula com o professor.  

- Listar todos os filmes (GET) `/filme`
- Atualizar filme por id (PUT) `/filme/{id}`

### RF5 - Requisito Funcional 05 

Nesse requisito tivemos que criar uma classe Favoritos e fazer relação com Usuario, Filme e Serie. Além disso, fazer com que a requisição criasse uma nova coluna no banco de dados ("usuario_id", "filme_id" e "serie_id"). Com isso, agora é possivel que o usuário adicione seus filmes e/ou séries à uma lista de favoritos. 

- Adicionar filme aos favoritos de um usuário (POST) `/favoritos/usuario/{usuarioId}/filme/{filmeId}`
- Adicionar série aos favoritos de um usuário (POST) `/favoritos/usuario/{usuarioId}/serie/{serieId}`
- Listar todos os favoritos de um usuário (GET) `/favoritos/usuario/{usuarioId}`
- Deletar favorito por id (DELETE) `/favoritos/{favoritoId}`

### RF6 - Requisito Funcional 06 

Apenas tivemos que adicionar mais duas funcionalidades ao FavoritosController: 

- Listar filmes favoritos de um usuário (GET) `/favoritos/usuario/{usuarioId}/filmes`
- Listar séries favoritas de um usuário (GET) `/favoritos/usuario/{usuarioId}/series`

### RF7 - Requisito Funcional 07 

Adicionamos uma lista ordenada de usuários, para isso criamos a funcionalidade no service com ajuda do `findAllByOrder`, e depois adicionamos o enpoint necessário no UsuarioController: 

- Listar usuários ordenados por nome (GET) `/usuarios/ordenados`

## Tecnologias Utilizadas

- Backend: Spring Boot
- Banco de Dados: H2
- Controle de Versão: Git e GitHub
- Hospedagem: MINHA MÁQUINA
- Plataforma de testes: POSTMAN
