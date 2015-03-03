public class Rectangle{

 private double width;
 private double height;

 public Rectangle( double w, double h){
	 width = w;
	 height = h;
 
 	changeHeight(h);
 }
 
 public double getArea(){
	 return width*height;
 }
 
 public double changeHeight(double h){
	 height = h;
	return height;
	 
 }
 public double changeWidth(double w){
	 width = w;
	 return width;
 }
}
// get area
// change width
// change height