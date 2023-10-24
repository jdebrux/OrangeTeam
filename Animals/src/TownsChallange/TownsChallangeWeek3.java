package Animals.src.TownsChallange;
import Animals.src.towns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TownsChallangeWeek3 {
    class towns{
        public String name;
        public String county;

        public towns(String name, String county) {
            this.name = name;
            this.county = county;
        }

        public String getName() {
            return name;
        }

        public String getCounty() {
            return county;
        }

        @Override public String toString()
        {
            return "Customer{"
                    + "Name=" + name + ", County=" + county + '}';
        }
    }


}

