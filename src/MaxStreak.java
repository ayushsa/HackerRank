import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxStreak {

    public static void main(String[] args)
    {
        List<String> data = new ArrayList<>();

        System.out.println("Max Om Namah shivaye");

        //return number of sale price that entered encorrectly
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Emp No");

        int numberOfItems = Integer.parseInt(scn.nextLine());

        for (int i=0; i<numberOfItems ;i++)
        {
            System.out.print("Enter Emp Attandance" + i);
            String att = scn.nextLine();

            data.add(att);
        }

        System.out.println("Result" + maxStreak(numberOfItems, data));
    }

    public static int maxStreak(int m, List<String> data)
    {
        int counter = 0;

        for(int i=0;i<data.size() ; i++)
        {
            if(m==data.get(i).length())
            {
                if(!data.get(i).contains("N"))
                {
                    counter++;
                }
            }
        }

        return counter;
    }
}

//https://www.chegg.com/homework-help/questions-and-answers/maximum-streak-project-manager-wants-look-employee-attendance-data-given-m-employees-worki-q33028077

