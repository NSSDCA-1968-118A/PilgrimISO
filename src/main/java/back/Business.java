public class Business {
	private String businessName;
	private int taxIdentificationNumber;
	private String ownerName;
	private Location businessLocation;
	private String businessType;
	private String businessAddress;
	private float businessRating;

	public Business(String businessName, int taxIdentificationNumber, String businessAddress, String ownerName, float businessRating, Location businessLocation, String businessType) {
		this.businessName = businessName;
		this.taxIdentificationNumber = taxIdentificationNumber;
		this.ownerName = ownerName;
		this.businessRating = businessRating;
		this.businessLocation = businessLocation;
		this.businessType = businessType;
		this.businessAddress = businessAddress;
		
	}

	public void updateRating(float rating) {
		this.businessRating = rating;
	}

	public String getBusinessName() {
		return businessName;
	}

	public int getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public float getBusinessRating() {
		return businessRating;
	}

	public Location getBusinessLocation() {
		return businessLocation;
	}

	public void setBusinessLocation(Location businessLocation) {
		this.businessLocation = businessLocation;
	}

}
