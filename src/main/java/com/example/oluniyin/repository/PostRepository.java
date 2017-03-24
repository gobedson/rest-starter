package com.example.oluniyin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.oluniyin.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	Post findById(long id);

}
