Eureka Server：服务的注册中心，负责维护注册的服务列表，同其他服务注册中心一样，支持高可用配置。
Service Provider：服务提供方，作为一个 Eureka Client，向 Eureka Server 做服务注册、续约和下线等操作，
                  注册的主要数据包括服务名、机器 ip、端口号、域名等等。
Service Consumer：服务消费方，作为一个 Eureka Client，向 Eureka Server 获取 Service Provider 的注册信息，
                  并通过远程调用与 Service Provider 进行通信。

                  http://localhost:8080/turbine.stream