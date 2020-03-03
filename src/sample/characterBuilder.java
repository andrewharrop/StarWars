package sample;

import com.sun.javafx.beans.event.AbstractNotifyListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class characterBuilder {
   //implement a generic method to add items
   String message;
    Boolean fileCreated;
    File file;

    private void createProfile(String name) throws IOException {
        file = new File(name+".txt");
        if(file.createNewFile()){
            message = "File for " + name + "Created";
            fileCreated = true;
        }else{
            message = "File for " + name + " already exists";
            fileCreated = false;
        }
    }
    characterBuilder(String name, LinkedList<String> properties) throws IOException {
        createProfile(name);
        if(fileCreated){
            FileWriter write = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(write);
            for (String property:properties) {
                br.write(property);
                br.newLine();
            }
            write.close();
            br.close();
        }
    }




}
