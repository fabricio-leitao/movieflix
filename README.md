# MovieFlix
## Projeto do Bootcamp DevSuperior

### Visão geral do sistema
O sistema MovieFlix consiste em um banco de filmes, os quais podem ser listados e avaliados pelos usuários. Usuários podem ser visitantes (VISITOR) e membros (MEMBER). Apenas usuários membros podem inserir avaliações no sistema.

Ao acessar o sistema, o usuário deve fazer seu login. Apenas usuários logados podem navegar nos filmes. Logo após fazer o login, o usuário vai para a listagem de filmes, que mostra os filmes de forma paginada, ordenados alfabeticamente por título. O usuário pode filtrar os filmes por gênero.

Ao selecionar um filme da listagem, é mostrada uma página de detalhes, onde é possível ver todas informações do filme, e também suas avaliações. Se o usuário for usuário membro, ele pode ainda registrar uma avaliação nessa tela.

Um usuário possui nome, email e senha, sendo que o email é seu nome de usuário. Cada filme possui um título, subtítulo, uma imagem, ano de lançamento, sinopse, e um gênero. Os usuários membros podem registrar avaliações para os filmes. Um mesmo usuário membro pode deixar mais de uma avaliação para o mesmo filme.


## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
Git, Spring Tools Suite.

## Como clonar o Projeto

Vá até seu workspace escolhido do STS e abra uma janela do git, 
na linha de comando digite:

git clone https://github.com/fabricio-leitao/movieflix.git

## Spring Tool Suite

Depois de importar seu projeto para o STS rode-o

## No seu navegador

Digite a rota: 

http://localhost:8080/swagger-ui.html#/

Lá estará todos caminhos possíveis e como visualizar, inserir, atualizar e excluir os dados.

