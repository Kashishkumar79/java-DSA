public class ShortestPath {

    public static float shortestPath(String direction) {
        int x = 0, y = 0;

        for (int i = 0; i < direction.length(); i++) {
            char move = direction.charAt(i);

            if (move == 'N') {
                y++;
            } else if (move == 'S') {
                y--;
            } else if (move == 'E') {
                x++;
            } else if (move == 'W') {
                x--;
            } else {
                System.out.println("Invalid Direction: " + move);
            }
        }

        return (float)Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String direction = "WNEENSENNN";
        System.out.println("Shortest Path: " + shortestPath(direction));
    }
}