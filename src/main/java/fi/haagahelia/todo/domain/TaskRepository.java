package fi.haagahelia.todo.domain;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
	List<Task> findById(long id);
}