package geometry;

public class useCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		    int x1 = (int)(Math.floor(Math.random()*10));
	        int y1 = (int)(Math.floor(Math.random()*10));
	        int x2 = (int)(Math.floor(Math.random()*10));
	        int y2 = (int)(Math.floor(Math.random()*10));
	        int x3 = (int)(Math.floor(Math.random()*10));
	        int x4 = (int)(Math.floor(Math.random()*10));
	        int y3 = (int)(Math.floor(Math.random()*10));
	        int y4 = (int)(Math.floor(Math.random()*10));
	        //computation
	        int sumOfSqrs = ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
	        int sumOfSqrsTwo = ((x3-x4)*(x3-x4))+((y3-y4)*(y3-y4));
	        double lengthOne=Math.sqrt(sumOfSqrs);
	        double lengthTwo=Math.sqrt(sumOfSqrsTwo);
	        Double length1 = new Double(lengthOne);
	        Double length2 = new Double(lengthTwo);
	        System.out.println(length1.equals(length2));
	        boolean CompareLengthOne = length1.equals(length2);
	        if(CompareLengthOne) {
	        	System.out.println("Both the Lines are Equal");
	        }
	        else {
	        	System.out.println("Both Lines are not Equal");
	        }
	        
	        
		    

	}

}
