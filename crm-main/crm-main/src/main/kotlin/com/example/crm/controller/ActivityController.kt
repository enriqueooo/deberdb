package com.example.crm.controller

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.service.ActivityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activity")
class ActivityController {

    @Autowired
    lateinit var ActivityService: ActivityService

    @GetMapping
    fun getCustomer(): List<Activity> {
        return ActivityService.getCustomer()
    }

    @PostMapping
    fun save (@RequestBody @Valid activityDto: ActivityDto: ActivityDto): Activity {
        return ActivityService.save(activityDto)
    }

}


