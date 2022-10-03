import java.util.Scanner;


public class Adventure 
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        System.out.println("Type Upstairs or Kitchen");

        String choice1 = keyboard.next();
        choice1.toLowerCase();

        while(!choice1.equals("upstairs") && !choice1.equals("kitchen"))
        {
            System.out.println("Please type Upstairs or Kitchen");
            choice1 = keyboard.next();
            choice1.toLowerCase();
        }

        if(choice1.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
            System.out.println("Type Bedroom or Bathroom");

            String choice2 = keyboard.next();
            choice2.toLowerCase();

            while(!choice2.equals("bedroom") && !choice2.equals("bathroom"))
            {
                System.out.println("Please type Bedroom or Bathroom");
                choice2 = keyboard.next();
                choice2.toLowerCase();
            }

            if(choice2.equals("bedroom"))
            {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
                System.out.println("Type Yes or No");

                String choice3 = keyboard.next();
                choice3.toLowerCase();

                while(!choice3.equals("yes") && !choice3.equals("no"))
                {
                    System.out.println("Please type Yes or No");
                    choice3 = keyboard.next();
                    choice3.toLowerCase();
                }

                if(choice3.equals("yes"))
                {
                    System.out.println("You open the door and find a treasure chest!  Would you like to open the chest? (\"yes\" or \"no\")");
                    System.out.println("Type Yes or No");

                    String choice4 = keyboard.next();
                    choice4.toLowerCase();

                    while(!choice4.equals("yes") && !choice4.equals("no"))
                    {
                        System.out.println("Please type Yes or No");
                        choice4 = keyboard.next();
                        choice4.toLowerCase();
                    }

                    if(choice4.equals("yes"))
                    {
                        System.out.println("You open the chest and find a treasure!  You win!");
                    }
                    else
                    {
                        System.out.println("You find a treasure chest, but you decide not to open it.  You lose!");
                    }
                }
                else
                {
                    System.out.println("There is nothing in the room but a bed. You take a nap on the bed but never wake up.");
                }
            }
            else
            {
                System.out.println("You are in a dark bathroom. You see moonlight. Would you like to take a closer look?");
                System.out.println("Types Yes or No");
                String choice5 = keyboard.next();
                choice5.toLowerCase();

                while(!choice5.equals("yes") && !choice5.equals("no"))
                {
                    System.out.println("Please type Yes or No");
                    choice5 = keyboard.next();
                    choice5.toLowerCase();
                }

                if(choice5.equals("yes"))
                {
                    System.out.println("You find an open window with a rope would you like to climb down?");
                    System.out.println("Type yes or no");
                    String choice6 = keyboard.next();
                    choice6.toLowerCase();

                    while(!choice6.equals("yes") && !choice6.equals("no"))
                    {
                        System.out.println("Type yes or no");
                        choice6 = keyboard.next();
                        choice6.toLowerCase();
                    }

                    if(choice6.equals("yes"))
                    {
                        System.out.println("You try to climb down but you fall");
                        System.out.println("Type a number between 1 and 10");
                        int choice7 = keyboard.nextInt();

                        while (choice7 < 1 || choice7 > 10)
                        {
                            System.out.println("Type a number between 1 and 10");
                            choice7 = keyboard.nextInt();
                        }

                        if (choice7 <= 5)
                        {
                            System.out.println("You fall and break your neck and die");
                        }
                        else
                        {
                            System.out.println("You fall and land on a tree branch and survive");

                            System.out.println("You feel a sharp pain in your leg and you see a bear in the distant. Would you like to run or hide?");
                            System.out.println("Type run or hide");
                            String choice8 = keyboard.nextLine();
                            choice8.toLowerCase();

                            while(!choice8.equals("run") && !choice8.equals("hide"))
                            {
                                System.out.println("Type run or hide");
                                choice8 = keyboard.nextLine();
                                choice8.toLowerCase();
                            }

                            if (choice8.equals("run"))
                            {
                                System.out.println("You start to run and the bear follows. You can keep runing to try and out run it or hide in a bush?");
                                
                                System.out.println("Type run or hide");
                                String choice9 = keyboard.nextLine();
                                choice9.toLowerCase();

                                while(!choice9.equals("run") && !choice9.equals("hide"))
                                {
                                    System.out.println("Type run or hide");
                                    choice9 = keyboard.nextLine();
                                    choice9.toLowerCase();
                                }

                                if(choice9.equals("run"))
                                {
                                    System.out.println("You keep running and see a house do you want to go in?");

                                    System.out.println("Type yes or no");
                                    String choice10 = keyboard.nextLine();
                                    choice10.toLowerCase();

                                    while(!choice10.equals("yes") && !choice10.equals("no"))
                                    {
                                        System.out.println("Type yes or no");
                                        choice10 = keyboard.nextLine();
                                        choice10.toLowerCase();
                                    }

                                    if(choice10.equals("yes"))
                                    {
                                        System.out.println("You go in the house and find a gun. Do you want to shoot the bear?");

                                        System.out.println("Type yes or no");
                                        String choice11 = keyboard.nextLine();
                                        choice11.toLowerCase();

                                        while(!choice11.equals("yes") && !choice11.equals("no"))
                                        {
                                            System.out.println("Type yes or no");
                                            choice11 = keyboard.nextLine();
                                            choice11.toLowerCase();
                                        }

                                        if(choice11.equals("yes"))
                                        {
                                            System.out.println("You shoot the bear and it dies. You win!");
                                        }
                                        else
                                        {
                                            System.out.println("You don't shoot the bear and it eats you. You lose!");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You don't go in the house and the bear eats you. You lose!");
                                    }
                                }

                                else
                                {
                                    System.out.println("You hide in the bush and the bear finds you and eats you");
                                }

                            }
                            else
                            {
                                System.out.println("You try to hide but the bear finds you and eats you");
                            }
                            
                        }

                    }
                }
                    
                else
                {
                    System.out.println("You are trapped in the bathroom and can't find a way out you die of starvation");
                }
            }
        }
    }
}
