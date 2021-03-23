package Office_2_MovieProject;

public class Runner {

	public static void main(String[] args) {
	//  2. Create another class: Runner and do the followings
	//  Create main method
	//  Create 3 Movie objects and assign values of your choice.
		
	//  Example:
	//  Movie name=starWars
	//  duration=120
	//  isGood=true
	//  And print the movie info
		
		Movie starWars = new Movie();
		starWars.duration=120;
		starWars.setName("Star Wars");
		starWars.isGood=true;
		starWars.movieInfo();
		starWars.shortOrLong();
		System.out.println("-------------------------------");
		Movie braveHeart = new Movie();
		starWars.duration=98;
		starWars.setName("Brave Heart");
		starWars.isGood=true;
		starWars.movieInfo();
		starWars.shortOrLong();
		System.out.println("-------------------------------");
		Movie titanic = new Movie();
		starWars.duration=108;
		starWars.setName("Titanic");
		starWars.isGood=false;
		starWars.movieInfo();
		starWars.shortOrLong();

	}

}
