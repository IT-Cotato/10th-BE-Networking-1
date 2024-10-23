package com.gildedrose.rules;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class LogicFactory {
    public static Map<String, Logic> logics=new HashMap<String, Logic>();

    public LogicFactory(){
        logics.put("Common", new CommonLogic());
        logics.put("Aged Brie", new AgedBrieLogic());
        logics.put("Backstage passes to a TAFKAL80ETC concert", new BackStagePassesLogic());
        logics.put("Sulfuras, Hand of Ragnaros", new SulfurasLogic());
        logics.put("Conjured", new ConjuredLogic());
    }

    public Logic getLogic(Item item){
        if(logics.containsKey(item.name)){
            return logics.get(item.name);
        } else if (item.name.contains("Conjured")) {
            return logics.get("Conjured");
        }
        else{
            return logics.get("Common");
        }
    }

}
