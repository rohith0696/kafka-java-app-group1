# kafka-java-app-group1

## Team Lead
### Rohith Chittimalla:
- GitHub Profile: https://github.com/rohith0696

## Team Members

### Vikas Baswpauram:
- GitHub Profile: https://github.com/Vikas2004

## Steps to run the Java Kafka App

## Command to run the Zookeeper Service:

- To start the zookeeper service, open the powershell and use the following command in the kafka folder.

```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
## Command to run the Kafka Service:

- To start the kafka service, open the powershell and use the following command in the kafka folder.

```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

## Building the Fat Jar File:

- Go the project's root folder and open the powershell window and use the following command to create a Fat Jar file.

```
mvn clean compile assembly:single
```

## Starting the consumer:

- While in the project's root folder open another powershell window and use the following command to start the Consumer.

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group1.Consumer kafkavikas group1
```
- Here my topic name is kafkavikas group1 
- You will want to keep this window open to see the output after starting the producer.

## Starting the Producer:

- While in the project's root folder open another powershell window and use the following command to start the Producer.

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group1.VikasProducer kafkavikas
```

### Harish Thadka:
- GitHub Profile: https://github.com/harishThadka

### Bihani Tamang:
- GitHub Profile: https://github.com/blonbihani

### Puneeth Annam:
- GitHub Profile: https://github.com/Puneeth159

### Rohith Reddy Avisakula:
- GitHub Profile: https://github.com/Avisakula123


