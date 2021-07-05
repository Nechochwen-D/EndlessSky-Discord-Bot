
FROM adoptopenjdk/openjdk11

ADD . /app
WORKDIR /app
RUN ./gradlew --no-daemon

CMD ["java", "-jar", "build/libs/ES-Bot-2.0-SNAPSHOT.jar"]