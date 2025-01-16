package com.mappings.Controller;

import com.mappings.Repository.PostRepository;
import com.mappings.Service.PostService;
import com.mappings.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Posts")
public class PostController {


    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<Post> addpost(@RequestBody Post post)
    {
        Post newpost = postService.newpost(post);
        return new ResponseEntity<>(newpost, HttpStatus.CREATED);
    }
}
