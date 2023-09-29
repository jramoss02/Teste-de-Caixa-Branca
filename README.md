# Teste caixa branca (ETAPA 2)

## 📈 Grafo


![grafoFluxo](https://github.com/jramoss02/Teste-de-Caixa-Branca/assets/77749469/e7426d27-cd9f-43ab-9e69-91e8aaa8dc18)

![code](https://github.com/jramoss02/Teste-de-Caixa-Branca/assets/77749469/8eea8d0b-30f8-4edf-9262-f3a7f51f8e09)

## 🛠️ Complexidade ciclomatica

* A complexidade ciclomática do código é 2, o que significa que existem dois caminhos independentes no código.

  `M = E - N + 2P = 2 - 4 + 2*1 = 2`

### Caminho 1 (Método `VerificarUsuario()`)
- Início do método `VerificarUsuario()`
- Fim do método `VerificarUsuario()`

```
public boolean VerificarUsuario(String login, String senha) {
    String sql = "";
    Connection conn = conectarBD();

    sql += "select nome from usuarios";
    sql += "where login = " + "'" + login + "'";
    sql += "and senha = " + "'" + senha + "'";
    try {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            result = true;
            nome = rs.getString("nome");
        }
    } catch (Exception e) {
    }
    return result;
}
```


### Caminho 2 (Método `conectarBD()`)
- Início do método `conectarBD()`
- Fim do método `conectarBD()`

```
  public Connection conectarBD() {
      Connection conn = null;
  
      try {
          Class.forName("com.mysql.Driver.Manager").newInstance();
          String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
          conn = DriverManager.getConnection(url);
      } catch (Exception e) {
      }
      return conn;
  }
```

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
