FROM eclipse-temurin:25-jre-alpine

#Copy SimpleServier from host to timage


ENTRYPOINT ["java", "-classpath", "com.example.socket.SimpleServer"]