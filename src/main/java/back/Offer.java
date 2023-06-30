public class Offer {
	private BusinessOwner offerIssuer;
	private User offerReceiver;

	public Offer(BusinessOwner offerIssuer, User offerReceiver) {
		this.offerIssuer = offerIssuer;
		this.offerReceiver = offerReceiver;
	}

	public BusinessOwner getOfferIssuer() {
		return offerIssuer;
	}

	public User getOfferReceiver() {
		return offerReceiver;
	}

	public void setOfferReceiver(User offerReceiver) {
		this.offerReceiver = offerReceiver;
	}

	public void setOfferIssuer(BusinessOwner offerIssuer) {
		this.offerIssuer = offerIssuer;
	}

	public void makeOffer() {
		// Implementation for making an offer
	}
}
