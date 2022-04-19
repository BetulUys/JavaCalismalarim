package Java_Calismalarim;

public class C02 {
        static boolean asal_mi = true;
        static int input = 0;
        static int i=0;
        static int bolen;
        static int ebasal=2;

        public static void main(String[] args) {
            input = 50;
            carpanlaribulma(input);

        }

        private static void carpanlaribulma(int input) {


            for (int i = 2; i <= input; i++) {
                if (input % i == 0) {
                    bolen=i;
                    asalbolen(bolen);
                    if (asal_mi) {
                        ebasal = bolen;
                    }
                }

            }
            System.out.println(ebasal);
        }

        private static boolean asalbolen(int bolen) {
            for (int j = 2; j < bolen; j++) {
                if (i % bolen != 0) {
                    asal_mi = false;
                    break;
                }
            }
            return asal_mi;
        }
    }



