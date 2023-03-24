package com.geovanabeatriz.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
