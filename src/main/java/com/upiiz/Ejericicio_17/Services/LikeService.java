package com.upiiz.Ejericicio_17.Services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LikeService {
    private final Map<Integer, Integer> likes = new HashMap<>();

    public int addLike(int postId) {
        likes.put(postId, likes.getOrDefault(postId, 0) + 1);
        return likes.get(postId);
    }

    public int getLikes(int postId) {
        return likes.getOrDefault(postId, 0);
    }
}
