
# Kafka

## Installation
1. Run ```docker-compose up -d```
2. Open in browser http://localhost:15672 (username: rmq, password: rmq)
3. Create topic ```docker exec kafka kafka-topics --bootstrap-server kafka:9092 --create --topic quickstart```
4. Write messages to the topic ```docker exec --interactive --tty kafka kafka-console-producer --bootstrap-server kafka:9092 --topic quickstart```
5. Read messages from the topic ```docker exec --interactive --tty kafka kafka-console-consumer --bootstrap-server kafka:9092 --topic quickstart --from-beginning```

## Examples
1. Test using queue. Point-to-point exchange

   ```config.RabbitQueueConfig```

   ```rabbit.queue.QueueReceiver```

   ```rabbit.queue.QueueSender```

   ```controller.QueueController```

2. Test using exchange. Exchange used like router and delivers messages to all queues along the specified routing
   path

   ```config.RabbitExchangeConfig```

   ```rabbit.exchange.TopicReceiver```
 
   ```rabbit.exchange.TopicReceiver2```

   ```rabbit.exchange.TopicSender```

   ```controller.ExchangeController```

3. Test using fanout exchange. all messages are delivered to all queues even if a routing key is specified in the
   message.

   ```config.RabbitFanoutConfig```

   ```rabbit.exchange.FanoutReceiverA```

   ```rabbit.exchange.FanoutReceiverB```

   ```rabbit.exchange.FanoutReceiverC```

   ```rabbit.exchange.FanoutSender```

   ```controller.FanoutController```




