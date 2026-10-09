public class T01E04Horario {
        public static void main(String[] args) {
        System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s\n", "", "L", "M", "X", "J", "V");
        System.out.printf("%-7s\033[38;5;52m%-7s\033[0m%-7s%-7s%-7s%-7s\n", "15:15", "PROG", "HE", "HE", "", "");
        System.out.printf("%-7s\033[38;5;52m%-7s\033[0m%-7s%-7s%-7s%-7s\n", "16:15", "PROG", "HE", "HE", "", "");
        System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s\n", "17:15", "POO", "", "POO", "", "");
        System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s\n", "18:30", "POO", "", "POO", "", "");
        System.out.printf("%-7s%-7s%-7s\033[38;5;52m%-7s\033[0m\033[38;5;52m%-7s\033[0m\033[38;5;52m%-7s\033[0m\n", "19:30", "POO", "", "PROG", "PROG", "PROG");
        System.out.printf("%-7s%-7s%-7s\033[38;5;52m%-7s\033[0m\033[38;5;52m%-7s\033[0m\033[38;5;52m%-7s\033[0m\n", "20:30", "DIGI", "", "PROG", "PROG", "PROG");
    }
}
