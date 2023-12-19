import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyFs.help();

        while(true) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "ls":
                    if (tokens.length == 2) {
                        if (MyFs.isDirectory(tokens[1])) {
                            MyFs.listDirectory(tokens[1]);
                        } else {
                            System.out.println("Указанный путь не является директорией или не существует.");
                        }
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: ls <path>");
                    }
                    break;

                case "ls_py":
                    if (tokens.length == 2) {
                        if (MyFs.isDirectory(tokens[1])) {
                            MyFs.listPythonFiles(tokens[1]);
                        } else {
                            System.out.println("Указанный путь не является директорией или не существует.");
                        }
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: ls_py <path>");
                    }
                    break;

                case "is_dir":
                    if (tokens.length == 2) {
                        System.out.println(MyFs.isDirectory(tokens[1]));
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: is_dir <path>");
                    }
                    break;

                case "define":
                    if (tokens.length == 2) {
                        MyFs.defineDirOrFile(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: define <path>");
                    }
                    break;

                case "cat":
                    if (tokens.length == 2) {
                        MyFs.printContent(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: cat <path>");
                    }
                    break;

                case "append":
                    if (tokens.length == 2) {
                        MyFs.appendFooter(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: append <path>");
                    }
                    break;

                case "bc":
                    if (tokens.length == 2) {
                        MyFs.createBackup(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: bc <path>");
                    }
                    break;

                case "greplong":
                    if (tokens.length == 2) {
                        MyFs.printLongestWord(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: greplong  <path>");
                    }
                    break;

                case "readmod":
                    if (tokens.length == 2) {
                        MyFs.printPermissions(tokens[1]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: readmod  <path>");
                    }
                    break;

                case "setmod":
                    if (tokens.length == 3) {
                        MyFs.setPermissions(tokens[1], tokens[2]);
                    } else {
                        System.out.println("Неверное количество аргументов. Используйте: setmod  <path>");
                    }
                    break;

                case "help":
                    MyFs.help();
                    break;

                case "exit":
                    MyFs.exit();
                    break;

                default:
                    System.out.println("Неизвестная команда. Используйте 'help' для справки.");

            }
        }
    }
}