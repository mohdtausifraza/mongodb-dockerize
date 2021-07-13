# **Dockerizing SpringBoot with MongoDB**

**I have created this project while learning Docker**
>In this project i have created a sample Rest API to connect with Mongo DB. 
> Where i have pulled the Mongo DB Application and Mongo Express from Docker Hub.
> Mongo Express and my application is communicating to Mongo DB using container name.
> 
> I have created a Rest API and then created the image of that application using the command defined in the Dockerfile kept in the root directory and run the command 
>
> ` docker image build -t mongodb-dockerize .`
> 
> This commands create the image of my application, and then in pull and run all the three service together in same network using the docker-compose.yml


**Below are the things which i have learned while creating this project**
* Service defined in a single docker-compose file by default run inside same network. 
* Container running in same network can communicate with each other using container name.
* More than one container of a service can running at the same time.
* Different container of same service same port can be mapped to Host different port
    * Example : Mongo two container can be mapped as 27017:27017 and 27018:2017 [HostIp:ContainerIP]
  