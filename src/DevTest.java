import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
        String name = getNonZeroLenString(in,"Enter your name" );
        System.out.println("You said your name is " + name);

        int age = getInt(in, "Enter your age" );
        System.out.print("You said your age is " + age);

        double salary = getDouble(in, "Enter your salary" );
        System.out.print("Your salary is " + salary);

        int favNum = getRangedInt(in, "Enter your fav num", 1, 10);
        System.out.println("You said fav num is " + favNum);

        double income = getRangedDouble(in, "Enter your income", 5000, 100000);
        System.out.println("You said the income is " + income);
         */
        boolean leaveClass = getYNConfirm(in, "Are you ready to leave class?");
        System.out.println("leaveClass");
    }

    /**
     * get a String Val from the user which must be at least one character
     *
     * @param pipe scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return String that is at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least on character!");
            }

        }while(retVal.isEmpty());

        return retVal;
    }

    /**
     * gets an unconstrained int value from the user
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets an unconstrained double value from the user
     * @param pipe Scanner used to get input from user
     * @param prompt an unconstrined double value
     * @return
     */

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets a int value from the user within a specified inclusive range
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an int value within the specified range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high +"]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid int in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets a int value from the user within a specified inclusive range
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an int value within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high +"]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid int in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        }while(!done);

        return retVal;
    }

        /**
         * get a String Val from the user which must be at least one character
         *
         * @param pipe scanner to use to read the input
         * @param prompt prompt to tell the user what to input
         * @return return true for Yy (yes) false for Nn(no)
         */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
        {
            String input = "";
            boolean retVal = false;
            boolean done = false;

            do
            {
                System.out.print(prompt + "[YyNn]: ");
                input = pipe.nextLine();
                if(input.isEmpty())
                {
                    System.out.println("You must enter y or n!");
                }
                else if(input.equalsIgnoreCase("Y"))
                {
                    retVal = true;
                    done = true;
                }
                else if(input.equalsIgnoreCase("N"))
                {
                    retVal = false;
                    done = true;
                }
                else
                {
                    System.out.println("You must enter Y or N! Not: " + input);
                }

            }while(!done);

            return retVal;
        }
}