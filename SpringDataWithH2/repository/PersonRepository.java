package application.repository;

import application.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    public List<Person> findByFullNameLike(String name);
}
