package com.example.demo.Repositories;

import com.example.demo.Entities.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {
}
