import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Demo {
    public static void main(String[] args) {
        String name ;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            name = reader.readLine();
             System.out.println("hello world");
        System.out.println("good name : "+capitaliseName(name));


        }catch(IOException e){
            e.printStackTrace();
        }

      
    }
    static String capitaliseName(String name){
        
        StringBuilder temp = new StringBuilder("");

        String[] nameArr = name.split(" ");

       for(int i=0 ;i<nameArr.length;i++){
        temp.append(nameArr[i].substring(0, 1).toUpperCase());
        temp.append(nameArr[i].substring(1, nameArr[i].length()));
      if(i==nameArr.length)
        {
             continue;
        }else{
        temp.append(" ");
        }
    }

        return temp.toString();
    }
}