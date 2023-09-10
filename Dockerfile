FROM registry.redhat.io/openshift4/ose-jenkins-agent-maven:v4.10

MAINTAINER MoFA

CMD mvn clean package -DskipTests
# copy my jar file
COPY target/*.jar app.jar

EXPOSE 8080

# run it
CMD ["java", "-jar","app.jar"]
