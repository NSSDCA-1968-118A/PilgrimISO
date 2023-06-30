public class DataAccessObjectImpl implements DataAccessObject<Blog>{
	
	@Override
	public Blog fetch(String identifier) {
		return null;
	}

	@Override
	public boolean erase(Blog item) {
		return false;
	}

	@Override
	public boolean modify(Blog item) {
		return false;
	}

	@Override
	public boolean persist(Blog item) {
		return false;
	}

}
