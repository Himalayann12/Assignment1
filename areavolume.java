package intern_project;

public class areavolume {
    //create method getArea
	static int getArea(int length,int breadth) {
    int area= length*breadth;	
    return area;
    }
    //create method volume
	static void volume(int area,int height) {
		int vol = area * height;
		System.out.println("The value of area is:"+area);
		System.out.println("The value of volume is:"+vol);
	}


public static void main(String[] args) {
	
	//define length and breadth
	int length= 5;
	int breadth= 3;
	int height = 7;
	//call method getArea
	int area = getArea(length, breadth);
	
	//calling method volume
	volume(area, height);
}


}
