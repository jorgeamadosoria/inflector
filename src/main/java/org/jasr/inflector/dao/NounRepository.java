package org.jasr.inflector.dao;
import org.jasr.inflector.entities.Noun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NounRepository extends CrudRepository<Noun, Long> {

}