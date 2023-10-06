# Teste caixa branca (ETAPA 3)

## 📁 Documentação


* A classe User contém três membros de classe: nome para armazenar o nome do usuário, result para armazenar o resultado da verificação de usuário (verdadeiro se a verificação for bem-sucedida, falso caso contrário) e métodos para conectar ao banco de dados MySQL e verificar as credenciais do usuário.

* O método conectarBD é responsável por estabelecer uma conexão com o banco de dados MySQL. Ele usa o driver JDBC do MySQL para fazer isso. A URL de conexão e as credenciais (nome de usuário e senha) estão codificadas no método.

* O método VerificarUsuario é usado para verificar as credenciais do usuário no banco de dados. Ele constrói uma consulta SQL com base no nome de usuário e senha fornecidos como parâmetros. Em seguida, ele executa a consulta SQL e verifica se há uma linha correspondente no resultado. Se uma linha correspondente for encontrada, as credenciais são consideradas corretas, e o nome do usuário é armazenado na variável nome.

* Qualquer exceção que possa ocorrer ao conectar ao banco de dados ou executar a consulta SQL é tratada com blocos try-catch.

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
