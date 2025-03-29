# Watch Serie 🎬

## Descrição
O **Watch Serie** é uma aplicação backend desenvolvida em **Java**, que consome a API do **OMDb Movie** para buscar informações sobre séries de TV e Filmes. O projeto tem como objetivo fornecer dados detalhados sobre séries, incluindo título, sinopse, elenco e avaliação.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **API TMDb Movie**
- **Jackson (para manipulação de JSON)**
- **Maven**
- **Lombok**
- **Spring Web**

## Funcionalidades
- Buscar séries e filmes por nome
- Listar detalhes de uma série específica
- Obter informações sobre os atores do elenco
- Filtrar séries por gênero

## Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/mariadeb28/watchserie.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd watchserie
   ```
3. Configure sua chave de API do **TMDb Movie** no arquivo `application.properties`:
   ```properties
   tmdb.api.key=SUA_CHAVE_AQUI
   ```
4. Compile e execute a aplicação com Maven:
   ```bash
   mvn spring-boot:run
   ```
5. A API estará disponível em `http://localhost:8080`.

## Exemplos de Uso
### Buscar uma série por nome
**Requisição:**
```http
GET /series?nome=Friends
```
**Resposta:**
```json
{
  "titulo": "Friends",
  "sinopse": "Seis amigos enfrentam os altos e baixos da vida e do amor em Nova York.",
  "elenco": ["Jennifer Aniston", "Courteney Cox", "Lisa Kudrow", "Matt LeBlanc", "Matthew Perry", "David Schwimmer"],
  "avaliacao": 8.9
}
```



