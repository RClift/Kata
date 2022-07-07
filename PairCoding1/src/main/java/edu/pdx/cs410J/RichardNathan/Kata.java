package edu.pdx.cs410J.RichardNathan;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    Kata temp = new Kata;
    System.out.println(temp.compute("3003"));
  }

  public string compute(String arg){
    String return_string = "";
    Integer num = Integer.parseInt(arg);
    if(num % 3 == 0){
      return_string += "Foo";
    }
    if(num % 5 == 0){
      return_string += "Bar";
    }
    if(num % 7 == 0){
      return_string += "Qix";
    }
    for(int i = 0; i < arg.length; i++){
      if(arg.charAt(i) == '3'){
        return_string += "Foo";
      }else if(arg.charAt(i) == '5'){
        return_string += "Bar";
      }else if(arg.charAt(i) == '7'){
        return_string += "Qix";
      }else if(arg.charAt(i) == '0'){
        return_string += "*";
      }
    }
    if(return_String == ""){
      for(int i = 0; i < arg.length; i++) {
        if(arg.charAt(i) == '0'){
          return_string += "*";
        }else{
          return_string += arg.charAt(i);
        }
      }
    }
    return return_string;
  }
}