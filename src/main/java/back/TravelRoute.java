public class TravelRoute {
	TravelStage[] travelStages;
	Integer routeDifficulty;
	Date routeStartDate;
	String routeTime;

	public TravelRoute(TravelStage[] travelStages, Integer routeDifficulty, Date routeStartDate, String routeTime) {
		this.travelStages = travelStages;
		this.routeDifficulty = routeDifficulty;
		this.routeStartDate = routeStartDate;
		this.routeTime = routeTime;
	}

	public Date getRouteStartDate() {
		return routeStartDate;
	}

	public void setRouteStartDate(Date routeStartDate) {
		this.routeStartDate = routeStartDate;
	}

	public TravelStage[] getTravelStages() {
		return travelStages;
	}

	public Integer getRouteDifficulty() {
		return routeDifficulty;
	}

	public String getRouteTime() {
		return routeTime;
	}

	public void addTravelStage(TravelStage[] travelStages, int index, TravelStage travelStage) {
		travelStages[index] = travelStage;
	}

	public void removeTravelStage(TravelStage[] travelStages, int index) {
		travelStages[index] = null;
	}
}
