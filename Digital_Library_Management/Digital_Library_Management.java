import java.util.*;

class Digital_Library_Management{
    HashMap<String,Integer> loginto = new HashMap<>();
    HashMap<Integer,String> map = new HashMap<>();
    public static String userID;
    public static int issues = 0;
    Scanner sc=new Scanner(System.in);


    public HashMap<Integer,String> book_database_server()
    {
        map.put(1,"How to make Friends and Influence people");
        map.put(2,"Atomic Habits");
        map.put(3,"101 essays that will change the way you think");
        map.put(4,"The power of your subconsious mind");
        map.put(5,"It starts with us");
        map.put(6,"It ends with us");
        map.put(7,"You are born to blossom");
        map.put(8,"Heart and soul");
        map.put(9,"Ikigai");
        map.put(10,"Rich dad poor dad");
        map.put(11,"Getting things done");
        map.put(12,"Laws of power");
        map.put(13,"Getting corporate");
        map.put(14,"Effective life management");
        map.put(15,"Tough times never last");
        map.put(16,"Three adventures of Sherlock Holmes");
        map.put(17,"The story of my life");
        map.put(18,"The subtle art of not giving a fuck");
        map.put(19,"The monk who sold his Ferrari");
        map.put(20,"Three men in a boat");
        map.put(21,"You've reached sam");
        map.put(22,"A daughters secret");
        map.put(23,"Dance while you can");
        map.put(24,"Harry potter");
        map.put(25,"Twisted");
        map.put(26,"The story of my life");
        map.put(27,"Wings of fire");
        map.put(28,"The Hound of Baskervile");
        map.put(29,"The Alchimest");
        map.put(30,"Tough times never last");
        return map;
    }

