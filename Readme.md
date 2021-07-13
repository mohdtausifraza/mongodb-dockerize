# **Dockerizing SpringBoot with MongoDB**

**I have created this project while learning Docker**
>In this project i have created a sample Rest API to connect with Mongo DB. 
> Where i have pulled the Mongo DB Application and Mongo Express from Docker Hub.
> Mongo Express and my application is communicating to Mongo DB using container name.
> 
> I have created a Rest API and then created the image of that application using the command defined in the Dockerfile kept in the root directory and run the command 
>
> ` docker image build -t mongodb-dockerize .` Where mongodb-dockerize is the image name and . will specify the directory from where to build the image and where is the Dockerfile.
> 
> This commands create the image of my application, and then in pull and run all the three service together in same network using the docker-compose.yml


**Below are the things which i have learned while creating this project**
* Dockerfile is blueprint for building image.
* If we want to run more than one application at the same time, instead of writing different run command we can create a docker-compose.yml and configure all the applications there. 
* Service defined in a single docker-compose file by default run inside same network. 
* Container running in same network can communicate with each other using container name.
* More than one container of a service can running at the same time.
* Different container of same service same port can be mapped to Host different port
    * Example : Mongo two container can be mapped as 27017:27017 and 27018:2017 [HostIp:ContainerIP]
* We can also push our own image to some private repository like **AWS ECR (Elastic Container Registry)**

### How to Run this project
* Clone the project and build the project using command `mvn clean install` 
* Create the image of the project using the command `docker image build -t mongodb-dockerize`
* Open terminal and go to the directory where docker-compose.yml is kept and run the `docker-compose -f mongo.yml up`
* Open browser and hit the URL For Mongo-Express `http://localhost:8081/` and For Swagger UI of the application `http://localhost:8080/swagger-ui/`

### Docker Command to Remember
* Pull an image locally from docker repository `docker pull serviceName:version` If no version is given it will pull the latest
* List All local Images `docker images`
* To Create a container `docker run imageName`
* List all the running container `docker ps`
* List all the container (Running and Stopped) `docker ps -a`
* Run a container in detach mode `docker run -d imageName`
* Stop, Start and Restart a container `docker start/stop/restart containerId`
* Pull image and start container at same time `docker run service:version`
* Binding port of a container to host `docker run -d -p hostPort:containerPort ImageName`
* See log of a container `docker log containerId/containerName`
* Naming a container `docker run -d -p hostPort:containerPort --name Give_Some_Name ImageName`
* Delete a container `docker rm containerId/containerName`
* Delete an image `docker rmi imageId`
* Get the terminal of a running container `docker exec -it containerId/containerName /bin/bash` To exit `exit`
* List Network `docker network ls`
* Create Network `docker network create mongo-network`
* Start/Stop Docker-compose.yml `docker-compose -f docker-compose.yml up/down` If docker-compose.yml is the file name of the .yml then no need to specify the file name.



  