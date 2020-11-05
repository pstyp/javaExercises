package examPackage;

public class Exam {
	static int chemistry;
	static int biology;
    static int physics;
    static int total;
    static int percentage;
    public static int addMarks() {
    	total = biology+chemistry+physics;
    	return total;
    }
    
	public static void main(String[] args) {
		physics = 56;
		chemistry = 92;
		biology = 130;
		total=(physics+chemistry+biology);
		percentage=total*100/450;
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " +biology);
		System.out.println("Total: " +total);
		System.out.println("Percentage" +percentage);
		if(percentage<60) {
	            System.out.println("Fail");
	        } else {
	            System.out.println("Pass");
	        }
}

}

