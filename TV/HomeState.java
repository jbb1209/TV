package TV;

public class HomeState implements State {
	TV tv;
	// changes state or prints message
	public void pressHomeButton()
	{
		System.out.print("TV is already on the home screen");
	}
	public void pressNetflixButton()
	{
		System.out.print("Loading Netflix..., and change state");
		tv.setState(tv.getNetflixState());
		
	}
	public void pressHuluButton()
	{
		System.out.print("Loading Hulu..., and change state");
		tv.setState(tv.getHuluState());
		
	}
	public void pressMovieButton()
	{
		System.out.print("Home: You must pick an app to show movies.");
	}
	public void pressTVButton()
	{
		System.out.print("Home: You mut pick an app to show tv shows.");
	}
	}

