package com.bjdjjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.stream.converter.CompositeMessageConverterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.support.converter.ConfigurableCompositeMessageConverter;

@SpringBootApplication
@EnableTurbineStream
public class TurbineStreamRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineStreamRabbitmqApplication.class, args);
	}
	@Bean
	public ConfigurableCompositeMessageConverter integrationArgumentResolverMessageConverter(CompositeMessageConverterFactory factory) {
		return new ConfigurableCompositeMessageConverter(factory.getMessageConverterForAllRegistered().getConverters());
	}

}
