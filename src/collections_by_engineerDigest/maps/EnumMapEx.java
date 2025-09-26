package collections_by_engineerDigest.maps;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapEx {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY , "GYM ");
        System.out.println(Day.TUESDAY.ordinal());
    }

}

enum Day{MONDAY , TUESDAY , WEDNESDAY , THURDSDAY , FRIDAY , SATURDAY , SUNDAY  }