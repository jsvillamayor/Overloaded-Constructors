
public class Main {

	public static void main(String[] args) {
		
		Pizza myPizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
		Pizza myPizza1 = new Pizza("thicc crust", "tomato", "mozzerella");
		System.out.println("Here are the ingredients to your pizza:");
		System.out.println(myPizza.bread);
		System.out.println(myPizza.sauce);
		System.out.println(myPizza.cheese);
		System.out.println(myPizza.topping);
		System.out.println("Here are the ingredients to your pizza:");
		System.out.println(myPizza1.bread);
		System.out.println(myPizza1.sauce);
		System.out.println(myPizza1.cheese);
		
	}

}
