package com.example.busschedule.database.schedule
import androidx.room.PrimaryKey
import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.annotation.NonNull

@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
    @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
)
