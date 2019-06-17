class TwoDShape1 { 
  private double width;  // these are 
  private double height; // now private  
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  String style; 
   
  double area() { 
    return width * height / 2; // Error! can't access 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
}