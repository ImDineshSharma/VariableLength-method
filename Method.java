// you can pass as many arguments as you want the method doesn't care coz i made it work that way.
// using varargs or i call it passing many arguments to the method
// based on those argument it will print the average

public class Average{
  public static void main(String[] args){
    
    System.out.println(average(44,55,33,55,33,55,33,55,22,55,99,33,55,88,66,22,55,66));
    
  }
  
  // method
  // those three dots is what i all mean
  public static int average(int...numbers){
    int total = 0;
    for(int x: numbers)
    total+=x;
    return total / numbers.length;
  }
  
}
