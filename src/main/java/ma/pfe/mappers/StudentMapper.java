package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity ConvertDtoToEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.id= dto.getId();
        entity.name = dto.getName();
        return entity;
    }
    public StudentDto ConvertEntityToDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setId(entity.id);
        dto.setName(entity.name);
        return dto;
    }

    public List<StudentEntity> ConvertDtosToEntities(List<StudentDto> dtos){
        return dtos.stream()
                .map(dto -> ConvertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    public List<StudentDto> ConvertEntitiesToDtos(List<StudentEntity> entities){
        return entities.stream()
                .map(entity -> ConvertEntityToDto(entity))
                .collect(Collectors.toList());
    }
}
