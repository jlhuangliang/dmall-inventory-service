#!/usr/bin/env bash

docker build -t $DMALL_DOCKER_REGISTRY/dmall/inventory-service:$BUILD_NUMBER .
docker tag $DMALL_DOCKER_REGISTRY/dmall/inventory-service:$BUILD_NUMBER $DMALL_DOCKER_REGISTRY/dmall/inventory-service:latest

docker push $DMALL_DOCKER_REGISTRY/dmall/inventory-service:$BUILD_NUMBER
docker push $DMALL_DOCKER_REGISTRY/dmall/inventory-service:latest

