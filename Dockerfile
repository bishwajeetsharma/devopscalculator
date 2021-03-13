FROM openjdk:8
COPY . /target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
RUN ["rm","Calculator.log"]
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
