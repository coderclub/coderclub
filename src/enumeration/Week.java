package enumeration;

public class Week {
    Day day;
    public Week(){}
    public Week (Day day){
        this.day = day;
    }
    public void whatToDo(Day day){
        switch (day){
            case Saturday:
                System.out.println("class day 1");
                break;
            case Sunday:
                System.out.println("class day 2");
                break;
            case Monday:
                System.out.println("Group discussion");
                break;
            case Tuesday:
                System.out.println("Amar break");
                break;
            case Wednesday:
                System.out.println("Abar group discussion");
                break;
            case Thursday:
                System.out.println("Mentoring");
                break;
            case Friday:
                System.out.println("abar amar break");
                break;
                default:
                    System.out.println("Not a valid day");
                    break;
        }
    }

}
