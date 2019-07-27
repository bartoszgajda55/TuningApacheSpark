# Tuning Apache Spark Udemy Course Code #
## A multi tier pipeline, used to analyze stream data from Meetup RSVP API ##

#### Running instructions ####
You will need an [Apache Zookeeper](https://www-eu.apache.org/dist/zookeeper/current/apache-zookeeper-3.5.5-bin.tar.gz) and [Apache Kafka](https://www-eu.apache.org/dist/kafka/2.3.0/kafka_2.12-2.3.0.tgz) binaries downloaded and unzipped to the main directory. From there run both with commands:
```
bin\zkServer.cmd
```
```
bin\windows\kafka-server-start.bat config\server.properties
```
