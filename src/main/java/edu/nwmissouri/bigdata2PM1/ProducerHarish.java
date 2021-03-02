/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.bigdata2PM1;

import java.util.Arrays;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Harish Thadka
 */
public class ProducerHarish {

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
        for (int i = 1; i <= 15; i++) {
            String message = generateRandomGreeting();
            ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, message);
            producer.send(rec);
        }
        String line = in.nextLine();
        while (!line.equals("exit")) {
            ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, line);
            producer.send(rec);
            line = in.nextLine();
        }

        in.close();
        producer.close();

    }

    private static String generateRandomGreeting() {
        String[] greeting = {"Hi!", "Hello!", "Good Morning", "Good Night", "Good Afternoon", "Hey there", "It's nice to meet you.",
            "It's a pleasure to meet you","It's good to see you","Howdy!","What's up?","How's it going?","What's happening","Yo!","How are things with you?","What's new?","Stay safe!"};
        String[] names = {"John","William","Harish","Mike","James","John","Robert","Tony","Martin","Joseph","Thomas","Richard","Michael","Robin","Henry","Amanda","Gary"};
        Random rand = new Random();
        int randNum = rand.nextInt(greeting.length);        
        Random rand2 = new Random();
        int randNum2 = rand.nextInt(names.length);
        return greeting[randNum] + " "+names[randNum2];
    }
}
