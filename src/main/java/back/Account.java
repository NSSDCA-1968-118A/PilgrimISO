public class Account {
	private String accessKey;
	private String userRole;
	private String accountName;
	private String emailAddress;

	public Account(String accountName, String emailAddress, String accessKey, String userRole) {
		this.accountName = accountName;
		this.emailAddress = emailAddress;
		this.accessKey = accessKey;
		this.userRole = userRole;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", emailAddress=" + emailAddress + ", accessKey=" + accessKey
				+ ", userRole=" + userRole + "]";
	}
}
