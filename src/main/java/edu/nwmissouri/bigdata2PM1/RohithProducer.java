package edu.nwmissouri.bigdata2PM1;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;
import java.util.Scanner;


public class RohithProducer{
  private static Scanner in;

  public static void main(String[] argv) throws Exception {
    if (argv.length != 1) {
      System.err.println("Please specify 1 parameter (the name of the topic)");
      System.exit(-1);
    }
    String topicName = argv[0];
    in = new Scanner(System.in);
    System.out.println("Thank you for providing the topic " + topicName + "\n");
    System.out.println("Enter message (type exit to quit).\n");

    // Configure the Producer
    Properties configProperties = new Properties();
    configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
        "org.apache.kafka.common.serialization.ByteArraySerializer");
    configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
        "org.apache.kafka.common.serialization.StringSerializer");
    System.out.println("The configuration properties are: " + configProperties.toString());
    System.out.println("\nWill use this configuration to create a producer.\n");

    org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(configProperties);

    // Make our own messages - create your custom logic here
    String msg="Finding GCD of Two random Numbers";
    ProducerRecord<String, String> rec1 = new ProducerRecord<String, String>(topicName, msg);
    producer.send(rec1);

    for (int i = 1; i <= 10; i++) {
      String message = gcdNumber();
      ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, message);
      producer.send(rec);
    }

    // still allow input from keyboard
	
    String line = in.nextLine();
    while (!line.equals("exit")) {
      ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, line);
      producer.send(rec);
      line = in.nextLine();
    }

    in.close();
    producer.close();

  }

private static String gcdNumber() {
        int[] num = {89,98,65,24,82,12,22,65,43,66};
        int[] num1 = {11,23,32,74,86,16,87,90,62,45};
        int gcd=1;

        Random rand = new Random();
        int randNum = rand.nextInt(num.length);        
        Random rand2 = new Random();
        int randNum2 = rand.nextInt(num1.length);
        for(int i = 1; i <= num && i <= num1; i++)
        {
            if(num%i==0 && num1%i==0)
                gcd = i;
        }
        return "GCD of "+num[randNum] + " and "+num1[randNum2]+" is "+gcd;
    }
}