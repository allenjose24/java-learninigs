import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("              ____----------- _____\r\n" + //
                    "\\~~~~~~~~~~/~_--~~~------~~~~~     \\\r\n" + //
                    " `---`\\  _-~      |                   \\\r\n" + //
                    "   _-~  <_         |                     \\[]\r\n" + //
                    " / ___     ~~--[\"\"] |      ________-------'_\r\n" + //
                    "> /~` \\    |-.   `\\~~.~~~~~                _ ~ - _\r\n" + //
                    " ~|  ||\\%  |       |    ~  ._                ~ _   ~ ._\r\n" + //
                    "   `_//|_%  \\      |          ~  .              ~-_   /\\\r\n" + //
                    "          `--__     |    _-____  /\\               ~-_ \\/.\r\n" + //
                    "               ~--_ /  ,/ -~-_ \\ \\/          _______---~/\r\n" + //
                    "                   ~~-/._<   \\ \\`~~~~~~~~~~~~~     ##--~/\r\n" + //
                    "                         \\    ) |`------##---~~~~-~  ) )\r\n" + //
                    "                          ~-_/_/                  ~~ ~~\r\n" + //
                    "");
        do {
            System.out.println("Enter 1 for :- Pontiac_GTO");
            System.out.println("Enter 2 for :- Cherolet Chevelle SS 454");
            System.out.println("Enter 3 for :- Plymouth Superbird");
            System.out.println("Enter 4 for :- Chevrolet Camaro Z/28");
            System.out.println("Enter 5 for :- Plymouth Hemi 'Cuda");
            System.out.println("Enter 6 for :- Dodge Charger R/T");
            System.out.println("Enter 7 to EXIT THE SYSTEM.!");

            System.out.print("\nEnter your Choice: ");
            choice = scanner.nextInt();

            System.out.println();
            switch (choice) {
                case 1:
                    Pontiac_GTO();
                    break;
                case 2:
                    Chevrolet_Chevelle_SS_454();
                    break;
                case 3:
                    Plymouth_Superbird();
                    break;
                case 4:
                    Chevrolet_Camaro_Z28();
                    break;
                case 5:
                    Plymouth_Hemi_Cuda();
                    break;
                case 6:
                    Dodge_Charger_RT();
                    break;
            }

            System.out.println();
            if (choice == 7) {
                System.out.println("                  __..-======-------..__\r\n" + //
                                        "              . '    ______    ___________`.\r\n" + //
                                        "            .' .--. '.-----.`. `.-----.-----`.\r\n" + //
                                        "           / .'   | ||      `.` \\\\     \\     \\\\            _\r\n" + //
                                        "         .' /     | ||        \\\\ \\\\_____\\_____\\\\__________[_]\r\n" + //
                                        "        /   `-----' |'---------`\\  .'                       \\\r\n" + //
                                        "       /============|============\\'-------------------.._____|\r\n" + //
                                        "    .-`---.         |-==.        |'.__________________  =====|-._\r\n" + //
                                        "  .'        `.      |            |      .--------.    _` ====|  _ .\r\n" + //
                                        " /     __     \\     |            |   .'           `. [_] `.==| [_] \\\r\n" + //
                                        "[   .`    `.  |     |            | .'     .---.     \\      \\=|     |\r\n" + //
                                        "|  | / .-. '  |_____\\___________/_/     .'---. `.    |     | |     |\r\n" + //
                                        " `-'| | O |'..`------------------'.....'/ .-. \\ |    |       ___.--'\r\n" + //
                                        "LGB  \\ `-' / /   `._.'                 | | O | |'___...----''___.--'\r\n" + //
                                        "      `._.'.'                           \\ `-' / [___...----''_.'");
                System.out.println("Exiting System..");
                break;
            }
        } while (true);

        scanner.close();

    }

    static void Pontiac_GTO() {
        System.out.println("                    ___..................____\r\n" + //
                        "           _..--''~_______   _____...----~~~\\\\\r\n" + //
                        "       __.'    .-'~       \\\\~      [_`.7     \\\\\r\n" + //
                        " .---~~      .'            \\\\           __..--\\\\_\r\n" + //
                        "/             `-._          \\\\   _...~~~_..---~  ~~~~~~~~~~~~--.._\r\n" + //
                        "\\              /  ~~~~~~----_\\`-~_-~~__          ~~~~~~~---.._    ~--.__\r\n" + //
                        " \\     _       |==            |   ~--___--------...__          `-   _.--\"\"\"|\r\n" + //
                        "  \\ __/.-._\\   |              |            ~~~~--.  `-._ ___...--~~~_.'|_Y |\r\n" + //
                        "   `--'|/~_\\\\  |              |     _____           _.~~~__..--~~_.-~~~.-~/\r\n" + //
                        "     | ||| |\\\\_|__            |.../.----.._.        | Y |__...--~~_.-~  _/\r\n" + //
                        "      ~\\\\\\ || ~|..__---____   |||||  .'~-. \\\\       |_..-----~~~~   _.~~\r\n" + //
                        "        \\`-'/ /     ~~~----...|'''|  |/\"_\"\\ \\\\   |~~'           __.~\r\n" + //
                        "         `~~~'                 ~~-:  ||| ~| |\\\\  |        __..~~\r\n" + //
                        "                                   ~~|||  | | \\\\/  _.---~~\r\n" + //
                        "                                     \\\\\\  //  | ~~~\r\n" + //
                        "                                      \\`-'/  / dp");
        System.out.println("Name: Pontiac GTO");
        System.out.println("Year of Production: 1964");
        System.out.println("speciality: First mass-market muscle car; pioneered the 'Big Engine, Small Car' formula.");
        System.out.println("Engine horsepower: 348");
        System.out.println("Current price: $110,000+");
    }

    static void Chevrolet_Chevelle_SS_454() {
        System.out.println("                      ___..............._\r\n" + //
                        "             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._\r\n" + //
                        " ______.-'         (_) |      \\\\           ` \\\\`-. _\r\n" + //
                        "/_       --------------'-------\\\\---....______\\\\__`.`  -..___\r\n" + //
                        "| T      _.----._           Xxx|x...           |          _.._`--. _\r\n" + //
                        "| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._\r\n" + //
                        "\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.\r\n" + //
                        " _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |\r\n" + //
                        "|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J\r\n" + //
                        "     `'\\ \\      / ./__________________________________\\ \\      / /___________\\\r\n" + //
                        "        `.`----'.'   dp                                `.`----'.'\r\n" + //
                        "          `\"\"\"\"'                                         `\"\"\"\"'");
        System.out.println("Name: Chevrolet Chevelle SS 454");
        System.out.println("Year of Production: 1970");
        System.out.println("Speciality: Highest factory horsepower rating of the golden era; 'King of the Streets'.");
        System.out.println("Engine horsepower: 450");
        System.out.println("Current Price: $270,000+");
    }

    static void Plymouth_Superbird() {
        System.out.println("                              _.-=\"_-         _\r\n" + //
                        "                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..\r\n" + //
                        "             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'\r\n" + //
                        "      __.--\"\"     __        ,'                   o \\           __        [__|\r\n" + //
                        " __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:\r\n" + //
                        "]       [w] : /        \\ : |========================|    : /        \\ :  [w] :\r\n" + //
                        "V___________:|          |: |========================|    :|          |:   _-\"\r\n" + //
                        " V__________: \\        / :_|=======================/_____: \\        / :__-\"\r\n" + //
                        " -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
        System.out.println("Name: Plymouth Superbird");
        System.out.println("Year of Production: 1970");
        System.out.println("Speciality: Extreme aerodynamics with a 2-foot tall rear wing; built for NASCAR dominance.");
        System.out.println("Engine Horsepower: 425");
        System.out.println("Current Price: $600,000+");
    }

    static void Chevrolet_Camaro_Z28() {
        System.out.println("                       _____________________\r\n" + //
                        "    /  .       .      (<$$$$$$>#####<::::::>)\r\n" + //
                        "   .      .     .  _/~~~~~~~~~~~~~~~~~~~~~~~~~\\_   .       .   .   \\\r\n" + //
                        ".(          . .  /~                             ~\\ . .   .\r\n" + //
                        "  ( . .        .~                                 ~.      .         )\r\n" + //
                        "           ()\\/_____                           _____\\/()   .    .  ).\r\n" + //
                        "(         .-''      ~~~~~~~~~~~~~~~~~~~~~~~~~~~     ``-.  ...\r\n" + //
                        ".  . . .-~              __________________              ~-.  .    /\r\n" + //
                        " .   ..`~~/~~~~~~~~~~~~TTTTTTTTTTTTTTTTTTTT~~~~~~~~~~~~\\~~'    . ) .\r\n" + //
                        "    . .| | | #### #### || | | | [] | | | || #### #### | | | .\r\n" + //
                        "   (   ;__\\|___________|++++++++++++++++++|___________|/__;.   .\r\n" + //
                        "     .  (~~====___________________________________====~~~)\r\n" + //
                        " ( .  .. \\------_____________[ POLICE ]__________-------/ ..  .     )\r\n" + //
                        "         .  |      ||         ~~~~~~~~       ||      |\r\n" + //
                        "             \\_____/                          \\_____/");
        System.out.println("Name: Chevrolet Camaro Z/28");
        System.out.println("Year of Production: 1969");
        System.out.println("Speciality: Engineered for Trans-Am road racing; famous for its high-revving 302 engine.");
        System.out.println("Engine Horsepower: 290");
        System.out.println("Current Price: $160,000+");
    }

    static void Plymouth_Hemi_Cuda() {
        System.out.println("Name: Plymouth Hemi 'Cuda");
        System.out.println("Year of Production: 1970");
        System.out.println("Speciality: Extremely rare and highly collectible; features the legendary Hemi combustion chambers.");
        System.out.println("Engine Horsepower: 425");
        System.out.println("Current Price: $2,000,000+ (for convertibles)");
    }

    static void Dodge_Charger_RT() {
        System.out.println("Name: Dodge Charger R/T");
        System.out.println("Year of Production: 1969");
        System.out.println("Speciality: Iconic 'Coke-bottle' styling and hidden headlights; a pop-culture legend.");
        System.out.println("Engine Horsepower: 375");
        System.out.println("Current Price: $120,000+");
    }
}
