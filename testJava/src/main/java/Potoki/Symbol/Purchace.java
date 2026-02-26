package Potoki.Symbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Purchace {
        private String name;
        private int cost;
        private double count;

        public Purchace(String name, int cost, double count) {
            this.name = name;
            this.cost = cost;
            this.count = count;
        }

        public Purchace() {
        }

        public int getCost() {
            return cost;
        }

        public double getCount() {
            return count;
        }

        @Override
        public String toString() {
            return name + "#" + cost + "#" + count;
        }
    }
