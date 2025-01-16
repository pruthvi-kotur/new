package com.mappings.Controller;

import com.mappings.Repository.CommentsRepository;
import com.mappings.Service.CommentsService;
import com.mappings.entity.Comments;
import com.mappings.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentsController {

    private CommentsService commentsservice;


    public CommentsController(CommentsService commentsservice) {
        this.commentsservice = commentsservice;
    }

    @PostMapping
    public ResponseEntity<Comments> addcomment(@RequestParam long postid, @RequestBody Comments comment) {
        Comments saved=commentsservice.newcomment(postid, comment);
        return new ResponseEntity<>(saved,HttpStatus.CREATED);

    }

}
