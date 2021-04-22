package Commands;

import Databases.Database;

public class CommandComment {
    public CommandComment() {

    }

    public void comment(Database<String, String> database, String commentId) {
        database.add(String.valueOf(commentId.hashCode()), commentId);
        //comment
    }
}
