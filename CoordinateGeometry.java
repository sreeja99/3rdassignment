package geometry;

public class uceCaseFour {
	public void compareTo(double x,double y){
	   Double length1=new Double(x);
	   Double length2=new Double(y);
	   boolean CompareLengthOne = length1.equals(length2);
       if(CompareLengthOne) {
       	System.out.println("Both the Lines are Equal");
       }
       else {
       	System.out.println("Both Lines are not Equal");
       }
	} 
	public void equals(double a,double b) {
	   Double length1=new Double(a);
	   Double length2=new Double(b);
	   int compareLines =  length1.compareTo(length2);
       if(compareLines >0) {
       	System.out.println("Length of the First Line is greater than the Second");
       }
       else if(compareLines<0) {
       	System.out.println("Length of the Second Line is greater than the first");
       }
       else {
       	System.out.println("Both Lines are Equal");
       }
	}
	public static void main(String[] args) {
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
        uceCaseFour coGeo = new uceCaseFour();
        coGeo.compareTo(lengthOne,lengthTwo);
        coGeo.equals(lengthOne,lengthTwo);
	}

}
