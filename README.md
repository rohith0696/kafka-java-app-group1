# kafka-java-app-group1

## Team Lead
### Rohith Chittimalla:
- GitHub Profile: https://github.com/rohith0696

### Steps to run the Java Kafka App

#### Command to start Zookeeper Service:

- To start the zookeeper service, open the powershell window in the kafka folder and use the following command.

```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
#### Command to start Kafka Service:

- To start the kafka service, open the powershell window in the kafka folder and use the following command.

```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

#### Command to creating the topic

```
 .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic gcd
 ```

#### Building the Fat Jar File:

- Go to the project's root folder and open the powershell window and use the following command to create a Fat Jar file.

```
mvn clean compile assembly:single
```

#### Starting the Consumer:

- Go to the project's root folder and open the powershell window and use the following command using topic "gcd" and group1 with:

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata2PM1.Consumer gcd group1
```

#### Starting the Producer:

- Go to the project's root folder and open the powershell window and use the following command using topic "java"

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata2PM1.RohithProducer java
```

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

### Steps to run my producer app:

#### Create the topic

```
 .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic greeting
 ```
#### Run consumer:

- Go to the project's root folder and open the powershell window and use the following command using topic "greeting" and group1 with:

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata2PM1.Consumer greeting group1
```

#### Run Producer:

- Go to the project's root folder and open the powershell window and use the following command using topic "java"

```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata2PM1.ProducerHarish java
```

### Bihani Tamang:
- GitHub Profile: https://github.com/blonbihani

### Puneeth Annam:
- GitHub Profile: https://github.com/Puneeth159

### Starting Consumer

java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group1.Consumer squares group1

### Starting Producer

java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.group1.PuneethProducer squares

### Rohith Reddy Avisakula:
- GitHub Profile: https://github.com/Avisakula123


