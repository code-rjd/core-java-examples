public class RecordPatterExample {
    public static void main(String[] args) {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = null;

        System.out.println(describePoint(point1));
        System.out.println(describePoint(point2));
        System.out.println(describePoint(point3));
        System.out.println(describePoint(new Object()));
    }

    private static String describePoint(Object point) {
            String description = null;
            switch (point) {
                case Point(int x, int y) when x == 0 && y == 0 -> description = "origin point";
                case Point(int x, int y) -> description = "Point at (" + x + "," + y + " )";
                case null -> description = "null";
                default -> throw new IllegalStateException("Unexpected value: " + point);
            }
            return description;

//        return switch (point) {
//            case Point(int x, int y) when x == 0 && y == 0 -> "origin point";
//            case Point(int x, int y) -> "Point at (" + x + "," + y + " )";
//            case null -> "null";
//            default -> throw new IllegalStateException("Unexpected value: " + point);
//        };
    }
}