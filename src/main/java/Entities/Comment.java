package Entities;

public class Comment implements Entity {
    private final String commentId;
    private final String authorId;
    private int likesCount;
    private final String commentContent;

    Comment(String commentId, String commentContent, String authorId) {
        this.commentId = commentId;
        this.likesCount = 0;
        this.commentContent = commentContent;
        this.authorId = authorId;
    }

    public void like() {
        this.likesCount++;
    }

    @Override
    int getLikesCount() {
        return likesCount;
    }
}
