class TeamRunner {

    public static void main(String[] args) {

        Team team = new Team();
		
		team.teamId=1;
		team.teamName="Vagen squad";
		

        Calendar calendar = new Calendar();

        Meeting meeting = new Meeting();

        meeting.title = "Project Discussion";
        meeting.date = "18-08-2026";
        meeting.startTime = "10:00 AM";
        meeting.endtime = "11:00 AM";
        meeting.duration = "1 Hour";
        meeting.isAllDayEvent = false;


        Invitee invitee = new Invitee();

        invitee.email = "varshini@gmail.com";
        invitee.name = "Varshini";
        invitee.phoneNo = 9876543210L;


        meeting.invitee = invitee;
		
		calendar.meeting = meeting;


        team.calendar = calendar;


        team.getTeaminfo();
    }
}