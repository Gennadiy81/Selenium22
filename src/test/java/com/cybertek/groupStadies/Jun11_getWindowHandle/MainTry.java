package com.cybertek.groupStadies.Jun11_getWindowHandle;

public class MainTry {
    public static void main(String[] args) {
        System.out.println("1");
        AA.main(args);
        BB.main(args);

    }
}
class AA extends MainTry {
    public static void main(String[] args) {
        System.out.println("2");
    }
}
    class BB extends AA {
        public static void main(String[] args) {
            System.out.println("3");
        }
    }
