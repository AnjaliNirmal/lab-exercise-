public class SplitExample{  
public static void main(String args[]){  
String s1="hii I'm anjali and my hobbies are dancing singing sketching story writing story telling and many more thing I love to do that's why I never get board .thank you.";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}