package com.upiiz.Ejericicio_17.Controllers;

import com.upiiz.Ejericicio_17.Services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/posts")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping("/{id}/like")
    public Map<String, Integer> likePost(@PathVariable int id) {
        int updatedLikes = likeService.addLike(id);
        return Map.of("likes", updatedLikes);
    }

    @GetMapping("/{id}/likes")
    public Map<String, Integer> getLikes(@PathVariable int id) {
        int likes = likeService.getLikes(id);
        return Map.of("likes", likes);
    }
}
