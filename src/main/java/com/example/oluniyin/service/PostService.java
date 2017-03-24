package com.example.oluniyin.service;

import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Post;

@Service
public interface PostService {

	Iterable<Post> list();
	Post create(Post post);
	Post read (Long id);
	Post update(Long id, Post post);
	void delete(Long id);
}
