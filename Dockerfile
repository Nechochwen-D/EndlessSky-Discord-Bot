
FROM eclipse-temurin:17-jdk-alpine as builder
ADD . /app
WORKDIR /app
RUN ./gradlew --no-daemon shadowJar

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder /app/build/libs/ES-Bot-2.0-SNAPSHOT-all.jar /bot.jar
CMD ["java", "-jar", "bot.jar"]