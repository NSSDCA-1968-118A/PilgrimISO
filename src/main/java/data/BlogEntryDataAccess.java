public class BlogEntryDataAccess implements DataAccessor<BlogEntry> {

	@Override
	public BlogEntry retrieve(String identifier) {
		return null;
	}

	@Override
	public boolean remove(BlogEntry entry) {
		return false;
	}

	@Override
	public boolean modify(BlogEntry entry) {
		return false;
	}

	@Override
	public boolean store(BlogEntry entry) {
		return false;
	}

}
