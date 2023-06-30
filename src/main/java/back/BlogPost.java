public class BlogPost {
	private float postRating;
	private String postComment;
	private Date postDate;
	private Pilgrim postPilgrim;
	private BusinessOwner postOwner;

	public BlogPost(float rating, String comment, Date date, Pilgrim pilgrim, BusinessOwner owner) {
		this.postRating = rating;
		this.postComment = comment;
		this.postDate = date;
		this.postPilgrim = pilgrim;
		this.postOwner = owner;
	}
}
