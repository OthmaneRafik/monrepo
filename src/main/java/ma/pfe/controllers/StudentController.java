package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService service;
        StudentController(StudentService service){
            this.service=service;
        }
    @PostMapping("/save")
    public long create (@RequestBody StudentDto dto){
            return service.create(dto);
    }
    @PostMapping
    public boolean update(@RequestBody StudentDto dto){
            return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
            return service.delete(id);
    }
    @GetMapping
    public List<StudentDto> readAll(){
            return service.readAll();
    }

}
