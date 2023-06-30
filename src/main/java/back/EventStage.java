public class EventStage {
	String location;
	Date startDate;
	String duration;
	Float length;
	Integer difficulty;

	public EventStage(String location, Date startDate, String duration, Float length, Integer difficulty) {
		this.location = location;
		this.startDate = startDate;
		this.duration = duration;
		this.length = length;
		this.difficulty = difficulty;
	}

	public String getLocation() {
		return location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getDuration() {
		return duration;
	}

	public Float getLength() {
		return length;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}