    public void homepage()
    {
        System.out.println("******************************************************");
        System.out.println("------- WELCOME TO DIGITAL LIBRARY MANAGEMENT -------");
        System.out.println("********************** HOMEPAGE **********************");
        System.out.println("Please Select a Option..." + "\n");
        System.out.println("1.>>> Admin Login >>>");
        System.out.println("2.>>> User Registration >>>");
        System.out.println("3.>>> User Login >>>");
        System.out.println("4.>>> Exit >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1:
                admin_login();
                break;
            case 2:
                register_user();
                break;
            case 3:
                user_login();
                break;
            case 4:
                System.out.print("\n" + "Do You want to Exit? (Y/N): ");
                String exit = sc.next();
                if(exit.equalsIgnoreCase("Y"))
                {
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "EXITING SUCCESSFULLY...!");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "Thank You!!! Please Visit Again...");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.exit(0);
                }
                else{
                    System.out.println("\n" + "Exiting Cancelled... You are still on the HomePage...");
                    homepage();
                }
                break;
            default:
                System.out.println("\n" + "Invalid Choice! Please Try again.");
                homepage();
                break;
        }
    }


    public void admin_login()
    {
        System.out.println("******************************************************");
        System.out.println("------------------- ADMIN LOGIN PAGE -------------------");
        System.out.println("******************************************************");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("Palak",210604);


        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFUL!");
            System.out.println("\n" + "--------------------------------------------------------");
            admin_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials!!! Please try again");
            admin_login();
        }
    }

    public void user_login()
    {
        System.out.println("******************************************************");
        System.out.println("-------------------- USER LOGIN PAGE -------------------");
        System.out.println("******************************************************");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();

        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            System.out.println("\n" + "--------------------------------------------------------");
            user_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials!!! Please try again");
            user_login();
        }
    }

    public String register_user() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        int password = scanner.nextInt();


        if (loginto.containsKey(username)) {
            System.out.println("Username already exists. Please enter a different username.");
            return null;
        }


        loginto.put(username, password);
        homepage();
        return username;

    }

    public void admin_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome Admin " + Digital_Library_Management.userID + "! ----");
        System.out.println("-------------------- ADMIN MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Add a New Book >>>");
        System.out.println("2.>>> Update a Existing Book >>>");
        System.out.println("3.>>> Delete a Existing Book >>>");
        System.out.println("4.>>> Go To User MainPage >>>");
        System.out.println("5.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1:
                map = add_new();
                admin_mainpage();
                break;
            case 2:
                map = upd_old();
                admin_mainpage();
                break;
            case 3:
                map = del_old();
                admin_mainpage();
                break;
            case 4:
                user_mainpage();
                break;
            case 5:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFUL");
                System.out.println("\n" + "--------------------------------------------------------");
                homepage();
                break;
            default:
                System.out.println("\n" + "Invalid Choice! Please Try again");
                admin_mainpage();
                break;
        }
    }

    public void user_mainpage()
    {
        System.out.println("******************************************************");
        System.out.println("----- Digital Library ---> Welcome User " + Digital_Library_Management.userID + "! -----");
        System.out.println("--------------------- USER MAINPAGE --------------------");
        System.out.println("******************************************************");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View any Book >>>");
        System.out.println("2.>>> Issue a Book >>>");
        System.out.println("3.>>> Return a Book >>>");
        System.out.println("4.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1:
                views();
                break;
            case 2:
                borrows();
                break;
            case 3:
                returns();
                break;
            case 4:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFUL");
                System.out.println("\n" + "--------------------------------------------------------");
                homepage();
                break;
            default:
                System.out.println("\n" + "Invalid Choice! Please Try again");
                user_mainpage();
                break;
        }
    }

    public HashMap<Integer,String> add_new()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------- ADD A NEW BOOK -------------------");
        System.out.print("Enter a New Book Number: ");
        int addbook = sc.nextInt();
        if(book_database_server().containsKey(addbook))
        {
            System.out.println("\n" + "This Book Number is already exists.Please try  another number...");
        }
        else if(addbook == 0 || addbook < 0)
        {
            System.out.println("\n" + "You can't assign Zero(0) or a Negative(-ve) number for a book...");
        }
        else{
            System.out.print("Enter New Book Details: ");
            String addbookdetails = scanner.nextLine();
            map.put(addbook,addbookdetails);
            System.out.println("\n" + "New Book added Successfully...");
            System.out.println("New Book No.:: " + addbook);
            System.out.println("New Book Name & Details:: " + map.get(addbook));
        }
        return map;
    }

    public HashMap<Integer,String> upd_old()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- UPDATE BOOK DETAILS ----------------");
        System.out.print("Enter a Book No. to Update its Details: ");
        int updbook = sc.nextInt();
        if(book_database_server().containsKey(updbook))
        {
            System.out.println("Backdated Book Name & Details:: " + map.get(updbook));
            System.out.print("Enter the Updated Book Details: ");
            String upbookdetails = scan.nextLine();
            book_database_server().replace(updbook,upbookdetails);
            System.out.println("\n" + "Book Details Updated Successfully...!");
            System.out.println("Book No.:: " + updbook);
            System .out.println("Updated Book Name & Details:: " + map.get(updbook));
        }
        else{
            System.out.println("\n" + "This Book Number is not Available...!");
        }
        return map;
    }

    public HashMap<Integer,String> del_old()
    {
        System.out.println("----------------- DELETE A BOOK DETAILS ----------------");
        System.out.print("Enter the Book Number, which you want to delete: ");
        int delbook = sc.nextInt();
        if(book_database_server().containsKey(delbook))
        {
            System.out.println("\n" + "Book Details You Want to Delete...>>>");
            System.out.println("Book No.:: " + delbook);
            System .out.println("Book Name:: " + map.get(delbook));
            System.out.print("\n" + "Do You want to Delete this Book? (Y/N): ");
            String delbookdetails = sc.next();
            if(delbookdetails.equalsIgnoreCase("Y"))
            {
                String returned_value = (String)map.remove(delbook);
                System.out.println("\n\"" + returned_value + "\" Book Details Deleted Successfully...");
            }
            else{
                System.out.println("\n" + "Book Deletion Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "This Book Number does not exist.");
        }
        return map;
    }

    public void views()
    {
        System.out.println("******************************************************");
        System.out.println("---------------------- VIEW BOOKS ----------------------");
        System.out.println("******************************************************");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View a Specific Book >>>");
        System.out.println("2.>>> View all Books >>>");
        System.out.println("3.>>> Back to MainPage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int dip=sc.nextInt();
        switch(dip){
            case 1:
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter Book Number: ");
                int books = sc.nextInt();
                if(book_database_server().containsKey(books))
                {
                    System.out.println("\n" + books + " ---> " + map.get(books));
                }
                else{
                    System.out.println("\n" + "This book no. is not available.Please Try Another.");
                }
                views();
                break;
            case 2:
                System.out.println("\n" + "All Available Books...>>>" + "\n");
                for(Map.Entry<Integer, String> entry : book_database_server().entrySet())
                {
                    int key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(key + " ---> " + value);
                }
                views();
                break;
            case 3:
                System.out.println("******************************************************");
                System.out.println("\n" + "REDIRECTING TO USER MAINPAGE..." + "\n");
                System.out.println("******************************************************");
                user_mainpage();
                break;
            default:
                System.out.println("\n" + "Invalid Choice! Please Try again.");
                views();
                break;
        }
    }

    public void borrows()
    {
        System.out.println("--------------------- ISSUE A BOOK ---------------------");
        System.out.print("Enter a Book Number which You want to Issue: ");
        int isbook = sc.nextInt();
        if(issues == 0 && isbook > 0 && book_database_server().containsKey(isbook))
        {
            issues = isbook;
            System.out.println("\n" + "Successfully Issued the Book...");
            System.out.println("Issued Book No.:: " + isbook);
            System .out.println("Issued Book Name & Details:: " + map.get(isbook));
        }
        else if(issues != 0)
        {
            System.out.println("\n" + "You have Already Issued a Book! To issue a new book please return the old one.");
        }
        else
        {
            System.out.println("\n" + "Invalid Book Number");
        }
        user_mainpage();
    }

    public void returns()
    {
        System.out.println("--------------------- RETURN A BOOK --------------------");
        if(book_database_server().containsKey(issues))
        {
            System.out.println("Issued Book Details...>>>");
            System.out.println("Book No.:: " + issues);
            System .out.println("Book Name:: " + map.get(issues));
            System.out.print("\n" + "Do You want to Return this Book? (Y/N): ");
            String rebook = sc.next();
            if(rebook.equalsIgnoreCase("Y"))
            {
                issues = 0;
                System.out.println("\n" + "Book Returned Successfully...");
            }
            else{
                System.out.println("\n" + "Book Return Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "You don't have any issued book.!!!");
        }
        user_mainpage();
    }

    public static void main(String args[]){
        Digital_Library_Management system_run = new Digital_Library_Management();
        system_run.homepage();
    }
}
