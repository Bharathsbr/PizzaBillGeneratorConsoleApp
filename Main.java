import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Welcome to XYZPizza!");
        Thread.sleep(1000);
        System.out.println("--------------------------------");
        Thread.sleep(1000);
        System.out.println("Would you like to order Veg or Non-veg ?");
        System.out.println("Enter Yes for Veg and No for Non-veg");
        String choice = scan.next();
        Thread.sleep(1000);
        boolean isVeg = true;
        int value = 4;
        while ((value != 1 && value != 2)) {
            if (choice.equals("Yes") || choice.equals("yes") || choice.equals("YES")) {
                isVeg = true;
                value = 1;
            } else if (choice.equals("No") || choice.equals("no") || choice.equals("NO")) {
                isVeg = false;
                value = 2;
            } else {
                value = 3;
                System.out.println("\nEnter Correct choice.");
                choice = scan.next();
            }
        }

        Thread.sleep(1000);
        System.out.println("\nWould you like to order Deluxe Pizza ?");
        System.out.println("(Deluxe Pizza comes with addons)\n");
        Thread.sleep(1000);
        System.out.println("Enter Yes for Deluxe Pizza and No for non-deluxe");
        String isdeluxe = scan.next();
        Thread.sleep(1000);
        if (isdeluxe.equals("No") || isdeluxe.equals("NO") || isdeluxe.equals("no")) {
            Pizza p = new Pizza(isVeg);
            Thread.sleep(1000);
            System.out.println("\nWould you like extra cheese ?");
            String cheese = scan.next();
            int flag=0;
            while(flag!=1 && flag!=2) {
                if (cheese.equals("Yes") || cheese.equals("yes") || cheese.equals("YES")) {
                    p.extraCheese();
                    flag = 1;
                } else if (cheese.equals("No") || cheese.equals("NO") || cheese.equals("no")) {
                    flag = 2;
                } else {
                    flag = 3;
                    System.out.println("\nEnter Correct choice.");
                    cheese = scan.next();
                }
            }
            Thread.sleep(1000);
            System.out.println("\nWould you like extra toppings ?");
            String top = scan.next();
            flag=0;
            while(flag!=1 && flag!=2) {
                if (top.equals("Yes") || top.equals("yes") || top.equals("YES")) {
                    p.extraToppings();
                    flag = 1;
                } else if (top.equals("No") || top.equals("NO") || top.equals("no")) {
                    flag = 2;
                } else {
                    flag = 3;
                    System.out.println("\nEnter Correct choice.");
                    top = scan.next();
                }
            }

            Thread.sleep(1000);
            System.out.println("\nWould you like to takehome ?");
            String takeHome = scan.next();
            flag=0;
            while(flag!=1 && flag!=2) {
                if (takeHome.equals("Yes") || takeHome.equals("yes") || takeHome.equals("YES")) {
                    Thread.sleep(1000);
                    p.takeAway();
                    flag = 1;
                } else if (takeHome.equals("No") || takeHome.equals("NO") || takeHome.equals("no")) {
                    flag = 2;
                } else {
                    flag = 3;
                    System.out.println("\nEnter Correct choice.");
                    takeHome = scan.next();
                }
            }
            Thread.sleep(1000);
            p.getBill();

        }
        else if (isdeluxe.equals("Yes") || isdeluxe.equals("YES") || isdeluxe.equals("yes")){
            DeluxePizza deluxePizza=new DeluxePizza(isVeg);
            Thread.sleep(1000);
            System.out.println("\nWould you like to takehome ?");
            String takeHome = scan.next();
            int flag=4;
            flag=0;
            while(flag!=1 && flag!=2) {
                if (takeHome.equals("Yes") || takeHome.equals("yes") || takeHome.equals("YES")) {
                    deluxePizza.takeAway();
                    flag = 1;
                } else if (takeHome.equals("No") || takeHome.equals("NO") || takeHome.equals("no")) {
                    flag = 2;
                } else {
                    flag = 3;
                    System.out.println("\nEnter Correct choice.");
                    takeHome = scan.next();
                }
            }
            Thread.sleep(1000);
            deluxePizza.getBill();

        }

        else {
            System.out.println("\nEnter Correct choice.");
        }

    }
}