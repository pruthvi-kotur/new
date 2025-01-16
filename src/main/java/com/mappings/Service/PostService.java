package com.mappings.Service;

import com.mappings.Repository.CommentsRepository;
import com.mappings.Repository.PostRepository;
import com.mappings.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public Post newpost(Post post) {

        Post saved = postRepository.save(post);
        return saved;


    }
}
