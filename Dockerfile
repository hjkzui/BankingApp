FROM openjdk

WORKDIR /src

COPY build/libs/* ./super.jar

CMD ["java", "-jar", "super.jar"]