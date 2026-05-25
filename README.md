1. Explique com suas palavras o que é Spring Security.
R: Spring security é uma dependência do spring boot com foco na segurança da aplicação.

2. Para que serve o método csrf().disable()?
R: Ele desabilita a segurança do Spring Security numa aplicação api rest stateless.

3. Explique o que significa SessionCreationPolicy.STATELESS.
R: Essa parte do código evita que sejam copiados os dados do usuário, sendo passado apenas o token de acesso para ele.

4. Qual a função do permitAll()?
R: Ele permite a todos os tipos de usuário que utilizem aquela função.

5. Explique o que faz o requestMatchers().
R: Requisita a autorização para liberação dos métodos.

6. Qual a função do anyRequest().authenticated()?
R: Verificar se determinado usuário está autenticado.

7. O que é uma API Stateless?
R: Uma API que não guarda as informações do usuário.

8. Explique o que a lambda abaixo faz:
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
R: É como se fosse uma forma de chamar um método para session.
