<h1 align="center">Java Web com Servlets e JSPs - Filters</h1>

<p align="center"><strong>A ideia dos filtros é simplesmente executar alguma tarefa que desejamos repetir antes ou depois de um grupo de requisições
que nossa aplicação recebe. Tudo que estiver antes do chain.doFilter(request, response) será executado quando recebemos a requisição e tudo que estiver depois do chain.doFilter(request, response) será executado após a execução das servles
e dos JSPs, ou seja, quando a resposta estiver saindo de nossa aplicação e voltando para o usuário. Caso não executemos o chain.doFilter(request, response)
isso implica em bloquearmos a requisição e ela retornará imediatamente para o usuário! Ou seja, fazendo chain.doFilter(request, response) vc está informando
ao seu filtro que ele pode deixar a requisição seguir o caminho dela. Depois disso, a requisição pode ir para um outro filtro ou ir direto para a servlet que
irá processar ela com a sua lógica de negócio. </strong></p>  

<h3 align="center"> Com os filtros podemos fazer: </h3>

- Medir o tempo de execução de uma servlet, uma vez que os filtros são executados ao receber uma requisição (antes do chain.doFilter(request, response)) e depois que a resposta já está pronta (após o chain.doFilter(request, response)).
- Autorização de acesso, verificando se o usuário tem permissão para acessar o recurso pelo qual ele está requisitando.
- Verificar se a requisição está sendo feita por um usuário autenticado.
- Log do sistema.

<h4 align="center">Conceito do projeto</h4>

<p align="center">Foi desenvolvido uma aplicação web que tem a funcionalidade de validar um usuário atraves de uma tela de login utilizando "filter"</p>
