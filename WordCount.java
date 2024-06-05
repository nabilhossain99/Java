import java.util.*;
import java.io.*;
public class WordCount
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f = new FileInputStream("I:\\wordcount.txt");
        Scanner fileInput = new Scanner(f);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        while(fileInput.hasNext()) 
        {
            String nextWord = fileInput.next();
            if(words.contains(nextWord))
            {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            }
            else
            {
                words.add(nextWord);
                count.add(1);
            }
            
        }
        fileInput.close();
        f.close();
        System.out.println("WORDS COUNT");
        for(int i = 0; i < words.size(); i++)
        {
            System.out.print(words.get(i) + "      " + count.get(i) + "\n");
        }
       
    }
}