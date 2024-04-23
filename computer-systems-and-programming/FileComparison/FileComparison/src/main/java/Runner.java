import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
            String expectedData = "Hello, world!!!!?";
            Class clazz = Runner.class;
            InputStream inputStream = clazz.getResourceAsStream("fileTest.txt");
            String data = readFromInputStream(inputStream);
            System.out.println(data);
            int counter=300;
            HashMap<Integer, String> encoding = new HashMap<>();
            int l=0;
            int r;
            StringBuilder result= new StringBuilder();
            while(l<data.length()-1){
                if(Character.isLetter(data.charAt(l))){
                    r=l+1;
                    while(Character.isLetter(data.charAt(r))){
                        r++;
                    }
                    result.append(data.substring(l,r));
                    result.append(" ");
                    encoding.put(counter,data.substring(l,r));
                    counter++;
                    l=r-1;
                }else{
                    do{

                    result.append((int)data.charAt(l));
                    result.append(" ");
                    l++;}
                    while ( l < data.length()-1 && !Character.isLetter( data.charAt(l)));
                    l--;
                }
                l++;
            }
        System.out.println(result);




        try {
            File myObj = new File("output.sc");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("output.sc");
            for (Map.Entry<Integer, String> j: encoding.entrySet()){
                myWriter.write(j.getKey()+" = "+ j.getValue()+"\n"); }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
