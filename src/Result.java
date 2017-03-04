/*Create a student result processing system.*/
/* class name */
public class Result {
	/* variable declare */
	private int percent;
	private String name;
	private int rank;

	/* constructor declare */
	public Result() {
		System.out.println("Student report system"); // output

	}

	/* get method */
	public int getPercent() {
		return percent;
	}

	public String getName() { // get method
		return name;
	}

	public int getrank() { // get method
		return rank;
	}

	/* set method */
	public void setPercent(int newvalue) {
		percent = newvalue;
	}

	public void setName(String newvalue) { // set method
		name = newvalue;
	}

	public void setRank(int newvalue) { // set method
		rank = newvalue;
	}

	public static class ResultOut { // method
		/* main method */
		public static void main(String[] args) {
			/* object creating */
			Result obj = new Result();
			Result obj1 = new Result();
			Result obj2 = new Result();
			/* calling set method */
			obj.setName("Ram");
			obj.setRank(1);
			obj.setPercent(90);
			obj1.setName("Tina");
			obj1.setRank(2);
			obj1.setPercent(89);
			obj2.setName("Kamal");
			obj2.setRank(3);
			obj2.setPercent(85);
			System.out.println("Name\t" + obj.getName()); // output
			System.out.println("rank\t" + obj.getrank()); // output
			System.out.println("percent\t" + obj.getPercent()); // output
			System.out.println("Name\t" + obj1.getName());
			System.out.println("rank\t" + obj1.getrank()); // output
			System.out.println("percent\t" + obj1.getPercent()); // output
			System.out.println("Name\t" + obj2.getName());// output
			System.out.println("rank\t" + obj2.getrank());// output
			System.out.println("percent\t" + obj2.getPercent());// output

		}

	}

}
