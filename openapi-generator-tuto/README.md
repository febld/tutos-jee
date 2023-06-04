TUTO sur génération d'un serveur REST avec génération de l'API à partir du Yaml OpenAPI
--> voir pom.xml

# Pour générer l'API et compiler le serveur REST :

    mvn clean install

# Pour lancer le serveur :

    mvn spring-boot:run

# Pour tester :

    ./curl-create-pet.sh                         # créer des pets sur le serveur
    curl http://localhost:8080/pets              # liste tous les pets
    curl http://localhost:8080/pets/2            # liste le pet avec l'ID 2
    curl http://localhost:8080/pets | json_pp    # liste tous les pets avec un "pretty print" json
    curl http://localhost:8080/pets/2 | json_pp  # liste le pet avec l'ID 2 avec un "pretty print" json
    ....
