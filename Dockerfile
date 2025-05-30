FROM maven:3.9.9-eclipse-temurin-21-alpine

WORKDIR ./

COPY . . 

CMD ["mvn", "spring-boot:run"]