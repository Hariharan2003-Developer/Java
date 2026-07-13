package JavaLearnings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd = new StringDemo();
		String[] Foods = {"Biriyani", "Chicken", "Mutton"};
		sd.joinWords(Foods);
	}

	private void joinWords(String[] foods) {
		// TODO Auto-generated method stub
		String sentence = "";
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Parotta");
		sb2.insert(6, "ahh");
		System.out.println(sb2);
		sb2.replace(0, 3, "har");
		System.out.println(sb2);
		System.out.println(sb2.reverse());
//		for(int i=0; i<foods.length; i++)
//			System.out.println(foods[i]);
		
		for(String food:foods) {
			sb.append(food);
			System.out.println("String Buffer Hashcode " + sb.hashCode());
			sentence = sentence + food;	
			System.out.println(sentence.hashCode());
		}
		
	}

}
