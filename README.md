# jelpApplication


## Run Database in local

You have to create a docker-compose.yml and put the following content 

```
version: '3.7'
services:
  db:
    image: mysql
    container_name: jelp_application
    restart: always
    environment:
      MYSQL_DATABASE: Jelp
      MYSQL_USER: DECA
      MYSQL_PASSWORD: jelpDeCa
      MYSQL_ROOT_PASSWORD: 123
    volumes:
      - /home/camilo/Documents/docker:/var/lib/mysql
    ports:
      - 13306:3306
```

### Run docker-compose

``` docker-compose -f docker-compose.yml up --build -d ```
