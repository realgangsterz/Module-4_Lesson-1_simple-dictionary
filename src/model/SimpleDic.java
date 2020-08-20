package model;

import java.util.HashMap;
import java.util.Map;

public class SimpleDic {
    Map<String,String> minidic = new HashMap<>();

    public Map<String, String> getMinidic(){
        this.init();
        return minidic;
    }

    private void init() {
        minidic.put("hello","xin chào");
        minidic.put("clock","đồng hồ");
        minidic.put("dictionary","từ điển");
        minidic.put("brigde","cây cầu");
        minidic.put("car","ô tô");
    }
}
