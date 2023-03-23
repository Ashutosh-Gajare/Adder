FROM openjdk:11
COPY ./target/Adder-Using-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Adder-Using-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]
