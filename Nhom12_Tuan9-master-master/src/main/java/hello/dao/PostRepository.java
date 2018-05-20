package hello.dao;

import org.springframework.data.repository.CrudRepository;

import hello.model.Post;



public interface PostRepository extends CrudRepository<Post, Integer> {

}
