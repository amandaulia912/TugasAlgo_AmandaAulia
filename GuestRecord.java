import java.util.Scanner;

public class GuestRecord {
    public static void main(String[] args) { 
        System.out.println("Tamu 1 :");
        EventOrganiser Tamu1 = new EventOrganiser("01","amanda","tegal","amanda@gmail.com","0856");
        Tamu1.PrintGuests();

        System.out.println("Tamu 2 : ");
        EventOrganiser Tamu2 = new EventOrganiser("02","najwa","surabaya","najwa@gmail.com","0857");
        Tamu2.PrintGuests();

        System.out.println("Tamu 3 :");
        EventOrganiser Tamu3 = new EventOrganiser("03","zahra","brebes","zahra@gmail.com","0855");
        Tamu3.PrintGuests();

        System.out.println("Tamu 4 :");
        EventOrganiser Tamu4 = new EventOrganiser("04","amel","jakarta","amel@gmail.com","0856");
        Tamu4.PrintGuests();

        System.out.println("Tamu 5 :");
        EventOrganiser Tamu5 = new EventOrganiser("05","rara","semarang","rara@gmail.com","0858");
        Tamu5.PrintGuests();

        System.out.println("Tamu 6 :");
        EventOrganiser Tamu6 = new EventOrganiser("06","ryan","solo","ryan@gmail.com","0856");
        Tamu6.PrintGuests();

        System.out.println("Tamu 7 :");
        EventOrganiser Tamu7 = new EventOrganiser("07","doni","jogja","doni@gmail.com","0854");
        Tamu6.PrintGuests();

        System.out.println("Tamu 8 :");
        EventOrganiser Tamu8 = new EventOrganiser("08","faiz","jakarta","faiz@gmail.com","0853");
        Tamu6.PrintGuests();

        System.out.println("Tamu 9 :");
        EventOrganiser Tamu9 = new EventOrganiser("09","gyan","malang","gyan@gmail.com","0859");
        Tamu6.PrintGuests();

        System.out.println("Tamu 10 :");
        EventOrganiser Tamu10 = new EventOrganiser("010","tora","bandung","tora@gmail.com","0855");
        Tamu6.PrintGuests();
    }
}

