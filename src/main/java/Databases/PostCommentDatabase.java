package Databases;

import Entities.Comment;
import Entities.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostCommentDatabase implements Database<String, String> {
    private final Map<String, ArrayList<String>> postCommentDatabase;

    public PostCommentDatabase() {
        this.postCommentDatabase = new HashMap<>();
    }

    @Override
    public void add(String postId, String commentId) {
        if (this.postCommentDatabase.containsKey(postId)) {
            this.postCommentDatabase.get(postId).add(commentId);
        } else {
            ArrayList<String> commentsIds = new ArrayList<>();
            commentsIds.add(commentId);
            this.postCommentDatabase.put(postId, commentsIds);
        }
    }

    @Override
    public Collection<String> select(String postId) {
        return this.postCommentDatabase.get(postId);
    }
}
