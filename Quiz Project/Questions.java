import java.util.Scanner;
import java.util.Random;

class Questions {

    public static void displayGuidelines() {
        System.out.println("=== QUIZ GUIDELINES ===");
        System.out.println("1. You will be presented with multiple-choice questions.");
        System.out.println("2. Each question has 4 options. Enter the number corresponding to your choice.");
        System.out.println("3. You will receive 1 point for each correct answer.");
        System.out.println("4. The quiz consists of 10 questions in total.");
        System.out.println("5. At the end, your final score will be displayed.");
        System.out.println("6. You can choose to retake the quiz after it is completed.");
        System.out.println("=======================");
        System.out.println("Press any key to continue...");
        new Scanner(System.in).nextLine();
    }

    public void start(String userName) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Start Quiz");
        System.out.println("2. Exit");
        int i = sc.nextInt();

        if (i == 1) {
            sQuiz(userName);
        }
    }

    public void sQuiz(String userName) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int result = 0;
        int total = 50;
        boolean[] asked = new boolean[total];

        for (int j = 1; j <= 10; j++) {
            int i = rand.nextInt(total);

            if (!asked[i]) {
                asked[i] = true;
                i++;
            }
            switch (i) {
                case 1:
                    System.out.println("What is the correct way to declare a variable in Java?");
                    System.out.println("1) int x;");
                    System.out.println("2) int: x;");
                    System.out.println("3) x int;");
                    System.out.println("4) variable x;");
                    int Ans1 = sc.nextInt();
                    if (Ans1 == 1) {
                        result++;
                    }
                    break;
                case 2:
                    System.out.println("Which of the following is a valid declaration of a char?");
                    System.out.println("1) char c = !a");
                    System.out.println("2) char c = 'a';");
                    System.out.println("3) char c = (char) a;");
                    System.out.println("4) char c = a;");
                    int Ans2 = sc.nextInt();
                    if (Ans2 == 2) {
                        result++;
                    }
                    break;
                case 3:
                    System.out.println("Which of the following is not a Java feature?");
                    System.out.println("1) Dynamic");
                    System.out.println("2) Architecture neutral");
                    System.out.println("3) Use of pointers");
                    System.out.println("4) Object-oriented");
                    int Ans3 = sc.nextInt();
                    if (Ans3 == 3) {
                        result++;
                    }
                    break;
                case 4:
                    System.out.println("Which of the following is the correct way to start a main method in Java?");
                    System.out.println("1) public static void main(String args{}");
                    System.out.println("2) public static void main(String[] args)");
                    System.out.println("3) public void main(String[] args)");
                    System.out.println("4) static public void main(String args[])");
                    int Ans4 = sc.nextInt();
                    if (Ans4 == 2) {
                        result++;
                    }
                    break;
                case 5:
                    System.out.println("What is the default value of a boolean variable in Java?");
                    System.out.println("1) true");
                    System.out.println("2) 0");
                    System.out.println("3) null");
                    System.out.println("4) false");
                    int Ans5 = sc.nextInt();
                    if (Ans5 == 4) {
                        result++;
                    }
                    break;
                case 6:
                    System.out.println("Which of the following methods can be used to find the length of a string in Java?");
                    System.out.println("1) length()");
                    System.out.println("2) size()");
                    System.out.println("3) getSize()");
                    System.out.println("4) getLength()");
                    int Ans6 = sc.nextInt();
                    if (Ans6 == 1) {
                        result++;
                    }
                    break;
                case 7:
                    System.out.println("Which of the following is a valid comment in Java?");
                    System.out.println("1) // This is a comment");
                    System.out.println("2) /* This is a comment */");
                    System.out.println("3) /** This is a comment */");
                    System.out.println("4) All of the above");
                    int Ans7 = sc.nextInt();
                    if (Ans7 == 4) {
                        result++;
                    }
                    break;
                case 8:
                    System.out.println("What is the size of an int variable in Java?");
                    System.out.println("1) 16 bits");
                    System.out.println("2) 32 bits");
                    System.out.println("3) 64 bits");
                    System.out.println("4) 8 bits");
                    int Ans8 = sc.nextInt();
                    if (Ans8 == 2) {
                        result++;
                    }
                    break;
                case 9:
                    System.out.println("Which of the following is not a valid data type in Java?");
                    System.out.println("1) int");
                    System.out.println("2) float");
                    System.out.println("3) decimal");
                    System.out.println("4) char");
                    int Ans9 = sc.nextInt();
                    if (Ans9 == 3) {
                        result++;
                    }
                    break;
                case 10:
                    System.out.println("Which of the following statements is used to terminate a loop in Java?");
                    System.out.println("1) exit");
                    System.out.println("2) break");
                    System.out.println("3) stop");
                    System.out.println("4) return");
                    int Ans10 = sc.nextInt();
                    if (Ans10 == 2) {
                        result++;
                    }
                    break;
                case 11:
                    System.out.println("What is the size of a char variable in Java?");
                    System.out.println("1) 8 bits");
                    System.out.println("2) 16 bits");
                    System.out.println("3) 32 bits");
                    System.out.println("4) 64 bits");
                    int Ans11 = sc.nextInt();
                    if (Ans11 == 2) {
                        result++;
                    }
                    break;
                case 12:
                    System.out.println("Which of the following is a reserved keyword in Java?");
                    System.out.println("1) array");
                    System.out.println("2) null");
                    System.out.println("3) goto");
                    System.out.println("4) System");
                    int Ans12 = sc.nextInt();
                    if (Ans12 == 3) {
                        result++;
                    }
                    break;
                case 13:
                    System.out.println("Which of the following can be used to create an instance of a class in Java?");
                    System.out.println("1) method");
                    System.out.println("2) constructor");
                    System.out.println("3) variable");
                    System.out.println("4) object");
                    int Ans13 = sc.nextInt();
                    if (Ans13 == 2) {
                        result++;
                    }
                    break;
                case 14:
                    System.out.println("What is the correct syntax for a for loop in Java?");
                    System.out.println("1) for(i = 0; i < 10; i++)");
                    System.out.println("2) for(int i = 0; i < 10; i++)");
                    System.out.println("3) for(int i = 0; i < 10; ++i)");
                    System.out.println("4) for(int i = 0, i < 10; i++)");
                    int Ans14 = sc.nextInt();
                    if (Ans14 == 2) {
                        result++;
                    }
                    break;
                case 15:
                    System.out.println("Which of the following is a valid loop control statement?");
                    System.out.println("1) continue");
                    System.out.println("2) skip");
                    System.out.println("3) halt");
                    System.out.println("4) break");
                    int Ans15 = sc.nextInt();
                    if (Ans15 == 4) {
                        result++;
                    }
                    break;
                case 16:
                    System.out.println("What is the default value of a double variable in Java?");
                    System.out.println("1) 0.0");
                    System.out.println("2) 0.0d");
                    System.out.println("3) 0.0f");
                    System.out.println("4) 0.0double");
                    int Ans16 = sc.nextInt();
                    if (Ans16 == 2) {
                        result++;
                    }
                    break;
                case 17:
                    System.out.println("Which of the following cannot be used as a variable name in Java?");
                    System.out.println("1) _var");
                    System.out.println("2) $var");
                    System.out.println("3) var$");
                    System.out.println("4) class");
                    int Ans17 = sc.nextInt();
                    if (Ans17 == 4) {
                        result++;
                    }
                    break;
                case 18:
                    System.out.println("Which of the following is used to declare a constant in Java?");
                    System.out.println("1) const");
                    System.out.println("2) final");
                    System.out.println("3) static");
                    System.out.println("4) const final");
                    int Ans18 = sc.nextInt();
                    if (Ans18 == 2) {
                        result++;
                    }
                    break;
                case 19:
                    System.out.println("What is inheritance in Java?");
                    System.out.println("1) When a class acquires the properties of another class.");
                    System.out.println("2) When a class uses methods from another class.");
                    System.out.println("3) When a class overrides methods from another class.");
                    System.out.println("4) When a class has multiple methods.");
                    int Ans19 = sc.nextInt();
                    if (Ans19 == 1) {
                        result++;
                    }
                    break;
                case 20:
                    System.out.println("What is the size of a long variable in Java?");
                    System.out.println("1) 32 bits");
                    System.out.println("2) 64 bits");
                    System.out.println("3) 128 bits");
                    System.out.println("4) 16 bits");
                    int Ans20 = sc.nextInt();
                    if (Ans20 == 2) {
                        result++;
                    }
                    break;
                case 21:
                    System.out.println("What is the output of the following code?\nint x = 5; int y = ++x;\nSystem.out.println(y);");
                    System.out.println("1) 4");
                    System.out.println("2) 5");
                    System.out.println("3) 6");
                    System.out.println("4) 7");
                    int Ans21 = sc.nextInt();
                    if (Ans21 == 3) {
                        result++;
                    }
                    break;
                case 22:
                    System.out.println("What is polymorphism in Java?");
                    System.out.println("1) When an object can take many forms.");
                    System.out.println("2) When a class has multiple methods.");
                    System.out.println("3) When a class implements multiple interfaces.");
                    System.out.println("4) When a method is overloaded.");
                    int Ans22 = sc.nextInt();
                    if (Ans22 == 1) {
                        result++;
                    }
                    break;
                case 23:
                    System.out.println("What is encapsulation?");
                    System.out.println("1) Hiding the implementation details of a class.");
                    System.out.println("2) Making all variables public.");
                    System.out.println("3) Writing complex methods.");
                    System.out.println("4) Using static methods.");
                    int Ans23 = sc.nextInt();
                    if (Ans23 == 1) {
                        result++;
                    }
                    break;
                case 24:
                    System.out.println("What is the result of the following code?\nint x = 10; int y = 3; int result = x / y;\nSystem.out.println(result);");
                    System.out.println("1) 3.33");
                    System.out.println("2) 3");
                    System.out.println("3) 4");
                    System.out.println("4) Error");
                    int Ans24 = sc.nextInt();
                    if (Ans24 == 2) {
                        result++;
                    }
                    break;
                case 25:
                    System.out.println("Which method is called first in a Java program?");
                    System.out.println("1) main()");
                    System.out.println("2) constructor");
                    System.out.println("3) finalize()");
                    System.out.println("4) static method");
                    int Ans25 = sc.nextInt();
                    if (Ans25 == 1) {
                        result++;
                    }
                    break;
                case 26:
                    System.out.println("What is the purpose of the 'super' keyword?");
                    System.out.println("1) To refer to the superclass of the current object.");
                    System.out.println("2) To declare a superclass.");
                    System.out.println("3) To override a method.");
                    System.out.println("4) To call a static method.");
                    int Ans26 = sc.nextInt();
                    if (Ans26 == 1) {
                        result++;
                    }
                    break;
                case 27:
                    System.out.println("Which of the following is not a valid access modifier?");
                    System.out.println("1) public");
                    System.out.println("2) private");
                    System.out.println("3) protected");
                    System.out.println("4) external");
                    int Ans27 = sc.nextInt();
                    if (Ans27 == 4) {
                        result++;
                    }
                    break;
                case 28:
                    System.out.println("What is the keyword for creating an abstract method?");
                    System.out.println("1) abstract");
                    System.out.println("2) virtual");
                    System.out.println("3) static");
                    System.out.println("4) interface");
                    int Ans28 = sc.nextInt();
                    if (Ans28 == 1) {
                        result++;
                    }
                    break;
                case 29:
                    System.out.println("Which of the following is not an OOP concept?");
                    System.out.println("1) Abstraction");
                    System.out.println("2) Inheritance");
                    System.out.println("3) Polymorphism");
                    System.out.println("4) Compilation");
                    int Ans29 = sc.nextInt();
                    if (Ans29 == 4) {
                        result++;
                    }
                    break;
                case 30:
                    System.out.println("Which of the following loops is guaranteed to execute at least once?");
                    System.out.println("1) for loop");
                    System.out.println("2) while loop");
                    System.out.println("3) do-while loop");
                    System.out.println("4) enhanced for loop");
                    int Ans30 = sc.nextInt();
                    if (Ans30 == 3) {
                        result++;
                    }
                    break;
                case 31:
                    System.out.println("What does the keyword 'this' refer to in Java?");
                    System.out.println("1) The current object");
                    System.out.println("2) The parent object");
                    System.out.println("3) A static method");
                    System.out.println("4) A local variable");
                    int Ans31 = sc.nextInt();
                    if (Ans31 == 1) {
                        result++;
                    }
                    break;
                case 32:
                    System.out.println("What is the output of the following code?\nint a = 5; System.out.println(a == 5 ? \"Yes\" : \"No\");");
                    System.out.println("1) Yes");
                    System.out.println("2) No");
                    System.out.println("3) Error");
                    System.out.println("4) None of the above");
                    int Ans32 = sc.nextInt();
                    if (Ans32 == 1) {
                        result++;
                    }
                    break;
                case 33:
                    System.out.println("Which of the following is used to compare two strings in Java?");
                    System.out.println("1) equals()");
                    System.out.println("2) compare()");
                    System.out.println("3) == operator");
                    System.out.println("4) compareTo()");
                    int Ans33 = sc.nextInt();
                    if (Ans33 == 1) {
                        result++;
                    }
                    break;
                case 34:
                    System.out.println("What is the correct way to allocate memory dynamically for an array in Java?");
                    System.out.println("1) array arr = new array[10];");
                    System.out.println("2) int[] arr = new int[10];");
                    System.out.println("3) int arr[10];");
                    System.out.println("4) int[] arr = allocate(10);");
                    int Ans34 = sc.nextInt();
                    if (Ans34 == 2) {
                        result++;
                    }
                    break;
                case 35:
                    System.out.println("What is the output of the following code?\nint x = 5; x += 3;\nSystem.out.println(x);");
                    System.out.println("1) 5");
                    System.out.println("2) 7");
                    System.out.println("3) 8");
                    System.out.println("4) 10");
                    int Ans35 = sc.nextInt();
                    if (Ans35 == 3) {
                        result++;
                    }
                    break;
                case 36:
                    System.out.println("Which of the following is not a type of exception in Java?");
                    System.out.println("1) IOException");
                    System.out.println("2) NullPointerException");
                    System.out.println("3) FileNotFoundException");
                    System.out.println("4) SQLException");
                    int Ans36 = sc.nextInt();
                    if (Ans36 == 4) {
                        result++;
                    }
                    break;
                case 37:
                    System.out.println("Which of the following operators is used to create an object in Java?");
                    System.out.println("1) new");
                    System.out.println("2) create");
                    System.out.println("3) object");
                    System.out.println("4) alloc");
                    int Ans37 = sc.nextInt();
                    if (Ans37 == 1) {
                        result++;
                    }
                    break;
                case 38:
                    System.out.println("What is the purpose of the 'finally' block in Java?");
                    System.out.println("1) To execute code when an exception is thrown");
                    System.out.println("2) To execute code whether an exception is thrown or not");
                    System.out.println("3) To declare an exception");
                    System.out.println("4) To return a value after catching an exception");
                    int Ans38 = sc.nextInt();
                    if (Ans38 == 2) {
                        result++;
                    }
                    break;
                case 39:
                    System.out.println(
                            "What is the output of the following code?\nint a = 10; int b = 15;\nSystem.out.println(a > b ? a : b);");
                    System.out.println("1) 10");
                    System.out.println("2) 15");
                    System.out.println("3) Error");
                    System.out.println("4) None of the above");
                    int Ans39 = sc.nextInt();
                    if (Ans39 == 2) {
                        result++;
                    }
                    break;
                case 40:
                    System.out.println("What is the correct syntax for catching an exception in Java?");
                    System.out.println("1) try { ... } throw { ... }");
                    System.out.println("2) try { ... } except { ... }");
                    System.out.println("3) try { ... } catch { ... }");
                    System.out.println("4) try { ... } error { ... }");
                    int Ans40 = sc.nextInt();
                    if (Ans40 == 3) {
                        result++;
                    }
                    break;
                case 41:
                    System.out.println("Which of the following is not a feature of interfaces in Java?");
                    System.out.println("1) Interfaces can have abstract methods");
                    System.out.println("2) Interfaces can have static methods");
                    System.out.println("3) Interfaces can be instantiated directly");
                    System.out.println("4) Interfaces support multiple inheritance");
                    int Ans41 = sc.nextInt();
                    if (Ans41 == 3) {
                        result++;
                    }
                    break;
                case 42:
                    System.out.println("What does the 'break' statement do in a loop?");
                    System.out.println("1) Stops the loop and continues with the next iteration");
                    System.out.println("2) Stops the loop and exits it");
                    System.out.println("3) Pauses the loop for a specified time");
                    System.out.println("4) Skips the current iteration");
                    int Ans42 = sc.nextInt();
                    if (Ans42 == 2) {
                        result++;
                    }
                    break;
                case 43:
                    System.out.println("Which of the following is a correct syntax for creating an object of the 'Scanner' class?");
                    System.out.println("1) Scanner sc = new Scanner(System.in);");
                    System.out.println("2) Scanner sc = Scanner(System.in);");
                    System.out.println("3) Scanner sc = new Scanner();");
                    System.out.println("4) Scanner sc = Scanner();");
                    int Ans43 = sc.nextInt();
                    if (Ans43 == 1) {
                        result++;
                    }
                    break;
                case 44:
                    System.out.println("What is method overloading?");
                    System.out.println("1) Defining multiple methods with the same name but different parameter types or counts.");
                    System.out.println("2) Using a method from a parent class.");
                    System.out.println("3) Defining a method inside another method.");
                    System.out.println("4) None of the above");
                    int Ans44 = sc.nextInt();
                    if (Ans44 == 1) {
                        result++;
                    }
                    break;
                case 45:
                    System.out.println("What will be the result of the following code?\nint x = 4;\nSystem.out.println(x++);");
                    System.out.println("1) 4");
                    System.out.println("2) 5");
                    System.out.println("3) Error");
                    System.out.println("4) None of the above");
                    int Ans45 = sc.nextInt();
                    if (Ans45 == 1) {
                        result++;
                    }
                    break;
                case 46:
                    System.out.println("What is the purpose of the 'return' keyword?");
                    System.out.println("1) To exit a method and optionally pass a value back");
                    System.out.println("2) To return to the start of a loop");
                    System.out.println("3) To declare a return type for a method");
                    System.out.println("4) None of the above");
                    int Ans46 = sc.nextInt();
                    if (Ans46 == 1) {
                        result++;
                    }
                    break;
                case 47:
                    System.out.println("Which keyword is used to inherit a class in Java?");
                    System.out.println("1) implements");
                    System.out.println("2) extends");
                    System.out.println("3) inherit");
                    System.out.println("4) super");
                    int Ans47 = sc.nextInt();
                    if (Ans47 == 2) {
                        result++;
                    }
                    break;
                case 48:
                    System.out.println("Which of the following is not a valid operator in Java?");
                    System.out.println("1) &=");
                    System.out.println("2) &&");
                    System.out.println("3) !=");
                    System.out.println("4) ===");
                    int Ans48 = sc.nextInt();
                    if (Ans48 == 4) {
                        result++;
                    }
                    break;
                case 49:
                    System.out.println("What does the keyword 'static' mean in Java?");
                    System.out.println("1) The variable or method is shared by all instances of a class.");
                    System.out.println("2) The variable or method is not accessible outside the class.");
                    System.out.println("3) The variable or method cannot be modified.");
                    System.out.println("4) The variable or method is defined in the main method.");
                    int Ans49 = sc.nextInt();
                    if (Ans49 == 1) {
                        result++;
                    }
                    break;
                case 50:
                    System.out.println("What is the output of the following code?\nint x = 10; x *= 2;\nSystem.out.println(x);");
                    System.out.println("1) 10");
                    System.out.println("2) 20");
                    System.out.println("3) Error");
                    System.out.println("4) None of the above");
                    int Ans50 = sc.nextInt();
                    if (Ans50 == 2) {
                        result++;
                    }
                    break;

            }
        }
        System.out.println("Quiz completed! " + userName + ", Your final score is " + result + "/10");
        System.out.println("Percentage: " + ((result * 100) / 10) + "%");

        System.out.println("Do you want to play again? (yes/no)");
        String replay = sc.next();

        if (replay.equalsIgnoreCase("yes")) {
            start(userName);
        } else {
            System.out.println("Thank you for playing!");
        }
    }
}
