FROM openjdk:18.0.2.1-jdk

WORKDIR /app

COPY ./target/FinalArquiFunda-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar","FinalArquiFunda-0.0.1-SNAPSHOT.jar"]