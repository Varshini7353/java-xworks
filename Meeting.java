
class Meeting {

    String title;
    String date;
    String startTime;
    String endtime;
    String duration;
    boolean isAllDayEvent;

    Invitee invitee;

    public void printMeetingDetails() {

        System.out.println("Meeting details started");
        System.out.println("Title:" + title);
        System.out.println("Date:" + date);
        System.out.println("StartTime:" + startTime);
        System.out.println("Endtime:" + endtime);
        System.out.println("Duration:" + duration);
        System.out.println("isAllDayEvent:" + isAllDayEvent);
        System.out.println("Meeting details ended");

        invitee.getInviteeDetails();
    }
}
