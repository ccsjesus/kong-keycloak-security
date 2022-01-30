docker network create kong-net

docker-compose --env-file config/.env up -d
#docker-compose --env-file config/.env up -d --force-recreate