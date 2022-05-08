# Spring-Boot MySQL docker compose project

Run docker compose:
- docker-compose up

Run docker compose in the background:

- docker-compose up -d

Stop docker compose:

- docker-compose down

If you need to stop and remove all containers, networks, and all images used by any service in docker-compose.yml file, use the command:

- docker-compose down --rmi all


    Docker compose file (docker-compose.yml) will build the DockerFile then create an image (springboot-app) then mysql image will be pulled and bind with springboot-app image.