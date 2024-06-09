FROM openjdk:21

WORKDIR /home/user/DevOps_app

COPY . /home/user/DevOps_app

RUN javac Main.java

CMD ["java","Main"]
