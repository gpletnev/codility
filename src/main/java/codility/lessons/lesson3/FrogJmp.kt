package codility.lessons.lesson3;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int jumps = (Y - X) / D;

        return (Y - X) % D != 0 ? jumps + 1 : jumps;
    }
}
