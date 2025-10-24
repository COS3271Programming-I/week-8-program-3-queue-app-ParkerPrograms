package Week_8;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_App {

	public static void main(String[] args) {
		Queue<String> line = new LinkedList<>();
		Queue<String> line2 = new LinkedList<>();
		char let = '@';
		int time = 0;
		int rn;
		String person = "" + let + let + let;
		
		while (time < 40) {
			rn = (int)(Math.random() * 11);
			if ((rn == 1 ) || (rn == 2) || (rn == 3)) {let++; person = "" + let + let + let; line.add(person);}
			if ((rn == 4) || (rn == 5)) {line.poll();}
			if ((rn == 6) || (rn == 7) || (rn == 8)) {let++; person = "" + let + let + let; line2.add(person);}
			if ((rn == 9) || (rn == 10)) {line2.poll();}
			System.out.println("Time " + time + " : " + "Line 1 : " + line);
			System.out.println("Time " + time + " : " + "Line 2 : " + line2);
			System.out.println();
			time++;
		}
		
	}
}
