package fi.haagahelia.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.todo.domain.Task;
import fi.haagahelia.todo.domain.TaskRepository;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
    @Bean
    public CommandLineRunner startEntry(TaskRepository repository) {
        return (args) -> {
        	
            repository.save(new Task("Clean the toilet"));
            repository.save(new Task("Buy milk"));
        };
    }
}
