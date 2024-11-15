package com.example.crm.service

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.mapper.ActivityMapper
import com.example.crm.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityService {
    //atributos
    @Autowired
    lateinit var ActivityRepository: CustomerRepository

    //metodos
    fun getCustomer(): List<Activity> {
        return ActivityRepository.findAll()
    }

    fun save (ActivityDto: ActivityDto): Activity {
        val Activity = ActivityMapper.toEntity(ActivityDto)
        return ActivityRepository.save(Activity)
    }
}