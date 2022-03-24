package es.alvarorodriguez.criminalintent.presentacion

import androidx.lifecycle.ViewModel
import es.alvarorodriguez.criminalintent.data.model.Crime
import es.alvarorodriguez.criminalintent.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {

   private val crimeRepository = CrimeRepository.get()
   val crimeListLiveData = crimeRepository.getCrimes()

}