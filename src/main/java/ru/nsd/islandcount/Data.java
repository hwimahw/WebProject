package ru.nsd.islandcount;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Data {
    private int n;
    private int m;
    private String matrix;
    private int result;

    public Data(int n, int m, String matrix, int result){
        this.n = n;
        this.m = m;
        this.matrix = matrix;
        this.result = result;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public String getMatrix() {
        return matrix;
    }

    public int getResult() {
        return result;
    }
    
    public JSONObject dataFromFileToJson() {
        JSONObject jsonMainObject = new JSONObject();
        JSONArray rows = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        int id = 1;
        JSONArray data = new JSONArray();
        data.element(n);
        data.element(m);
        data.element(this.matrix);
        data.element(this.result);
        jsonObject.element("id", id);
        jsonObject.element("data", data);
        rows.element(jsonObject);
        jsonMainObject.element("rows", rows);
        return jsonMainObject;
    }

    public String getJsonString(){
        JSONObject json = dataFromFileToJson();
        return json.toString();
    }







}
