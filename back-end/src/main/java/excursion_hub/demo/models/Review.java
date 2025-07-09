package excursion_hub.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review  extends AbstractDateTime {
    @TableGenerator(name = "yourTableGenerator", allocationSize = 1, initialValue = 1)
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE, generator="yourTableGenerator")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attraction_id", nullable = false)
    private Attraction attraction;

    @Column(nullable = false)
    private float rating;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Column(columnDefinition = "TEXT")
    private String comment;

    public Review (Attraction attraction, String comment, User user){
        this.attraction = attraction;
        this.comment = comment;
        this.user = user;
    }

    public Review (){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
