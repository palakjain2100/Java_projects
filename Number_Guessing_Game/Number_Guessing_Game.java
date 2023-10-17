import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    public static int randomNum() {
        //Generating a random number
        int randonumber;
        Random random = new Random();
        randonumber = random.nextInt(0,100) + 1;
        return randonumber;
    }
    public static void main(String[] args) {
        int userGuess;
        int attempts;
        int restart;
        int score = 0;
        int randomnumber = randomNum();
        Scanner sc = new Scanner(System.in);
        //Introduction to the game
        System.out.println("Welcome!");
        System.out.println("This is  a number guessing game");
        System.out.println("This consists of two rounds");
        System.out.println("To start the game press 1\nTo exit Press 0 ");
        int startinput = sc.nextInt();
        while (!(startinput == 1) && !(startinput == 0)) {
            System.out.println("Invalid input!To start the game press 1\nTo exit Press 0");
            startinput = sc.nextInt();
        }
        if (startinput == 1) {
            System.out.println("----Round 1----");
            System.out.println("Please select the maximum number of attempts you want (5/10)");
            System.out.println("If you choose 5,your maximum score can be 100 but if you choose 10,your maximum score can be 10");
            attempts = sc.nextInt();
            while (!(attempts == 5) && !(attempts == 10)) {
                System.out.println("Invalid Entry!Please select the maximum number of attemps you want (5/10)");
                attempts = sc.nextInt();
            }
            if (attempts == 5) {
                score = 40;
                System.out.println("For every wrong attempt made your points will be deducted my 2");
                int i = 1;
                while (i < attempts) {
                    System.out.println("Attempt Number " + i + " , Enter a number in range of 1 to 100");
                    userGuess = sc.nextInt();
                    while (userGuess < 1 || userGuess > 100) {
                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                        userGuess = sc.nextInt();
                    }
                    if (userGuess == randomnumber) {
                        System.out.println("Congratulations! You Won");
                        System.out.println("Your score is" + score);
                        System.out.println("Do you want to play Round 2?\nIf yes enter 1\nIf no enter 0");
                        restart = sc.nextInt();
                        while (!(restart == 0) && !(restart == 1)) {
                            System.out.println("Invalid entry!Do you want to play Round 2?\nIf yes enter 1\nIf no enter 0");
                            restart = sc.nextInt();
                        }
                        if (restart == 1) {
                            int rNumber=randomNum();
                            System.out.println("----Round 2----");
                            System.out.println("Please select the maximum number of attemps you want (5/10)");
                            System.out.println("If you choose 5,your maximum score can be 100 but if you choose 10,your maximum score can be 10");
                            attempts = sc.nextInt();
                            while (!(attempts == 5) && !(attempts == 10)) {
                                System.out.println("Invalid Entry!Please select the maximum number of attempts you want (5/10)");
                                attempts = sc.nextInt();
                            }
                            if (attempts == 5) {
                                score = 40;
                                System.out.println("For every wrong attempt made your points will be deducted my 2");
                                int j = 1;
                                while (j < attempts) {
                                    System.out.println("Attempt Number " + j + " , Enter a number in range of 1 to 100");
                                    userGuess = sc.nextInt();
                                    while (userGuess < 0 || userGuess > 100) {
                                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                                        userGuess = sc.nextInt();
                                    }
                                    if (userGuess == rNumber) {
                                        System.out.println("Congratulations! You Won");
                                        System.out.println("Your score is" + score);
                                        break;
                                    } else if (userGuess < rNumber) {
                                        System.out.println("Try out a higher number");
                                    } else if (userGuess > rNumber) {
                                        System.out.println("Try out a lower number");
                                    }
                                    if (j == attempts) {
                                        System.out.println("Sorry! You ran out of attempts.");
                                    }
                                    j++;
                                    score = score - 2;
                                }
                            }
                             else if (attempts == 10) {
                                score = 20;
                                System.out.println("For every wrong attempt made your points will be deducted my 2");
                                int j = 1;
                                while (j < attempts) {
                                    System.out.println("Attempt Number " + j + " , Enter a number in range of 1 to 100");
                                    userGuess = sc.nextInt();
                                    while (userGuess < 1 || userGuess > 100) {
                                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                                        userGuess = sc.nextInt();
                                    }
                                    if (userGuess == rNumber) {
                                        System.out.println("Congratulations! You Won");
                                        System.out.println("Your score is " + score);
                                        break;
                                    } else if (userGuess < rNumber) {
                                        System.out.println("Try out a higher number");
                                    } else if (userGuess > rNumber) {
                                        System.out.println("Try out a lower number");
                                    }
                                    if (j == attempts) {
                                        System.out.println("Sorry! You ran out of attempts.");
                                    }
                                    j++;
                                    score = score - 2;
                                }
                            }
                        } else if (restart == 0) {
                            System.out.println("Good bye! Come back next time.");
                        }
                        break;
                    } else if (userGuess < randomnumber) {
                        System.out.println("Please try out a higher number");
                    } else if (userGuess > randomnumber) {
                        System.out.println("Please try out a lower number");
                    }
                    i++;
                    score = score - 2;

                }
                if (i == attempts) {
                        System.out.println("Sorry! you ran out of attempts");
                    }
            }
            else if (attempts == 10) {
                score = 20;
                System.out.println("For every wrong attempt made your points will be deducted my 2");
                int i = 1;
                while (i < attempts) {
                    System.out.println("Attempt Number " + i + " , Enter a number in range of 1 to 100");
                    userGuess = sc.nextInt();
                    while (userGuess < 0 || userGuess > 100) {
                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                        userGuess = sc.nextInt();
                    }
                    if (userGuess == randomnumber) {
                        System.out.println("Congratulations! You Won");
                        System.out.println("Your score is " + score);
                        System.out.println("Do you want to play Round 2?\nIf yes enter 1\nIf no enter 0");
                        restart = sc.nextInt();
                        while (!(restart == 0) && !(restart == 1)) {
                            System.out.println("Invalid entry!Do you want to play Round 2?\nIf yes enter 1\nIf no enter 0");
                            restart = sc.nextInt();
                        }
                        if (restart == 1) {
                            int rNumber=randomNum();
                            System.out.println("----Round 2----");
                            System.out.println("Please select the maximum number of attemps you want (5/10)");
                            System.out.println("If you choose 5,your maximum score can be 100 but if you choose 10,your maximum score can be 10");
                            attempts = sc.nextInt();
                            while (!(attempts == 5) && !(attempts == 10)) {
                                System.out.println("Invalid Entry!Please select the maximum number of attemps you want (5/10)");
                                attempts = sc.nextInt();
                            }
                            if (attempts == 5) {
                                score = 40;
                                System.out.println("For every wrong attempt made your points will be deducted my 2");
                                int j = 1;
                                while (j < attempts) {
                                    System.out.println("Attempt Number " + j + " , Enter a number in range of 1 to 100");
                                    userGuess = sc.nextInt();
                                    while (userGuess < 0 || userGuess > 100) {
                                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                                        userGuess = sc.nextInt();
                                    }
                                    if (userGuess == rNumber) {
                                        System.out.println("Congratulations! You Won");
                                        System.out.println("Your score is" + score);
                                        break;
                                    } else if (userGuess < rNumber) {
                                        System.out.println("Try out a higher number");
                                    } else if (userGuess > rNumber) {
                                        System.out.println("Try out a lower number");
                                    }
                                    if (j == attempts) {
                                        System.out.println("Sorry! You ran out of attempts.");
                                    }
                                    j++;
                                    score = score - 2;
                                }
                            }
                            else if (attempts == 10) {
                                score = 20;
                                System.out.println("For every wrong attempt made your points will be deducted my 2");
                                int j = 1;
                                while (j < attempts) {
                                    System.out.println("Attempt Number " + j + " , Enter a number in range of 1 to 100");
                                    userGuess = sc.nextInt();
                                    while (userGuess < 0 || userGuess > 100) {
                                        System.out.println("Invalid entry! Enter a number in range of 1 to 100");
                                        userGuess = sc.nextInt();
                                    }
                                    if (userGuess == rNumber) {
                                        System.out.println("Congratulations! You Won");
                                        System.out.println("Your score is " + score);
                                        break;
                                    } else if (userGuess < rNumber) {
                                        System.out.println("Try out a higher number");
                                    } else if (userGuess > rNumber) {
                                        System.out.println("Try out a lower number");
                                    }
                                    if (j == attempts) {
                                        System.out.println("Sorry! You ran out of attempts.");
                                    }
                                    j++;
                                    score = score - 2;
                                }
                            }
                        } else if (restart == 0) {
                            System.out.println("Good bye! Come back next time.");
                        }
                        break;
                    } else if (userGuess < randomnumber) {
                        System.out.println("Please try out a higher number");
                    } else if (userGuess > randomnumber) {
                        System.out.println("Please try out a lower number");
                    }
                    i++;
                    score = score - 2;

                }
                if (i == attempts) {
                    System.out.println("Sorry! you ran out of attempts");
                }
            }

        }
        else if (startinput == 0) {
            System.out.println("Thank you! Come back next time.");
        }
        sc.close();
    }
}









