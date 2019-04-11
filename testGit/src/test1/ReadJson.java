package test1;


import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
 

public class ReadJson {	

    public static void main(String args[]){
    	
        JsonParser parse =new JsonParser();  //创建json解析器
        
        try {
            JsonObject json=(JsonObject) parse.parse(new FileReader("./china.json"));  //创建jsonObject对象
            
            JsonArray features = json.get("features").getAsJsonArray();
            
            for (JsonElement all : features) {
            	  JsonObject geometry = all.getAsJsonObject();
                  JsonObject properties = geometry.get("properties").getAsJsonObject();

                  String name = properties.get("name").getAsString();
                  JsonArray cp = properties.get("cp").getAsJsonArray();
                  
                  System.out.println(name);
                  System.out.println(cp);
			}

        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
		
	
}
