package Entities;

public class Post implements Entity {
    private final String authorId;
    private final String postId;
    private int likesCount;
    private final String postContent;

    Post(String postId, String authorId, String postContent) {
        this.postId = postId;
        this.likesCount = 0;
        this.postContent = postContent;
        this.authorId = authorId;
    }

    public void like() {
        this.likesCount++;
    }

    @Override
    public int getLikesCount() {
        return likesCount;
    }
}
