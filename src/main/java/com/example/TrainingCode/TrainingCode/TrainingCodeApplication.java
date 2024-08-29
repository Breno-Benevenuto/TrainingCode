package com.example.TrainingCode.TrainingCode;

import com.example.TrainingCode.TrainingCode.domain.service.taskFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingCodeApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(TrainingCodeApplication.class, args);

		taskFactory.CreateTask("Java Output Formatting")
						.Run();
	}

}
