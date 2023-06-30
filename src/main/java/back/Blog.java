public class Blog {
	private String blogOwner;
	private Photos[] blogGallery;
	private String blogRouteName;

	public Blog(String owner, Photos[] gallery, String routeName) {
		this.blogOwner = owner;
		this.blogGallery = gallery;
		this.blogRouteName = routeName;
	}

	public String getBlogOwner() {
		return blogOwner;
	}

	public void setBlogOwner(String owner) {
		this.blogOwner = owner;
	}

	public Photos[] getBlogGallery() {
		return blogGallery;
	}

	public void setBlogGallery(Photos[] gallery) {
		this.blogGallery = gallery;
	}

	public String getBlogRouteName() {
		return blogRouteName;
	}

	public void setBlogRouteName(String routeName) {
		this.blogRouteName = routeName;
	}

	public void addPhoto(Photos[] gallery) {
		this.blogGallery = gallery;
	}

	public void deletePhoto(Photos[] gallery) {
		this.blogGallery = gallery;
	}

	public void addEntry(Photos[] gallery) {
		this.blogGallery = gallery;
	}

	public void deleteEntry(Photos[] gallery) {
		this.blogGallery = gallery;
	}
}