package TV;

public class NetflixState implements State{
	TV tv;
	// buttons change state or print message
	public void pressHomeButton()
	{
		System.out.print("Loading the Home Screen...");
		tv.setState(tv.getHomeState());
	}
	public void pressNetflixButton()
	{
		System.out.print("We are already in Netflix");
	}
	public void pressHuluButton()
	{
		System.out.print("Loading Hulu...");
	tv.setState(tv.getHuluState());
	}
	// print list of movies
	public void pressMovieButton()
	{
		String [] listM = {"Karate Kid","Home alone 3","Picture Perfect","Joker","The First Avernger"};
		for(int i = 0; i <3; i++) {
			System.out.println(listM[i]);
		}
	}
	// print list of tv shows
	public void pressTVButton()
	{
		String [] listM = {"Cobra kai","The Crown","Criminal Minds","Breaking Bad","NCIS"};
		for(int i = 0; i <3; i++) {
			System.out.println(listM[i]);
		}
	}
}
