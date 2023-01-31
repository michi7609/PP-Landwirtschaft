package com.jochengehtab.projektprsentationlandwirtschaft;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Json {

    private final Context context;

    /**
     * @param context The {@link Context}
     */
    public Json(Context context) {
        this.context = context;
    }

    public void set(String fileName, int input){
        File file = new File(context.getFilesDir(), fileName);

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("textSize", input);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(file.getPath());
            fileWriter.write(jsonObject.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int get(String fileName){
        File file = new File(context.getFilesDir(), fileName);

        if (!file.exists()){
            file = new File(context.getFilesDir(), fileName);
            set(fileName, 12);
        }

        FileReader fileReader;

        String response = null;
        int result = 2;

        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null){
                stringBuilder.append(line).append("\n");
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            response = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            JSONObject jsonObject  = new JSONObject(response);
            result = jsonObject.getInt("textSize");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}