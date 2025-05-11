package derslerr;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) throws IOException  {
Scanner input = new Scanner(System.in);
System.out.print("hangi dosyayı okumak istersiniz emre bey");
String fileName = input.nextLine();
System.out.print("anahtar kelime yazın");
String anahtar = input.nextLine();
dosyaOkuyucu(fileName,anahtar);
	
	
	
	
}
	public static void dosyaOkuyucu(String fileName,String anahtar) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File(fileName));
		while(fileReader.hasNextLine()) {
			String satır = fileReader.nextLine();
			if(satır.contains(anahtar)) {
				System.out.println(satır);
			}
		}
		
	
	}
}