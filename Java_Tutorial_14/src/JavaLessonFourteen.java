
public class JavaLessonFourteen {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.favFood);
		System.out.println(genericAnimal.getName());
		breaker.dot();
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		breaker.dot();
		
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		
		acceptAnimal(tabby);
		
	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		randAnimal.walkAround();
		
		Cats tempCat = (Cats) randAnimal;
		System.out.println(tempCat.favToy);
		
		if(randAnimal instanceof Cats)
		{
			System.out.println(randAnimal.getName() + " is a Cat");
		}
		
		breaker.dot();	
	}

}
