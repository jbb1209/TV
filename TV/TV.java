package TV;


public class TV {
	
	State HomeState;
	State NetflixState;
	State HuluState;
	State state;
	public State getHomeState() {
		return HomeState;
	}
	public State getNetflixState() {
		return NetflixState;
	}
	public State getHuluState() {
		return HuluState;
	}
	public void setState(State state) {
		this.state = state;
	}
	TV()
	{
		this.HomeState = new HomeState();
		this.NetflixState = new NetflixState();
		this.HuluState = new HuluState();
		setState(HomeState);
	}
public void pressHomeButton()
{
	state.pressHomeButton();
}
public void pressNetflixButton()
{
	state.pressNetflixButton();
}
public void pressHuluButton()
{
	state.pressHuluButton();
}
public void pressMovieButton()
{
	state.pressMovieButton();
}
public void pressTVButton()
{
	state.pressTVButton();
}

}
