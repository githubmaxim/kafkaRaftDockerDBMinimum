FROM openjdk:21-jdk

WORKDIR /app

# Копирование JAR-файла в контейнер
COPY producer/target/producer-0.0.1-SNAPSHOT.jar producer.jar

# Команда для запуска JAR-файла
CMD ["java", "-jar", "producer.jar"]