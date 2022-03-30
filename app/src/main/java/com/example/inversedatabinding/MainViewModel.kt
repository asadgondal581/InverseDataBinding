package com.example.inversedatabinding

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val user = User("ali@email.com", "ali123", Gender.FEMALE, Cities.RAWALPINDI)
}