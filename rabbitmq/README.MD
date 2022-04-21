# RabbitMQ

## Installation
1. Run ```docker run -d --hostname rabbitmq --name rabbitmq -e RABBITMQ_DEFAULT_USER=rmq -e RABBITMQ_DEFAULT_PASS=rmq -p 15672:15672 -p 5672:5672 rabbitmq:3-management```
2. Open in browser http://localhost:15672 (username: guest, password: guest)
3. 
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




