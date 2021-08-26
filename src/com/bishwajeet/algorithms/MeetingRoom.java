package com.bishwajeet.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingRoom {

    public int findMeetingRooms(List<Meeting> meetings) {
        Map<Integer, Integer> meetingRoomMap = new HashMap<>();
        int maxRooms = 0;
        for (Meeting meeting : meetings) {
            int start = meeting.start;
            while (start != meeting.end) {
                if (meetingRoomMap.containsKey(start)) {
                    meetingRoomMap.put(start, meetingRoomMap.get(start) + 1);
                } else {
                    meetingRoomMap.put(start, 1);
                }

                if (meetingRoomMap.get(start) > maxRooms) {
                    maxRooms = meetingRoomMap.get(start);
                }

                start++;
            }
        }
        return maxRooms;
    }

}

