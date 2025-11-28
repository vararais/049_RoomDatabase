package com.example.roomdatabase.room

import androidx.room.Database

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
data class DatabaseSiswa()
