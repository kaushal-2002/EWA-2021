/* 
 * 1. To read the content from a file and store it inside an ArrayList 
 2. Perform some basic operations/manipulation 
 i. display all the words
 ii. display only the words that endswith 's'
 iii. display the last index value of a duplicate word
 iv. display all the words in reverse order
 v. Then display them with all plural words removed and the size of updated list.
*/
package ArrayListPrograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileListOperations {

	public static void main(String[] args)throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\CollectionsAPI\\src\\ArrayListPrograms", "dummy.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			String temp = sc.next();
			
			// store the string inside list
			
			list.add(temp);
		}
		
		for(String data: list) {
			System.out.println(data);
		}
		
		System.out.println("Size of the list is: "+list.size());
	}

}
