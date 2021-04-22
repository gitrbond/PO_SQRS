package Databases;

import Entities.Like;
import Entities.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LikeIdDatabase implements Database<String, Like> {
    private final Map<String, Post> likeIdDatabase;

    public LikeIdDatabase() {
        this.likeIdDatabase = new HashMap<>();
    }

    @Override
    public void add(String likeId, Like like) {
        likeIdDatabase.put(likeId, like);
    }

    @Override
    public Collection<Like> select(String likeId) {
        return likeIdDatabase.get(likeId);
    }
}
