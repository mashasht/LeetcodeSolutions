import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MeetingRooms;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingRoomsTest {
    MeetingRooms meetingRooms;

    @BeforeEach
    void setUp(){
        meetingRooms = new MeetingRooms();
    }

    @Test
    void canAttendMeetings_twoMeetings_true(){
        assertTrue(meetingRooms.canAttendMeetings(new int[][]{new int[]{7,10}, new int[]{2,4}}));
    }
}
