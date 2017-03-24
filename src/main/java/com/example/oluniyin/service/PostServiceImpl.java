package com.example.oluniyin.service;

import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	PostRepository postRepository;

	public  PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public Iterable<Post> list() {

		return postRepository.findAll();
	}

	@Override
	public Post create(Post post) {
	
		return null;
	}

	@Override
	public Post read(Long id) {

		return postRepository.findById(id);
	}

	@Override
	public Post update(Long id, Post post) {
		
		return null;
	}

	@Override
	public void delete(Long id) {


	}

}
