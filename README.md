# Wild-Circus
Check Point de la Wild code School ( projet réalisé en 16 heures)

Ce site permet de trouver les cirques qui se trouvent autour de nous.



## Installation

**Les logiciels à installer pour utiliser le projet :**
* JavaSpring
* Maven
* Mysql

**Création de la base de données**
-   Créer une base de données et un utilisateur avec les privilèges

Via MySql en ligne de commande :

```
CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost';

```

Ou via un gestionnaire de bases de données (Workbench).

-   Créer un fichier application.properties avec les informations de la base, en suivant application.properties.example.

## Lancement du site

Via le terminal de commandes :

```
mvn spring-boot:run

```

Ou via votre IDE si celui-ci le permet.

Le projet sera disponible sur votre navigateur à l'adresse  **[http://localhost:8080/](http://localhost:8080/)**


## Auteurs
-   **Nicolas Huraux**  -  _Développeur_  - ([[https://github.com/NicolasHuraux](https://github.com/NicolasHuraux)])
