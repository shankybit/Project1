public class Overidd{
	public static void main(String[] args){
		Square sq = new Square();
        sq.show();
	}	
}

class Rectangle{

    public void show(){
        System.out.println("Rectangle");
    }
}
class Square extends Rectangle{

    public void show(){
        System.out.println("Square");
    }
}