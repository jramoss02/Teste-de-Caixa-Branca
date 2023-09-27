# Teste caixa branca (ETAPA 1)

## 🛠️ Erros que podem conter no código


* O código está atualmente concatenando diretamente os valores de login e senha nas consultas SQL. Isso torna o código vulnerável a ataques de injeção SQL.

`<sql += "where login = " + "'" + login + "'";>`
* O código atualmente captura exceções, mas não faz nada com elas. Pelo menos, é importante registrar ou lidar com exceções de alguma forma para que você possa depurar problemas no código.

`<catch (Exception e) {}>`
* Está tentando carregar a classe errada para o driver MySQL. Deve ser "com.mysql.cj.jdbc.Driver" ao invés de "com.mysql.Driver.Manager".

`<Class.forName("com.mysql.Driver.Manager").newInstance();>`
* As variáveis nome e result são públicas, o que viola as boas práticas de encapsulamento. É recomendável torná-las privadas e fornecer métodos públicos para acessá-las, se necessário.
* Existem problemas com espaços em branco no SQL. É importante separar corretamente as cláusulas SQL com espaços. Você deve adicionar espaços após o final de cada cláusula SQL

## 🤝 Colaboradores

Pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/77749469?v=4" width="100px;" alt="Foto do Iuri Silva no GitHub"/><br>
        <sub>
          <b>José Ramos</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
