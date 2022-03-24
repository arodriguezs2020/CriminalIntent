package es.alvarorodriguez.criminalintent.ui

import android.app.Application
import es.alvarorodriguez.criminalintent.repository.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}