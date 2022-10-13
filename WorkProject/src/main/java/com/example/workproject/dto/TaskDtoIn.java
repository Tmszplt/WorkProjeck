package com.example.workproject.dto;

import com.example.workproject.model.Message;
import com.example.workproject.model.Worker;
import lombok.Builder;
import lombok.Data;


import java.time.LocalDateTime;
@Data
@Builder
public class TaskDtoIn {


    private String title;
    private long messageId;
    private long executorId;
    private LocalDateTime finishDate;

}
