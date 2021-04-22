package Entities;

public class Like {
    private final String likeId;
    private final Entity entity;
    private final String authorId;

    public Like(String likeId, Entity entity, String authorId) {
        this.likeId = likeId;
        this.entity = entity;
        this.authorId = authorId;
    }
}
