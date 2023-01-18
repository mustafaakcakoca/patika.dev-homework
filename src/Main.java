public class Main {
        public static void main(String[] args) {
            Fighter f1 = new Fighter ("Alex",10,100,90);
            Fighter f2 = new Fighter ("Ryu",10,100,80);

            Match match = new Match(f1,f2,80,100);

            match.run();
        }
    }
