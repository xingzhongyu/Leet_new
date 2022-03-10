package leet535;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
}

class Codec {

    // Encodes a URL to a shortened URL.
    Map<String,String> map=new HashMap<>();
    Random random=new Random();
    public String encode(String longUrl) {
        int key=random.nextInt();
        while (map.containsKey(String.valueOf(key))){
            key= random.nextInt();
        }
        map.put(String.valueOf(key),longUrl);
        return String.valueOf(key);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}