public class Day03_if_switch {
    public static void main(String[] arg) {
        int score = 81;
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
            }

        int score1 = score/10;
        switch (score1) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("error");
                break;
        }

    }

}
