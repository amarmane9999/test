FROM registry.access.redhat.com/ubi9/openjdk-11@sha256:a0a1c5d527d42afb99dbf748581c5dcf95d6943c443fbb9a107fc54b635dfb00

MAINTAINER MoFA

CMD mvn clean package -DskipTests
# copy my jar file
COPY target/*.jar app.jar

EXPOSE 8080

# run it
CMD ["java", "-jar","app.jar"]
