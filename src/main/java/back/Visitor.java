public class Visitor {
	String visitorName;
	Date dateOfBirth;
	boolean acceptsOffers;

	public Visitor(String visitorName, Date dateOfBirth, boolean acceptsOffers) {
		this.visitorName = visitorName;
		this.dateOfBirth = dateOfBirth;
		this.acceptsOffers = acceptsOffers;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public boolean acceptsOffers() {
		return acceptsOffers;
	}
}
