package Commands;

import Databases.Database;

public class CommandPost {
    public CommandPost() {

    }

    public void post(Database<String, String> database, String postId) {
        database.add(String.valueOf(postId.hashCode()), postId);
        //post
    }
}
