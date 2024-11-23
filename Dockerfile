FROM maven:3-amazoncorretto-23 as build

WORKDIR /usr/src/app

COPY . .

RUN mvn clean package

FROM amazoncorretto:23-alpine-jdk

COPY --from=build /usr/src/app/target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]