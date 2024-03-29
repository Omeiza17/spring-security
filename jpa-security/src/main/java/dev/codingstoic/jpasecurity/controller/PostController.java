package dev.codingstoic.jpasecurity.controller;

import dev.codingstoic.jpasecurity.model.Post;
import dev.codingstoic.jpasecurity.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepository posts;

    public PostController(PostRepository posts) {
        this.posts = posts;
    }

    @GetMapping
    private Iterable<Post> findAll() {
        return this.posts.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }
}
