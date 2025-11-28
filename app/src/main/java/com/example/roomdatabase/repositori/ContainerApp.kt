package com.example.roomdatabase.repositori

import android.app.Application
import android.content.Context
import com.example.roomdatabase.room.DatabaseSiswa

private var AplikasiSiswa.container: ContainerDataApp

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
        ContainerApp {
        override val repositoriSiswa: RepositoriSiswa by lazy {
            OfflineRepositoriSiswa(
                DatabaseSiswa.getDatabase(context).siswaDao())

        }
}

class AplikasiSiswa : Application() {
    lateinit var containerApp: ContainerApp


}