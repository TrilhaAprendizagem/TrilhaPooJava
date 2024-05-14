# trilha-poo-java

# Persistência de Dados com Java (Maven + Hibernate + H2)

## Funcionalidades
Esta aplicação de exemplo demonstra um sistema de gestão escolar simples, com as seguintes funcionalidades:

- Cadastro de Alunos, Professores, Disciplinas, Cursos e Turmas.
- Associação de Disciplinas aos Cursos e Professores.
- Agendamento de Aulas com informações sobre curso, disciplina, professor, sala, horário e dias da semana.
- Persistência dos dados usando Hibernate com banco de dados H2.

## Configurações
Para executar esta aplicação, algumas configurações são necessárias:

- **Caminho do Banco de Dados H2:** Antes de executar a aplicação, é necessário configurar o caminho completo onde o arquivo do banco de dados H2 será salvo. Isso pode ser feito no arquivo `hibernate.cfg.xml` e no arquivo `persistence.xml`:
    ```xml
    <property name="hibernate.connection.url">jdbc:h2:file:C:/caminho/completo/do/seu/banco/de/dados</property>
    ```
    Certifique-se de fornecer o caminho completo adequado para o local desejado.

- **Alteração de Dependências e Configurações:** Caso deseje utilizar outro banco de dados, as dependências e configurações devem ser alteradas de acordo. Por exemplo, para utilizar o MySQL, seria necessário alterar as dependências e as configurações de conexão nos arquivos `hibernate.cfg.xml` e `persistence.xml`.

## Tecnologias Utilizadas
- Java
- Maven
- Hibernate
- H2 Database
- JPA (Java Persistence API)

## Orientação a Objetos da Aplicação
A aplicação segue uma abordagem de orientação a objetos, onde cada entidade no sistema (Aluno, Professor, Disciplina, Curso, Aula, Turma) é representada por uma classe Java correspondente. As relações entre essas entidades são estabelecidas através de associações de objetos, como visto nos relacionamentos entre Curso e Disciplina, Disciplina e Professor, etc.

## Persistência de Dados
A persistência de dados é realizada usando o framework Hibernate, que facilita o mapeamento objeto-relacional. As entidades são mapeadas para tabelas no banco de dados e as operações de persistência são realizadas utilizando a API do Hibernate.

## Executando a Aplicação
Para executar a aplicação, siga estes passos:

1. Certifique-se de ter configurado o caminho do banco de dados H2 conforme mencionado anteriormente.
2. Execute o método `main` na classe `Main`. Isso inicializará a aplicação, gerando as tabelas no banco de dados, caso ainda não existam.

## Alterando o Tipo de Banco de Dados
Para mudar o tipo de banco de dados utilizado na aplicação, siga estes passos:

1. Altere as dependências no arquivo `pom.xml` para as correspondentes ao banco de dados desejado.
2. Modifique as configurações de conexão nos arquivos `hibernate.cfg.xml` e `persistence.xml` para refletir as configurações do novo banco de dados.

Ao seguir esses passos, a aplicação estará configurada para utilizar o novo banco de dados especificado.

# Instruções para Completar a Aplicação Main
Para completar a aplicação Main e adicionar funcionalidades para instanciar e manipular as entidades no banco de dados, siga as etapas abaixo:

## Passo 1: Instanciar Entidades
Dentro do método main da classe Main, inicie uma nova sessão do Hibernate utilizando SessionFactory.

Utilize os construtores apropriados para criar instâncias das entidades Aluno, Professor, Disciplina, Curso, Turma e Aula.

Atribua valores aos atributos dessas entidades de acordo com as informações que deseja armazenar no banco de dados.

## Passo 2: Persistir Entidades no Banco de Dados
Utilize a sessão do Hibernate para persistir as entidades recém-criadas no banco de dados.

Utilize transações para garantir que as operações de persistência sejam realizadas de forma consistente.

## Passo 3: Recuperar e Manipular Entidades do Banco de Dados
Utilize consultas HQL (Hibernate Query Language) ou critérios do Hibernate para recuperar entidades do banco de dados.

Realize operações de atualização, exclusão ou qualquer outra manipulação necessária nas entidades recuperadas.

## Passo 4: Finalizar a Sessão do Hibernate
Após concluir todas as operações de persistência e manipulação, encerre a sessão do Hibernate para liberar recursos.
Observações:
Certifique-se de tratar exceções de forma adequada para lidar com possíveis erros durante as operações de persistência e manipulação das entidades.

Teste sua implementação para garantir que as funcionalidades estejam operando conforme o esperado.

Documente seu código adequadamente, explicando a lógica por trás de cada operação realizada.

Com essas instruções, você estará apto a completar a aplicação Main com as funcionalidades necessárias para instanciar e manipular as entidades no banco de dados. Lembre-se de explorar os recursos do Hibernate e JPA para facilitar o desenvolvimento.

Lembre-se de usar padrões de commit e gitflow para seu projeto. 

Boa sorte e bons estudos!


## Autor
#### Criado pelo estagiário Rafael Rodrigues sob orientação do prof. Cainã Antunes e do coordenador Vinícius Antunes. 
