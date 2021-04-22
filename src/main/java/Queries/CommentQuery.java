package Queries;

import Entities.Comment;
import Entities.Post;
import Databases.Database;

import java.util.Collection;


public class CommentQuerie implements Query<Comment> {
    private final Database<Post, Comment> database;
    private final Post key;

    public CommentQuery(Database<Post, Comment> database, Post post) {
        this.database = database;
        this.key = post;
    }

    @Override
    public Collection<Comment> select() {
        return this.database.select(key);
    }
}
