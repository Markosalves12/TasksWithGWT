TaskFlow
Gerenciador de tarefas desenvolvido com Google Web Toolkit (GWT).
Projeto final construído ao longo de um curso em 16 módulos. A aplicação roda no navegador
(código Java traduzido para JavaScript pelo GWT) e é organizada em um projeto Maven
multi-módulo.
---
Funcionalidades
Navegação entre páginas (Dashboard, Tarefas, Detalhes, Sobre) com layout compartilhado
Dashboard com indicadores reativos (total de tarefas, pendentes, concluídas, alta prioridade)
CRUD completo de tarefas: criar, listar, editar e excluir (com modal de confirmação)
Pesquisa e filtros por status e prioridade
Estados visuais com badges (Pendente, Em andamento, Concluída)
Responsividade e acabamento visual
Camadas do código
Camada	Responsabilidade
`Models`	Representação dos dados (`Task`, `Status`, `Priority`)
`Services`	Operações sobre os dados (`TaskService` — fonte única de dados)
`Components`	Peças reutilizáveis (`Badge`, `StatCard`, `EmptyState`, `ConfirmDialog`)
`Layout`	Estrutura compartilhada entre as páginas (`MainLayout`)
`AppRouter`	Decide qual view aparece
`Views`	Dashboard · Lista · Formulário · Detalhes · Sobre
`App.java`	EntryPoint (`onModuleLoad`) — inicializa a aplicação
Estrutura do projeto
```text
mywebapp/
├── pom.xml                       (POM pai — agrega os 3 módulos)
├── mywebapp-client/              (código GWT traduzido para JavaScript)
│   ├── pom.xml
│   └── src/main/
│       ├── module.gwt.xml        (descritor do módulo GWT)
│       └── java/com/mycompany/mywebapp/
│           └── App.java          (EntryPoint — onModuleLoad)
├── mywebapp-server/              (WAR + Jetty + servlets)
│   └── src/main/webapp/
│       ├── index.html
│       └── mywebapp.css
└── mywebapp-shared/              (classes usadas pelos dois lados)
    └── src/main/java/com/mycompany/mywebapp/
        ├── GreetingService.java
        └── FieldVerifier.java
```
Pré-requisitos
JDK (11 ou superior)
Maven (3.8 ou superior)
Um navegador atualizado
Como executar (modo dev)
O modo de desenvolvimento usa dois terminais abertos ao mesmo tempo:
o CodeServer do GWT traduz o Java e o Jetty serve a aplicação.
Terminal 1 — CodeServer (deixe aberto):
```bash
mvn gwt:codeserver -pl mywebapp-client -am
```
Terminal 2 — servidor Jetty:
```bash
mvn jetty:run -pl mywebapp-server -am -Denv=dev
```
Abra http://localhost:8080 e recarregue com Ctrl+Shift+R.
> Se a tela ainda mostrar o texto padrão do `index.html`, confira se o arquivo
> `mywebapp-server/src/main/webapp/index.html` aponta para o módulo GWT
> (`<div id="app"></div>` + script do nocache) e veja os erros no Terminal 1.
Como empacotar (produção)
```bash
mvn clean package
```
O WAR gerado em `mywebapp-server/target/` pode ser publicado em qualquer
container compatível (Jetty, Tomcat etc.).
Critérios de sucesso
O projeto está concluído quando todos os itens abaixo forem verdade:
[ ] Navegação funcional entre as páginas
[ ] Todas as páginas compartilham o mesmo layout
[ ] Os botões executam ações
[ ] Os formulários funcionam
[ ] Os dados podem ser criados
[ ] Os dados podem ser editados
[ ] Os dados podem ser excluídos
[ ] Os filtros funcionam
[ ] Os modais funcionam
[ ] O Dashboard reflete o estado atual das tarefas
[ ] O projeto pode ser executado
[ ] Cada arquivo tem uma responsabilidade clara
Trilha do curso (16 módulos)
Projeto base — rodar o projeto e limpar o `App.java`
Estrutura — organização em camadas
Layout — `MainLayout` compartilhado
Navegação — roteamento entre as páginas
Dashboard — indicadores
Modelo de dados — `Task`, `Status`, `Priority`
Serviço em memória — `TaskService`
Componentes — `Badge`, `StatCard`, `EmptyState`
Formulários — criar e editar tarefas
Eventos — cliques e interações
Tabela — listagem de tarefas
Pesquisa e filtros
Modais — confirmação de exclusão
Estado — atualização reativa
CRUD completo
Responsividade e acabamento
Possíveis evoluções
Apenas continuação — nada disso é implementado neste projeto:
GWT + Backend Java — reaproveitar o módulo `mywebapp-server` com GWT-RPC
GWT + API REST — trocar o serviço em memória por chamadas HTTP
Banco de dados — persistir as tarefas de verdade
Autenticação — sessões e tarefas por usuário
Deploy — publicar o WAR gerado pelo Maven
---
Construído com Java, GWT e Maven.
