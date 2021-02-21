public class MyString{

	public static String reverse(String s) {
		String r="";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		return r;
	}

	public static String timeString(int hour, int minute) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12; // midnight
			}
		} else {
			ampm = "PM";
			hour = hour - 12;
		}
		return String.format("%02d:%02d %s", hour, minute, ampm);
	}

	public static void main(String[] args) {

		System.out.print("Roman alphabet: ");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println("\n");
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how toUpperCase works:  \n");
		String title = "Computer Programming 2";
		String upperTitle = title.toUpperCase();
		System.out.println(title);
		System.out.println(upperTitle);
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how replace works:  \n");
		String text = "Computer Science is fun!";
		System.out.println(text);
		text = text.replace("Computer Science", "CS");
		System.out.println(text);
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how to traverse a String:  \n");
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			System.out.println(letter);
		}
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how reverse works:  \n");
		System.out.println(reverse(text));
		System.out.println("*****************************************************************");
		
		System.out.println("Demonstrating how substring works:  \n");
		System.out.println(text.substring(3));
		System.out.println(text.substring(3,5));
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how indexOf works:  \n");
		String university= "Modibbo Adama University of technology";
		System.out.println("university: " + university);

		int index = university.indexOf('a');
		System.out.println("index of \'a\' in university is " + index);

		int index2 = university.indexOf('i', 4);
		System.out.println("index of \'i\' in university starting from 4 is " + index2);
		System.out.println("*****************************************************************");

		System.out.println("Demonstrating how compareTo works:  \n");
		String name1= "John Doe";
		String name2= "Jane Doe";
		int diff = name1.compareTo(name2);
		if (diff == 0) {
			System.out.println("The names are the same.");
		} else if (diff < 0) {
			System.out.println("name1 comes before name2.");
		} else if (diff > 0) {
			System.out.println("name2 comes before name1.");
		}
		System.out.println("*****************************************************************");
	}
}