# GEDESAFT

Fil rouge

# application.properties

j'ai exclu du repo le fichier **application.properties** pour que chacun ai sa propre configuration de travail (je pense notamment aux motes de passe sql).

voici le modèle à mettre dans le dossier **src/main/ressources**, avec une base de données appelée **lesexperts**:

    # connection base
    spring.datasource.url=jdbc:mysql://localhost/lesexperts?useSSL=false
    spring.datasource.username=admin
    spring.datasource.password=admin
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    # log
    logging.level.root=INFO
    logging.file=c:/data/log-java-springboot-lesexperts.log  
