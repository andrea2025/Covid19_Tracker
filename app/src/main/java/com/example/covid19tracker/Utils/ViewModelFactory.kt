package com.example.covid19tracker.Utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.covid19tracker.Repository
import com.example.covid19tracker.TrackerViewModel

class ViewModelFactory(private val repository: Repository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(TrackerViewModel::class.java) -> {
                TrackerViewModel(this.repository) as T
            }
           else-> throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}