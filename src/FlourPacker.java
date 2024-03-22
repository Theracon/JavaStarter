public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount == 0) {
            for (int i = 1; i <= smallCount; i++) {
                if (i % goal == 0) {
                    return true;
                }
            }
        }

        if (smallCount == 0) {
            for (int i = 5; i <= (bigCount * 5); i += 5) {
                if (i % goal == 0) {
                    return true;
                }
            }
        }

        for (int i = 5; i <= (bigCount * 5); i += 5) {
            for (int j = 0; j <= smallCount; j++) {
                int currentWeight = i + j;
                if (currentWeight % goal == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
