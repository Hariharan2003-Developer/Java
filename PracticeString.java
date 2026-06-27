class PracticeString{

public static void main(String[] args){

String food = "Biriyani";

System.out.println(food);

System.out.println("The Length of the Food is: " + food.length());

System.out.println(food.toUpperCase());

System.out.println(food.toLowerCase());


System.out.println(food.indexOf('a'));


System.out.println(food.charAt(5));

String result = food.substring(0,4);

System.out.println(result);


String result2 = food.substring(3);

System.out.println(result2);


System.out.println(food.charAt(7));


String breakfast = "Idly";

String Dinner = "Idly";

System.out.println(breakfast.equals(Dinner));


String txt = "   Hello World   ";
System.out.println("Before: [" + txt + "]");
System.out.println("After:  [" + txt.trim() + "]");


String firstName = "Hariharan";
String lastName = "Sivasankar";
System.out.println(firstName + " " + lastName);

System.out.println(firstName + "" + lastName);

System.out.println("".length());
System.out.println(" ".length());


}




}
