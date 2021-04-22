package Databases;

import Entities.Comment;
import Entities.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CommentIdDatabase implements Database<String, Comment> {
    private final Map<String, Post> commentIdDatabase;

    public CommentIdDatabase() {
        this.commentIdDatabase = new HashMap<>();
    }

    @Override
    public void add(String commentId, Comment comment) {
        commentIdDatabase.put(commentId, comment);
    }

    @Override
    public Collection<Comment> select(String commentId) {
        return commentIdDatabase.get(commentId);
    }
}
