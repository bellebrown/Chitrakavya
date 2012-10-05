package tagger;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
import edu.stanford.nlp.tagger.maxent.*;

public class Translate {

    //Create a map between Sanskirt word and its meaning.
    HashMap<String, String> Dictionary;

    public String getStringData(InputStream in) {

        int readbyte;
        BufferedInputStream input = new BufferedInputStream(in);
        byte byteArray[] = new byte[1024];
        String data = "";
        try {
            while ((readbyte = input.read(byteArray)) != -1) {
                data = data + new String(byteArray).substring(0, readbyte);
            }
            input.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return data;
    }

    public void populateDictionary(String FileName) {
        BufferedInputStream bin = null;
        try {
            File file = new File(FileName);
            bin = new BufferedInputStream(new FileInputStream(file));
            String meaning = getStringData(bin);
            String lines[] = meaning.split("\n");
            Dictionary = new HashMap<String, String>();
            for (String line : lines) {
                String data[] = line.split("=");
                Dictionary.put(data[0].trim(), data[1].trim());
            }
            bin.close();
        } catch (Exception ex) {
            System.err.println(ex);
        } 
    }

    public String translate(String sanskritText) {
        String[] words = sanskritText.split(" ");
        String result = "";
        for (String word : words) {
            String re = "processing word " + word;
            if (Dictionary.containsKey(word)) {
                result += Dictionary.get(word);
                result += " ";
            } else {
                result += word + " ";
            }
        }
        return result;
    }

    public String tagText(String englishText) {
        try {
            String result = "";
            result = MaxentTagger.tagString(englishText);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Couldn't Tag!";
        }
    }
}
