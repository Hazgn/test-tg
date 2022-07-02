public class test {
    public static void main(String args[]) {

        // 1
        int x = 3;
        for (int i = 0; i < 7; i++) {
            if (i % x == 1) {
                System.out.print('x');
            } else {
                System.out.print('y');
            }
        }

        System.out.println('\n');

        // 2
        int y = 4;
        int z = -1;
        int output = 0;
        do {
            System.out.print(output);
            output++;
            z++;
        } while (z <= y);

        System.out.println('\n');

        // 3
        int i = 0;
        while (i < 9) {
            i += 1;
            if (i % 2 == 0) {
                System.out.print("in ");
            } else {
                System.out.print("out ");
            }
        }

        System.out.println('\n');

        // 4
        int output2 = 10;
        int x2 = 16;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 2; k++) {
                output2 += 2;
            }
            output2 += x2;
        }
        System.out.println(output2);

        System.out.print('\n');

        // 5
        int numX = 100;
        int numY = 100;
        int total = mysteryNum(numX, numY, 0);
        System.out.println(total);

        System.out.print('\n');

        // 6
        int x3 = 10;
        int y3 = 3;

        if (x3 % y3 == 2)
            System.out.print("two");
        System.out.print(x3 % y3);
        if (x3 % y3 == 1)
            System.out.print("one");

        System.out.println("\n");

        // 7
        System.out.println(mysteryNum2(10, 9));

        System.out.println("\n");

        // 8
        int aa = 12;
        int bb = 13;
        int cc = 14;
        int dd = 15;

        boolean isBool = false;
        if (aa++ < ++bb - ++aa / 2 + dd-- / 2 && dd++ * --bb / 3 > cc++ + aa++) {
            System.out.print("afternoon ");

            aa += bb++ / 2 - aa++;
            dd -= --dd + dd / cc / 2;
            if (!isBool || aa++ + bb < cc++ + dd) {
                System.out.println(aa + dd + " masuk " + bb + cc);
            } else {
                System.out.println("night");
            }
        } else {
            System.out.println("afternoon");
        }

        System.out.print("\n");

        // 16
        System.out.println(methodA(16, 25));

        // 17
        System.out.print("\n");

        System.out.println(checkTest("test check", 1));

        System.out.print("\n");
        // 18

        System.out.println(count(81));
    }

    public static int mysteryNum(int x, int y, int total) {
        System.out.println(x + " " + y + "" + total);
        if (x == 0) {
            return total;
        } else {
            if (x % 2 == 1) {
                return mysteryNum(x / 2, y * 2, total);
            } else {
                return mysteryNum(x / 2, y * 2, total);
            }
        }
    }

    public static int mysteryNum2(int m, int n) {
        m = 6;
        n = 4;
        int o = 0;

        while (m > n) {
            m--;
            n += 2;
            o += m + n;
        }
        return o;
    }

    public static int methodA(int a, int b) {
        return a * b / methodB(a, b);
    }

    public static int methodB(int a, int b) {
        if (b == 0)
            return a;
        return methodB(b, a % b);
    }

    public static int checkTest(String s, int last) {
        if (last < 0) {
            return 0;
        }
        if (s.charAt(last) == '0') {
            return 2 * checkTest(s, last - 1);
        }
        return 2 * checkTest(s, last - 1) + 1;
        // choose one, all results are the same
        // return 1 + 2 * checkTest(s, last - 1);
    }

    public static int count(int x) {
        if (x <= 1)
            return x;
        return count(x, x / 2);
    }

    private static int count(int x, int y) {
        if (x <= 1) {
            return x;
        }
        if (y > x / y) {
            int z = ((x / y) + y) / 2;
            return count(x, z);
        } else {
            return y;
        }
    }
}