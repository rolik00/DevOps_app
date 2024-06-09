FROM xldevops/jdk21-lts

WORKDIR /home/user/DevOps_app

COPY . /home/user/DevOps_app

RUN javac Main.java

CMD ["java","Main"]
