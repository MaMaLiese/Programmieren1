public class GradingTable {
    public static void main(String[] args) {
        int grade = 3;

        System.out.println(grades(1));
        System.out.println(grades(2));
        System.out.println(grades(grade));
        System.out.println(grades(4));
        System.out.println(grades(5));
    }


        public static String grades (int grade) {
        return switch (grade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            default -> "Fail";
        }; //bei switches  brauch ich zusätzlich default (dh. wenn es nicht 1, 2, 3, 4 oder alles andere ist, nimmt er default "fail")
    }

}
