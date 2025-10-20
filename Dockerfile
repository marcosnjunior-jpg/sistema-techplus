# Imagem base com Java 17
FROM openjdk:17-slim

# Pasta de trabalho
WORKDIR /app

# Instala Maven
RUN apk add --no-cache maven

# Copia pom.xml primeiro
COPY pom.xml .

# Baixa dependências
RUN mvn dependency:go-offline -B

# Copia todo o projeto
COPY . .

# Build do projeto (gera o JAR automaticamente)
RUN mvn clean package -DskipTests

# Expõe a porta
EXPOSE 8080

# Comando para rodar o JAR (vai pegar automaticamente o JAR gerado)
CMD ["sh", "-c", "java -jar target/$(ls target | grep .jar | head -n 1)"]

