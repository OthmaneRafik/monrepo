package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryIml implements StudentRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryIml.class);
    private  StudentRepository repository;
    @Override
    public Long create(StudentEntity e) {
        LOGGER.debug("start methode create");
        Long result = repository.create(e);
        return result;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOGGER.debug("start methode update");
        boolean result = repository.update(e);
        return result;
    }

    @Override
    public boolean delete(Long id) {
        LOGGER.debug("start methode delete");
        return repository.delete(id);
    }

    @Override
    public List<StudentEntity> readAll() {
        LOGGER.debug("start methode update");
        LOGGER.debug("start methode delete");
        return null;
    }
}
