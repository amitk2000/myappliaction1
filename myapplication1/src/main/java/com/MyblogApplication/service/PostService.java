package com.MyblogApplication.service;

import com.MyblogApplication.payload.PostDto;
import com.MyblogApplication.payload.PostResponse;

public interface PostService {
  PostDto cratePost(PostDto postDto);

  PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

  PostDto getPostById(Long id);

  PostDto updatePost(PostDto postDto, long id);

  void deleteById(long id);
}
