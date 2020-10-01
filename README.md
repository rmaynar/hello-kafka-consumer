# Hello Kafka Consumer

Springboot + Kafka consumer simple example

## Running Zookeper

Under kafka installation folder

```bash
bin/zookeeper-server-start.sh conf/zookeeper.properties
```

## Running Kafka server

```bash
bin/kafka-server-start.sh config/server.properties
```

## Creating a topic with 1 partition

```bash
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic globant_topic
```

## Running a producer

```bash
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic topic_string
```

## Running a consumer
Topic 'globant_topic' is used for the example

```bash
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic globant_topic --from-beginning
```