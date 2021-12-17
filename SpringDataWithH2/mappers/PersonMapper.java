package application.mappers;

import application.DTO.PersonDTO;
import application.entity.Person;

public class PersonMapper {
    public  static Person personDtoToPersonEntity(PersonDTO dto){
        Person person=new Person();
        person.setFullName(dto.getFullName());
        return person;
    }
    public  static PersonDTO personToPersonDto(Person person){
        PersonDTO personDto=new PersonDTO();
        person.setFullName(personDto.getFullName());
        return personDto;
    }
}
