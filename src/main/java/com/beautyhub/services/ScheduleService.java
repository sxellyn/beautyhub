package com.beautyhub.services;

import com.beautyhub.models.Schedule;
import com.beautyhub.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public Schedule updateSchedule(Long id, Schedule updatedSchedule) {
        return scheduleRepository.findById(id).map(schedule -> {
            schedule.setAppointmentDate(updatedSchedule.getAppointmentDate());
            schedule.setClient(updatedSchedule.getClient());
            schedule.setService(updatedSchedule.getService());
            return scheduleRepository.save(schedule);
        }).orElseGet(() -> {
            updatedSchedule.setId(id);
            return scheduleRepository.save(updatedSchedule);
        });
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
