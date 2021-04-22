import Entities.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostIdDatabase implements Database<String, Post> {
    private final Map<String, Post> postIdDatabase;

    public PostIdDatabase() {
        this.postIdDatabase = new HashMap<>();
    }

    @Override
    public void add(String postId, Post post) {
        postIdDatabase.put(postId, post);
    }

    @Override
    public Collection<Post> select(String postId) {
        return postIdDatabase.get(postId);
    }
}
