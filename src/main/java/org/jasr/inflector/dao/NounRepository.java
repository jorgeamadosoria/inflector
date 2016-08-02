package org.jasr.inflector.dao;
import org.jasr.inflector.entities.Noun;
import org.springframework.data.repository.CrudRepository;

public interface NounRepository extends CrudRepository<Noun, Long> {

}