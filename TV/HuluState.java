package TV;

public class HuluState implements State{
	TV tv;
	// buttons change state or message
	public void pressHomeButton()
	{
		
		System.out.print("Loading the Home Screen...");
		tv.setState(tv.getHomeState());
	}
	public void pressNetflixButton()
	{
		System.out.print("Loading Netflix...");
		tv.setState(tv.getNetflixState());
		
	}
	public void pressHuluButton()
	{
		System.out.print("We are already in Hulu");
		
	}
	// prints movies
	public void pressMovieButton()
	{
		String [] listM = {"KungFu Panda","Snow Piercer","I Am Legend","Dredd","Predator"};
		for(int i = 0; i <3; i++) {
			System.out.println(listM[i]);
		}
	}
	// prints tv shows
	public void pressTVButton()
	{
		String [] listM = {"Archer","Mayans","Family Matters","Phil of the Future","Gumball"};
		for(int i = 0; i <3; i++) {
			System.out.println(listM[i]);
		}
	}
}
