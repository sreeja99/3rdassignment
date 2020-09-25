package geometry;

public class coorGeo {

	public static void main(String[] args) {
        int x1 = (int)(Math.floor(Math.random()*10));
        int y1 = (int)(Math.floor(Math.random()*10));
        int x2 = (int)(Math.floor(Math.random()*10));
        int y2 = (int)(Math.floor(Math.random()*10));
        int sumOfSqrs = ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
        System.out.println("Point 1:"+x1+","+y1);
        System.out.println("Point 2:"+x2+","+y2);
        System.out.println("Length of the Line:"+Math.sqrt(sumOfSqrs));
	}

}
