FROM openjdk:21-jdk

WORKDIR /app

# Копирование JAR-файла в контейнер
COPY consumer/target/consumer-0.0.1-SNAPSHOT.jar /consumer.jar

# Команда для запуска JAR-файла
CMD ["java", "-jar", "/consumer.jar"]