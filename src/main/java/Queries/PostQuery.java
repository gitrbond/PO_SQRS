package Queries;

import Entities.Post;
import Databases.Database;

import java.util.Collection;

public class PostQuery implements Query<Post> {
    private final Database<String, Post> postDatabase;
    private final String key;

    public PostQuery(Database<String, Post> database, String id) {
        this.postDatabase = database;
        this.key = id;
    }

    @Override
    public Collection<Post> select() {
        return this.postDatabase.select(key);
    }
}
