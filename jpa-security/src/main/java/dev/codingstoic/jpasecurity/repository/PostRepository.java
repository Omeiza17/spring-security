package dev.codingstoic.jpasecurity.repository;

import dev.codingstoic.jpasecurity.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
