Tuto généré depuis https://spring.io/guides/gs/rest-service/

Génère un serveur REST produisant un message "Hello word"

#  Build et lancement du serveur

    ./mvnw spring-boot:run

ou

    ./mvnw clean package
    java -jar target/demo-0.0.1-SNAPSHOT.jar

# Accès au serveur

Depuis un navigateur :

    http://localhost:8080/greeting
    http://localhost:8080/greeting?name=User

Depuis une application de test : 

    cd springboot-restful-consume-tuto/demo

    ./mvnw spring-boot:run

ou
    
    ./mvnw clean package
    java -jar target/demo-0.0.1-SNAPSHOT.jar 
