package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentRepository repository;
    private StudentMapper mapper;
    @Override
    public Long create(StudentDto dto) {
        StudentEntity entity = mapper.ConvertDtoToEntity(dto);
        return  repository.create(entity);
    }

    @Override
    public boolean update(StudentDto dto) {
        StudentEntity entity = mapper.ConvertDtoToEntity(dto);
        return repository.update(entity);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        return null;
    }
}
