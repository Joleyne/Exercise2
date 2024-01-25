//Joleyne Hernandez CSCI1660
public class Main {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday"};
        int highTemp[] = {45, 29, 10, 22, 41, 28, 33};
        int preCipitation[] = {95,  60, 25, 5, 0, 75, 90};
        for (int i = 0; i <= highTemp.length; i++) {
            if(highTemp[i]<=32 && preCipitation[i] >= 50) {
                System.out.println("On " + weekDays[i] + " it will be " + highTemp[i] + " degrees. There is a "+ preCipitation[i] + "% chance of snowing.");
            }

        }
    }
}
