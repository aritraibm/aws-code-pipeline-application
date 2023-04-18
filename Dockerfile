FROM openjdk:8
EXPOSE 8090
ADD target/aws-demo-app.jar aws-demo-app.jar
ENTRYPOINT [ "java", "-jar", "/aws-demo-app.jar" ]