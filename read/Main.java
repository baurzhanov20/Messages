import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> messages = new ArrayList<>();

		while(true){
			System.out.println("[1] ADD MESSAGE");
			System.out.println("[2] READ MESSAGE");
			System.out.println("[3] EXIT");
			int choice = sc.nextInt();

			if(choice==1){
				String message = sc.next();
				messages.add(message);
				addMessage(messages);

			}else if(choice==2){
				printMessagesFromTxt();
			}
		}	

	}

	public static void addMessage(ArrayList<String> messages){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
			for(int i =0;i<messages.size();i++){
				bw.write(messages.get(i)+"\n");
			}
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void printMessagesFromTxt(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			String s = "";
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}